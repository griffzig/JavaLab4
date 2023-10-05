package griffzigLab4;

import javax.swing.*;
import java.awt.*;

// subclass representing a Circle

public class Circle extends ShapeIcon {
	
	// declare class variable for radius
	private double radius;
	
	public Circle(int diameter) {
		// call the constructor of the superclass, ShapeIcon
		super(diameter, diameter);
		this.radius = diameter / 2; // half the diameter to get radius
	}
		
	
	// calculate area of the Circle
	@Override
	public double measure() {
		// areaCircle = PI * r^2
		return Math.PI * Math.pow(radius, 2);
	}

	// draw the Circle
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// fillOval() to draw Circle
		g.setColor(Color.RED);
		g.fillOval(x, y, getIconWidth(), getIconHeight());
	}


}
