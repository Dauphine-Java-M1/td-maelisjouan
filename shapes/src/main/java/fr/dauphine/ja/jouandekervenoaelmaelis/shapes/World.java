package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import java.util.Observable;
import java.util.ArrayList;


public class World extends Observable{
	public ArrayList<Shape> shapes;
	
	public World(){
		shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape s){
		shapes.add(s);
	}
	
	public void changeWorld(){
		
		notifyObservers();
	}
}
