package fr.dauphine.ja.jouandekervenoaelmaelis.view;

import java.awt.Graphics;

//interface because we cannot draw shapes that we don't know
public interface Drawer {
	
	public void drawShape(Graphics g);
}
