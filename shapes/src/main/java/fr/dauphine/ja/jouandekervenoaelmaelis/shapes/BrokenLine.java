package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.LinkedList;

public class BrokenLine extends Shape{

	private LinkedList<Point> list;
	
	
	public BrokenLine(){
		list = new LinkedList();
	}
	
	public BrokenLine translate(double dx, double dy){
		BrokenLine bl = new BrokenLine();
		for(Point p : list){
			bl.add(p.translate(dx, dy));
		}
		return bl;
	}
	
	public void translate(Point p){
		
	}
	
	@Override
	public String toString(){
		return list.toString();
	}
	
	public boolean add(Point p){
		return list.add(p);
	}
	
	public Point get(int index){
		return list.get(index);
	}
	
	public boolean contains(Point p){
		
		if(list.contains(p))
			return true;
		
		double eps = 10;  // area around the BrokenLine where we consider that p belongs to this BrokenLine
		
		for(int i=0 ; i<list.size()-1 ; i++){  // testing whether p belongs to one of the lines between two consecutive points
			Point p1 = list.get(i);
			Point p2 = list.get(i+1);
			
			double a = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());  // slope of the line formed by p1 and p2
			double b = p1.getY()-a*p1.getX();  // intercept of the line formed by p1 and p2
			
			if(Math.abs(a*p.getX()+b - p.getY()) < eps){//System.out.println(p1.toString() + p2.toString());
				return true;
			}
		}
		return false;
	}
	
	public int nbPoints(){
		return list.size();
	}
}
