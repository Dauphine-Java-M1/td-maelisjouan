package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class BrokenLine extends Shape{

	private LinkedList<Point> list;
	
	
	public BrokenLine(){
		list = new LinkedList();
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
		return list.contains(p);
	}
	
	public int nbPoints(){
		return list.size();
	}
}
