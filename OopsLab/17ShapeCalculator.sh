import java.util.Scanner;
interface Shape {
  void area();
  void perimeter();
}
class Circle implements Shape {
  int r;
  Circle(int r) {
    this.r = r;
  }
  public void area() {
    double area = Math.PI * r * r;
    System.out.println("Area of circle: " + area);
  }
  public void perimeter() {
    double peri = 2 * Math.PI * r;
    System.out.println("Perimeter of circle: " + peri);
  }
}
class Rectangle implements Shape {
  int l, b;
  Rectangle(int l, int b) {
    this.l = l;
    this.b = b;
  }
  public void area() {
    int area = l * b;
    System.out.println("Area of rectangle: " + area);
  }
  public void perimeter() {
  int peri = 2 * (l + b);
  System.out.println("Perimeter of rectangle: " + peri);
  }
}
public class ShapeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;
    do
    {
      System.out.println("\n1. Circle");
      System.out.println("2. Rectangle");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
        System.out.print("Enter radius of the circle: ");
        Circle circle = new Circle(sc.nextInt());
        circle.area();
        circle.perimeter();
        break;
        case 2:
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.area();
        rectangle.perimeter();
        break;
        case 3:
        System.out.println("Exiting...");
        break;
        default:
        System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        break;
      }
    } while (ch != 3);
    sc.close();
  }
}
