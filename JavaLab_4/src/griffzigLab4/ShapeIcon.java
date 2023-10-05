package griffzigLab4;

import javax.swing.*;
import java.awt.*;

// Designates a shape

public abstract class ShapeIcon implements Icon, Measurable {

	private int width;
	private int height;
	
	// Constructor
	public ShapeIcon(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	
	// Getter for width
	@Override
	public int getIconWidth() {
		
		return width;
	}
	
	// Getter for height
	@Override
	public int getIconHeight() {
		return height;
	}
}
