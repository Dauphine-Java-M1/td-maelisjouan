package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;

public class PanelIterator implements Iterator<Integer>{

	private int[] table;
	private int index;
	
	public PanelIterator(int a, int b){
		index = 0;
		table = new int[b-a+1];
		for(int i=0 ; i<table.length; i++){
			table[i] = i+a;
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
