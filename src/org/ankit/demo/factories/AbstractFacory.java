package org.ankit.demo.factories;

import org.ankit.demo.interfaces.Color;
import org.ankit.demo.interfaces.Shape;

public abstract class AbstractFacory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
	
}
