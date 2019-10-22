package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import java.awt.Graphics;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Circle;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Ring;

public class RingDrawer implements Drawer{

	private Ring ring;
	
	public RingDrawer(Ring rg){
		this.ring = rg;
	}
	
	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(ring.getCirc());
		Circle c2 = new Circle(c1.getCenter(), ring.getInternRadius());
		
		Drawer d1 = new CircleDrawer(c1);
		d1.drawShape(g);
		
		Drawer d2 = new CircleDrawer(c2);
		d2.drawShape(g);
	}

}
