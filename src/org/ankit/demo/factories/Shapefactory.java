package org.ankit.demo.factories;

import org.ankit.demo.interfaces.Color;
import org.ankit.demo.interfaces.Shape;
import org.ankit.demo.shape.classes.Circle;
import org.ankit.demo.shape.classes.Rectangle;
import org.ankit.demo.shape.classes.Square;

public class Shapefactory extends AbstractFacory{

	@Override
	public
	Color getColor(String color) {
		return null;
	}

	@Override
	public
	Shape getShape(String shape) {

		if(null==shape) {
			return null;
		}
		if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
		
	}

}
