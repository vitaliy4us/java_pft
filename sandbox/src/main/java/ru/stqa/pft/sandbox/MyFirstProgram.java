package ru.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MyFirstProgram {
	public static void main(String[] arg) {
		System.out.println("Hello World");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной равной " + s.a + " = " + s.area() );
		Rectangle r = new Rectangle(6, 8);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() );
	}
}