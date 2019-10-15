package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.LinkedList;

public class BrokenLine extends LinkedList<Point>{
	
	public BrokenLine(){
		super();
	}
	
	public int nbPoints(){
		return super.size();
	}
}
