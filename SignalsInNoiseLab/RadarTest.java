
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Tests multiple cases.
     * 
     * Invoke the setMonsterLocation method in the Radar class to explicitly set the monster’s
     *      location for the purpose of the unit test. Unlike other unit tests that we have
     *      written, don’t test each method of the Radar class individually. Instead, have a
     *      single method in the test class that tests the Radar class as a whole (create a
     *      Radar object, set the monster location (setMonsterLocation), perform a bunch of scans,
     *      get the location of the monster (findMonster), assert that the row and column match).
     *      Since the Location class doesn’t support the equals method, you have to test the row
     *      and column individually with the assertEquals method.
     */
    @Test
    public void testRadar()
    {
        // test that the Radar class successfully finds the location of the monster after several scans
        int col = 5;
        int row = 10;
        Radar r =new Radar(100,100);
        Location mons = new Location(row,col);
        r.setMonsterLocation(mons);
        for(int i = 0; i < 100; i++)
        {

            r.scan();
        }
        Location find = r.findMonster();

        assertEquals(find.getRow(),row);

        assertEquals(find.getCol(),col);

        col = 75;
        row = 50;

        r =new Radar(100,100);
        mons = new Location(row,col);
        r.setMonsterLocation(mons);
        for(int i = 0; i < 100; i++)
        {

            r.scan();
        }
        find = r.findMonster();

        assertEquals(find.getRow(),row);

        assertEquals(find.getCol(),col);
    }

    /**
     * Verifies that false negatives are produced.
     * 
     * Verify that the monster’s location is sometime a false negative by checking that the
     *      accumulator for the monster location is less than the number of scans after a
     *      substantial number of scans. 
     */
    @Test
    public void testFalseNegative()
    {
        int col = 5;
        int row = 10;
        Radar r =new Radar(100,100);
        Location mons = new Location(row,col);
        for(int i = 0; i < 100; i++)
        {

            r.scan();
        }
        int triggers = r.getAccumulatedDetection(mons);

        assertTrue(triggers<100);
    }
}
