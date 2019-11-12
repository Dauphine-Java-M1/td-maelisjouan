package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.lang.IllegalArgumentException;

public class Ring extends Shape {
	
	private Circle circ;
	private double internRadius;
	
	public Ring(){
		this.circ = new Circle();
		this.internRadius = 0;
	}
	
	public Ring(Point center, double radius, double internRadius) throws IllegalArgumentException{
		if (internRadius > radius)
		       throw new IllegalArgumentException("intern radius should be less than the radius");
		this.circ = new Circle(center, radius);
		this.internRadius = internRadius;
	}
	
	public Ring translate(double dx, double dy){
		Circle c = this.circ.translate(dx, dy);
		return new Ring(c.getCenter(), c.getRadius(), this.internRadius);
	}
	
	public void translate(Point p){
		this.circ.translate(p);
	}
	
	@Override
	public boolean equals(Object o){
		if (! (o instanceof Ring))
			return false;
		Ring r = (Ring) o;
		return this.internRadius == r.internRadius && this.circ.equals(r.circ);
	}
	
	@Override
	public String toString(){
		return "center : " + this.circ.getCenter() + ", radius : " + this.circ.getRadius() + ", intern radius : " + this.internRadius;
	}
	
	public boolean contains(Point p){
		if (! (this.circ.contains(p)))
			return false;
		
		Circle c = new Circle(this.circ.getCenter(), this.internRadius);
		if(! (c.contains(p))){
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p, Ring...rings){
		for(Ring r : rings){
			if(r.contains(p))
				return true;
		}
		return false;
	}

	public Circle getCirc() {
		return this.circ;
	}
	
	public double getInternRadius(){
		return this.internRadius;
	}
}
