package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

public class BrokenLine {
	
	private int size;
	private Point table[];
	private int index;

	
	public BrokenLine(int size){
		this.size = size;
		this.table = new Point[this.size];
		this.index = 0;
	}
	
	public Point[] getTable(){
		return this.table;
	}
	
	public int getSize(){
		return this.size;
	}
	
	
	/**
	 * Add a point to a BrokenLine
	 * @param p
	 * @return -1 when the table is full, 0 otherwise.
	 */
	public int add(Point p){
		if (this.index > this.size)
			return -1;
		this.table[index] = p;
		this.index = this.index+1;
		return 0;
	}
	
	
	/**
	 * 
	 * @return the number of points that can be added to the BrokenLine
	 */
	public int pointCapacity(){
		return this.size-this.index;
	}
	
	/**
	 * 
	 * @return the number of points on the BrokenLine
	 */
	public int nbPoints(){
		return this.index;
	}
	
	public boolean contains(Point p){
		for(Point pt : this.table){
			if(pt.equals(p))
				return true;
		}
		return false;
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
