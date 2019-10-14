package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.LinkedList;

public class BrokenLine {
	
	private LinkedList<Point> table;

	
	public BrokenLine(){
		table = new LinkedList();
	}
	
	public LinkedList <Point> getTable(){
		return this.table;
	}
	
	
	/**
	 * 
	 * @param p
	 */
	public void add(Point p){
		table.add(p);
	}
	

	
	public boolean contains(Point p){
		return table.contains(p);
	}
	
	@Override
	public String toString(){
		String s = "";
		for(Point pt : this.table){
			if (pt != null)
				s+=pt.toString() + " ";
		}
		return s;
	}
}
