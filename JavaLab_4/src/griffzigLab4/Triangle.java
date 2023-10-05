package griffzigLab4;

import java.awt.*;

// subclass representing a Triangle

public class Triangle extends ShapeIcon {

	public Triangle(int base, int height) {
		super(base, height);
	}
	
	// Calculate area of a Triangle
	@Override
	public double measure() {
		// areaTriangle = (1/2) * base * height
		return 0.5 * getIconWidth() * getIconHeight();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		
	}
}
