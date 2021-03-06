public class Point {

  private double x, y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    double x2 = other.x;
    double y2 = other.y;
    double sum = ( (x2 - x) * (x2 - x) + (y2 - y) * (y2 - y) );
    return Math.sqrt(sum);
  }

  public boolean equals(Point other) {
    return (x == other.getX() && y == other.getY());
  }

}
