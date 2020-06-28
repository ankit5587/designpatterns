import org.ankit.demo.factories.AbstractFacory;
import org.ankit.demo.factories.FactoryProducer;
import org.ankit.demo.interfaces.Color;
import org.ankit.demo.interfaces.Shape;

public class Client {

	public static void main(String[] args) {
		//get shape factory
		AbstractFacory shapeFacory= FactoryProducer.getFactory("shape");
		AbstractFacory colorFacory= FactoryProducer.getFactory("color");
		
		
		Shape circle = shapeFacory.getShape("Circle");
		circle.draw();
		
		Shape rect = shapeFacory.getShape("rectangle");
		rect.draw();
		
		Color red = colorFacory.getColor("red");
		red.fill();
		Color blue = colorFacory.getColor("blue");
		blue.fill();
		
		}

	}
