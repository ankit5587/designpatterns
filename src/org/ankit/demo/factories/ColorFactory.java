package org.ankit.demo.factories;

import org.ankit.demo.color.classes.Blue;
import org.ankit.demo.color.classes.Green;
import org.ankit.demo.color.classes.Red;
import org.ankit.demo.interfaces.Color;
import org.ankit.demo.interfaces.Shape;

public class ColorFactory extends AbstractFacory {

	@Override
	public
	Color getColor(String color) {
		if (null == color) {
			return null;
		} else if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

	@Override
	public
	Shape getShape(String shape) {

		return null;
	}

}
