package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

/**
 * TD1
 * class Point
 *
 */
public class Point
{
	private double x;
	private double y;
	private static int count;
		
	public Point(){
		this.x = 0.0;
		this.y = 0.0;
		count++;
	}

	public Point(double x, double y){
		this.x = x;
		this.y = y;
		count++;
	}
	
	
	/**
	 * Getter for x
	 * @return the value of x for a given Point
	 */
	public double getX(){
		return(this.x);
	}
	
	/**
	 * Getter for y
	 * @return the value of y for a given Point
	 */
	public double getY(){
		return(this.y);
	}
	
	/**
	 * Copy of the Point p
	 * @param p
	 */
	public Point(Point p){
		this.x = p.getX();
		this.y = p.getY();
	}
	
	@Override
	public String toString() {
		return ("("+this.x+", "+this.y+")");
	}
	
    public static void main( String[] args )
    {
    	Point p = new Point();
    	Point p1 = new Point(1.0, 0.3);
    	System.out.println(p);
    	System.out.println(p1);
    	System.out.println(count);
    }
}
