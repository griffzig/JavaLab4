package griffzigLab4;

import javax.swing.*;
import java.awt.*;

public class Main {
	
	public static Measurable maximum(Measurable[] m) {
		Measurable max = m[0];
		
		// compare shape sizes 
		for (int i = 1; i < m.length; i++) {
			if (m[i].measure() > max.measure()) {
				// if the current element is larger, update
				max = m[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// array of Measurable objects
		Measurable[] shapes = {
				new Rectangle(5, 10),
				new Circle(15),
				new Triangle(20, 25)
				
		};
		
		/*
		 * SizePanel
		 */
		JFrame frame = new JFrame("ShapeIcons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create new SizePanel object
		SizePanel sp = new SizePanel(shapes);
		frame.add(sp);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		/*
		 * Maximum method
		 */
		
		Measurable maxShape = maximum(shapes);
		System.out.println("The largest shape is a " + maxShape);
	
	}

}
