package griffzigLab4;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

// subclass representing a Rectangle

/*
 * Question: Since measure() in this class doesn't override the superclass's method, I 
 * don't need to provide @Override right? google says it is a good practice, but can you 
 * help me understand why? Thank you very much!
 */

public class Rectangle extends ShapeIcon {

	// constructor
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	// Calculate area of a Rectangle
	public double measure() {
		// areaRectangle = w * h
		return getIconWidth() * getIconHeight();
	}

	// draw the Rectangle
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// draw the Rectangle
		g.setColor(Color.GREEN);
		g.drawRect(x,  y,  getIconWidth(),  getIconHeight());
	}	
}
