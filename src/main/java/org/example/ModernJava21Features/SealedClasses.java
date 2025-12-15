package org.example.ModernJava21Features;

sealed class Shape permits Circle,Square {
   void printShape() {
       System.out.println("This is shape class");
   }
}
final class Circle extends Shape{
    void printShape() {
        System.out.println("This is circle class");
    }
}

non-sealed class Square extends Shape {
    void printShape() {
        System.out.println("This is square class");
    }
}
public class SealedClasses {
    public static void main(String[] args) {
    Shape circle=new Circle();
    Shape square=new Square();
    circle.printShape();
    square.printShape();
    }
}
