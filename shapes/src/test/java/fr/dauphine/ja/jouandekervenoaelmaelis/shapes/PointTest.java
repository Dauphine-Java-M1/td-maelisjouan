package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PointTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PointTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PointTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPoint()
    {
        assertTrue( true );
    }
    
    public static void main( String[] args )
    {
    	Point p = new Point();
    	System.out.println(p.getX()+ "" + p.getY());
    }
    
}
