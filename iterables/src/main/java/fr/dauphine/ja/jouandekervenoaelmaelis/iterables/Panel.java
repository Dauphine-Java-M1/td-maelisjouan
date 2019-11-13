package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;

/**
 *
 */
public class Panel{
	
	public static Iterator<Integer> panel1(int a, int b){
		if(a>b){
			return panel1(b,a);
		}
		return new PanelIterator(a,b);
	}
	
	
	public static void main( String[] args ){
	
        Iterator<Integer> it = panel1(1,5);
        for(;it.hasNext();){
        	System.out.println(it.next());
        }
    }
}
