public class Tester {

  public static void main(String[]args) {
    Point a = new Point(1, 2);
    Point b = new Point(1, 2);
    Point o = new Point(0, 0);
    System.out.println("Distance between a and a: " + a.distanceTo(o));
    System.out.println("a equals b?: " + a.equals(b));
    System.out.println("a equals o?: " + a.equals(o));
  }

}
