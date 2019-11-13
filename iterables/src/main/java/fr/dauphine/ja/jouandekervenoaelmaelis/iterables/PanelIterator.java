package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;


/**
 * Iterator that iterates on a table of integer (from the beginning to the end of the table)
 *
 */
public class PanelIterator implements Iterator<Integer>{

	private int index;
	private int[] table;
	
	public PanelIterator(int[] table){
		index = 0;
		this.table = table;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<table.length;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		int i = table[index];
		index++;
		return i;
	}

}
