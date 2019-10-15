package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.LinkedList;

public class BrokenLine extends LinkedList<Point>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1321468283894529908L;

	public BrokenLine(){
		super();
	}
	
	public int nbPoints(){
		return super.size();
	}
}
