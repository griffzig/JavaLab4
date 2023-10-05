package griffzigLab4;

import javax.swing.*;
import java.awt.*;
import java.util.*;

// display the array of ShapeIcons

public class SizePanel extends JPanel {
	// class variable for ShapeIcons array
	private ShapeIcon[] shapes;
	
	// constructor
	public SizePanel(ShapeIcon[] shapes) {
		this.shapes = shapes;
		
		// sort the array from highest to lowest
		Arrays.sort(shapes, Collections.reverseOrder());
	}

	// compare shape sizes and draw
	@Override
	public void paintComponent(Graphics g) {
		// call the paintComponent method
		super.paintComponent(g);
		
		// set position
		int x = 20;
		int y = 20;
		
		for (Measurable shape : shapes) {
			ShapeIcon shapeIcon = (ShapeIcon) shape;
			shapeIcon.paintIcon(this, g, x, y);
		}
	}
}
