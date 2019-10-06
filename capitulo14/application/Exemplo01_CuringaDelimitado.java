package course.capitulo14.application;

import java.util.ArrayList;
import java.util.List;

import course.capitulo14.entities.Circle;
import course.capitulo14.entities.Rectangle;
import course.capitulo14.entities.Shape;

public class Exemplo01_CuringaDelimitado {
	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total Area: " + totalArea(myShapes));
	}
	
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
