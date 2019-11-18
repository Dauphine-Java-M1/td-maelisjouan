package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;


/**
 * Iterator that iterates on a table of integer (from the beginning to the end of the table)
 *
 */
public class PanelIterator implements Iterator<Integer>{

	private int index;
	private int ub;
	
	public PanelIterator(int lb, int ub){
		index = lb;
		this.ub = ub;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<=this.ub;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return index++;
	}

}
