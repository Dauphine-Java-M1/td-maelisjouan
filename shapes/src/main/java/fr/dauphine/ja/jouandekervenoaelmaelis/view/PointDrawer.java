package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import java.awt.Graphics;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Point;

public class PointDrawer implements Drawer{

	private Point p;
	
	public PointDrawer(){
		p = new Point();
	}
	
	public PointDrawer(Point point){
		p=point;
	}
	
	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		int x = (int) p.getX();
		int y = (int) p.getY();
		g.drawLine(x-6, y, x+6, y);
		g.drawLine(x, y-6, x, y+6);
	}
	
	public String toString(){
		return this.p.toString();
	}
	
}
