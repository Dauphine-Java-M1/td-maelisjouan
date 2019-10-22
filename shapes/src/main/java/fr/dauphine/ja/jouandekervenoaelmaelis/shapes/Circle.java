package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import fr.dauphine.ja.jouandekervenoaelmaelis.view.CircleDrawer;

public class Circle extends Shape{

	private Point center;
	private double radius;
	
	public Circle(){
		center = new Point();
		radius = 1.0;
	}
	
	public Circle(Point center, double radius){
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Circle c){
		this.center = c.getCenter();
		this.radius = c.getRadius();
	}
	
	@Override
	public String toString(){
		return ("center : " + this.center + ", radius : " + this.radius + ", surface : " + this.surface());
	}
	
	@Override
	public boolean equals(Object o){
		if (!(o instanceof Circle))
			return false;
		Circle c = (Circle) o;
		return this.radius == c.radius && this.center.equals(c.getCenter()) ;
	}
	
	public Circle translate(double dx, double dy){
		return new Circle(this.center.translate(dx, dy), this.radius);
	}
	
	public Point getCenter(){	
		return this.center;
	}
	
	public void setCenter(Point center){
		this.center = center;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double rad){
		this.radius = rad;
	}
	
	public double surface(){
		return Math.PI*this.radius*this.radius;
	}
	
	public boolean contains(Point p){
		if (this.center.equals(p))
			return true;
		double x = this.center.getX();
		double xp = p.getX();
		double y = this.center.getY();
		double yp = p.getY();
		return (((xp-x)*(xp-x) + (yp-y)*(yp-y)) <= this.radius);
	}
	
	public static boolean contains(Point p, Circle...circles){
		for(Circle c : circles){
			if(c.contains(p)){
				return true;
			}
		}
		return false;
	}
}
