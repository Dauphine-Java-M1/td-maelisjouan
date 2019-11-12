package fr.dauphine.ja.jouandekervenoaelmaelis.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.BrokenLine;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Circle;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Point;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Ring;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Shape;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.World;

public class MouseController implements MouseMotionListener{

	private World world;  // in order to have shapes
	
	public MouseController(World w){
		super();
		this.world = w;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		for(Shape s : world.shapes){
			//System.out.println("x : " + e.getX() + " y : " + e.getY());
			/*if(s instanceof Circle){
				Point p = new Point(e.getX(), e.getY());
				Circle c = (Circle) s;
				System.out.println(p.toString() + c.getCenter() + c.getRadius());
				System.out.println(s.contains(p));
			}*/
			/*if(s instanceof BrokenLine){
				Point p = new Point(e.getX(), e.getY());
				BrokenLine b = (BrokenLine) s;
				System.out.println("point : " + p.toString() + " brokenline : " + b.toString() + " cont : " + s.contains(p));
			}*/
			/*if(s instanceof Point){
				Point p = new Point(e.getX(), e.getY());
				Point p2 = (Point) s;
				System.out.println("point : " + p.toString() + " point 2 : " + p2.toString() + " " + s.contains(p));
			}*/
			/*if(s instanceof Ring){
				Point p = new Point(e.getX(), e.getY());
				Ring r = (Ring) s;
				System.out.println("point : " + p.toString() + " ring : " + r.toString() + " " + s.contains(p));
			}*/
			
			Point p = new Point(e.getX(), e.getY());
			if(s.contains(p)){
				s.translate(p);
				world.changeWorld();
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getLocationOnScreen());
		
	}

}
