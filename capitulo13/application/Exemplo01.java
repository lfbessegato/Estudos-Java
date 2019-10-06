package course.capitulo13.application;

import course.capitulo13.model.entities.AbstractShape;
import course.capitulo13.model.entities.Circle;
import course.capitulo13.model.entities.Rectangle;
import course.capitulo13.model.enums.Color;

public class Exemplo01 {
	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
