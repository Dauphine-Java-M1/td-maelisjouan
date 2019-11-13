package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;

/**
 * A Panel object is an Iterable interval
 */
public class Panel{
	
	private int leftbound;
	private int rightbound;
	
	private int[] table;
	
	
	public Panel(int lb, int rb) throws IllegalArgumentException{
		if (lb > rb)
		       throw new IllegalArgumentException("the right bound of an interval is supposed to be greater or equal to its left bound");
		
		this.leftbound = lb;
		this.rightbound = rb;
	}
	
	public void filltable(){  // fill table with the values from the leftbound to the rightbound (both included)
		table = new int[this.rightbound-this.leftbound+1];
		for(int i=0 ; i<table.length; i++){
			table[i] = i+this.leftbound;
		}
	}
	
	
	public static Iterator<Integer> panel1(Panel p){
		p.filltable();
		return new PanelIterator(p.table);
	}
	
	
	public static void main(String[] args){
	
		Panel p = new Panel(1, 5);
        Iterator<Integer> it = panel1(p);
        for(;it.hasNext();){
        	System.out.println(it.next());  // display 1 2 3 4 5
        }
    }
}
