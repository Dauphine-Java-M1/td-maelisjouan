package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.World;
import fr.dauphine.ja.jouandekervenoaelmaelis.controller.MouseController;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.BrokenLine;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Circle;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Point;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Ring;
import fr.dauphine.ja.jouandekervenoaelmaelis.shapes.Shape;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Graphics;

import java.util.Observable;
import java.util.Observer;

public class MyDisplay extends JPanel implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6077705854288643042L;
	private World world;
	
	public MyDisplay(){
		super();
	}
	
	public MyDisplay(World w){
		super();
		this.world = w;
	}
	
	@Override //JPanel
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Shape s : world.shapes){
			s.getDrawer().drawShape(g);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	public static void main(String[] args) {
		World world = new World();
		MyDisplay d = new MyDisplay(world);
		
		Point p = new Point(234.0, 40.0);
		Point pp = new Point(125.0, 140.0);
		
		Point p1 = new Point(160.0, 230.0);
		Point p2 = new Point(361.0, 210.0);
		Point p3 = new Point(423.0, 77.0);
		Point p4 = new Point(700.0, 369.0);
		Point p5 = new Point(360.0, 496.0);
		
		
		Drawer dr1 = new PointDrawer(p);
		p.setDrawer(dr1);
		
		BrokenLine bl1 = new BrokenLine();
		bl1.add(pp);
		Drawer dr2 = new BrokenLineDrawer(bl1);
		bl1.setDrawer(dr2);
		
		BrokenLine bl2 = new BrokenLine();
		bl2.add(p1);
		bl2.add(p2);
		bl2.add(p3);
		bl2.add(p4);
		bl2.add(p5);
		Drawer dr3 = new BrokenLineDrawer(bl2);
		bl2.setDrawer(dr3);
		
		Circle c1 = new Circle(p1, 150);
		Drawer dr4 = new CircleDrawer(c1);
		c1.setDrawer(dr4);
		
		Circle c2 = new Circle(p2, 50);
		Drawer dr5 = new CircleDrawer(c2);
		c2.setDrawer(dr5);
		
		Ring rg = new Ring(p3, 66.0, 45.0);
		Drawer dr6 = new RingDrawer(rg);
		rg.setDrawer(dr6);
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(900, 900));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens when the frame is closed 
		frame.addMouseMotionListener(new MouseController(world)); // link with MouseController
		
		world.addObserver(d);
		
		world.add(p);
		world.add(bl1); // this BrokenLine is a point but is not considered as a Point
		world.add(bl2);
		world.add(c1);
		world.add(c2);
		world.add(rg);
		
		System.out.println(d);
		frame.add(d);
		
		
		
	}
}
