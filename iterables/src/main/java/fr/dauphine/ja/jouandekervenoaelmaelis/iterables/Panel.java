package fr.dauphine.ja.jouandekervenoaelmaelis.iterables;

import java.util.Iterator;

/**
 * A Panel object is an Iterable interval
 */
public class Panel implements Iterable<Integer>{
	
	private int leftbound;
	private int rightbound;
	
	
	public Panel(int lb, int rb) throws IllegalArgumentException{
		if (lb > rb)
		       throw new IllegalArgumentException("the right bound of an interval is supposed to be greater or equal to its left bound");
		
		this.leftbound = lb;
		this.rightbound = rb;
	}
	
	
	public static Iterator<Integer> panel1(Panel p){
		//return new PanelIterator(p.leftbound, p.rightbound);
		
		return new Iterator<Integer>(){  // classe anonyme

			private int index = p.leftbound;
			
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<=p.rightbound;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return index++;
			}
		};
		
	}	
	
	public static Iterable<Integer> panel2(Panel p){
		return p;
	}
	
	
	
	public static void main(String[] args){
	
		Panel p = new Panel(1, 5);
		/*Iterator<Integer> it = panel1(p);
        
        for(;it.hasNext();){
        	System.out.println(it.next());  // display 1 2 3 4 5
        }*/
        
        for(int i:panel2(p)){
        	System.out.println(i);  // display 1 2 3 4 5
        }
        
    }

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new PanelIterator(this.leftbound, this.rightbound);
	}
}
