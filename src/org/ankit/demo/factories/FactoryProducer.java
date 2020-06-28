package org.ankit.demo.factories;

public class FactoryProducer {

	public static AbstractFacory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Shape")) {
			return new Shapefactory();
		}
		else if(choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
		
	}
}
