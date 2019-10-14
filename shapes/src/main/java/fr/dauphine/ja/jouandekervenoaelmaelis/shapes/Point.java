package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.ArrayList;

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
	
	public boolean isSameAs(Point p){
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o){
		if (! (o instanceof Point))
			return false;
		Point p = (Point) o;
		return this.isSameAs(p);
	}
	
	
    public static void main( String[] args )
    {
    	Point p1 = new Point(1.0, 2.0);
    	Point p2 = p1;
    	Point p3 = new Point(1.0, 2.0);
    	
    	System.out.println(count);
    	System.out.println(p1==p2);
    	System.out.println(p1==p3);
    	System.out.println(p1.isSameAs(p3));
    	
    	ArrayList<Point> list = new ArrayList<>();
    	list.add(p1);
    	System.out.println(list.indexOf(p2));
    	System.out.println(list.indexOf(p3));
    	
    	BrokenLine b = new BrokenLine(3);
    	b.add(p1);
    	b.add(null);
    	System.out.println(b);
    	System.out.println(b.pointCapacity());
    	System.out.println(b.nbPoints());
    	System.out.println(b.contains(null));
    }
}
