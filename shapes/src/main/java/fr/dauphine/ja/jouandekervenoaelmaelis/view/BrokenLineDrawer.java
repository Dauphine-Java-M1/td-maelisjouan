package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import java.awt.Graphics;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.BrokenLine;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Point;

public class BrokenLineDrawer implements Drawer{

	private BrokenLine br;
	
	public BrokenLineDrawer(BrokenLine br){
		this.br = br;
	}
	
	@Override
	public void drawShape(Graphics g) {
		// TODO Auto-generated method stub
		int size = br.nbPoints();
		if(size >= 1){
			Point p0 = br.get(0);
			if(size == 1){
				Drawer d0 = new PointDrawer(p0);
				p0.setDrawer(d0);
				d0.drawShape(g);
			}
			else{
				for(int i=1 ; i<size ; i++){
					int x0 = (int) p0.getX();
					int y0 = (int) p0.getY();
					
					Point p1 = br.get(i);
					int x1 = (int) p1.getX();
					int y1 = (int) p1.getY();
					
					g.drawLine(x0, y0, x1, y1);
					
					p0 = new Point(p1);
				}
				
			}
		}
	}
	
	
}
