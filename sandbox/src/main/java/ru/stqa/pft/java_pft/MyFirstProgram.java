package ru.stqa.pft.java_pft;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("Nick");
    hello("user");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point point1 = new Point(5, 10);
    Point point2 = new Point(5, 19);

    System.out.println(point1.distance(point2));
  }

  public static void hello (String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}