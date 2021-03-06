package fr.dauphine.ja.jouandekervenoaelmaelis.shapes;

import fr.dauphine.ja.jouandekervenoaelmaelis.view.Drawer;

//abstract class because even if we don't know the exact shape of an object it still is a shape.
public abstract class Shape {
	
	private Drawer drawer;

	public Drawer getDrawer() {
		return drawer;
	}

	public void setDrawer(Drawer drawer) {
		this.drawer = drawer;
	}
	
	public abstract boolean contains(Point p);
	
	public abstract void translate(Point p);
}
