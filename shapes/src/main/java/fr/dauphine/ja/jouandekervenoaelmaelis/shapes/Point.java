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
	
	/*
	public void translate(Point dx, Point dy){
		double x1 = dx.getX();
		double x2 = dy.getX();
		double y1 = dx.getY();
		double y2 = dy.getY();
		this.x += x2-x1;
		this.y += y2-y1;
	}*/
	
	public Point translate(double dx, double dy){
		
		return new Point(this.x+dx, this.y+dy);
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
    	
    	BrokenLine b = new BrokenLine();
    	b.add(p1);
    	b.add(p3);
    	System.out.println(b.contains(p3));
    	System.out.println(b.nbPoints());
    	System.out.println(b);
    	
    	System.out.println(p1.translate(2.0, 3.0));
    	
    	Circle c = new Circle(p3, 2.0);
    	Circle c2 = new Circle(p3, 3.0);
    			
    	c2 = c2.translate(2.0, 3.0);
    	System.out.println(c + " " + c2);
    	
    	c.setCenter(c.getCenter().translate(2.0, 3.0));
    	System.out.println(c);
    	
    	Circle c1 = new Circle();
    	double n1 = Math.floor(100000*Math.sqrt(2)/2)/100000;
    	double n2 = Math.ceil(100000*Math.sqrt(2)/2)/100000;
    	System.out.println(n1 + " " + n2);
    	System.out.println(c1.contains(new Point(n1, n1)));
    	System.out.println(c1.contains(new Point(n2, n2)));
    	Circle[] circles = {c2, c1};
    	System.out.println(Circle.contains(new Point(n1, n1), circles));
    	circles[1] = c;
    	System.out.println(Circle.contains(new Point(n1, n1), circles));
    	
    	Ring r = new Ring(new Point(), 1.0, 0.5);
    	Ring r1 = new Ring(new Point(), 1.0, 0.5);
    	System.out.println(r.equals(r1));
    	System.out.println(r);
    	System.out.println(r.contains(new Point(n1, n1)));
    }
}
