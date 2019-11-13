package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;


/**
 * Iterator for a Panel object
 *
 */
public class PanelIterator implements Iterator<Integer>{

	private int[] table;
	private int index;
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public PanelIterator(int a, int b){
		index = 0;
		try{
			table = new int[b-a+1];
		
			for(int i=0 ; i<table.length; i++){
				table[i] = i+a;
			}
		}catch(NegativeArraySizeException e){
			throw new NegativeArraySizeException("PanelIterator was constructed for a Panel object ie such that a<b");
			
		}
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
