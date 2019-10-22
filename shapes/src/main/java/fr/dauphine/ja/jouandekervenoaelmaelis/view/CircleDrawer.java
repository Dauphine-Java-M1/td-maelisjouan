package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Circle;

import java.awt.Graphics;

public class CircleDrawer implements Drawer{

	private Circle circ;
	
	public CircleDrawer(Circle c){
		this.circ = c;
	}
	
	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		int rad = (int) circ.getRadius();
		g.drawOval((int) circ.getCenter().getX() - rad, (int) circ.getCenter().getY() - rad, 2*rad, 2*rad);
	}
}
