public class Triangle {

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1= a;
    v2= b;
    v3= c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    double p = sideA + sideB + sideC;
    return p;
  }

  public double getArea() {
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    double s = (sideA + sideB + sideC) / 2;
    double prod = (s * (s - sideA) * (s - sideB) * (s - sideC) );
    return Math.sqrt(prod);
  }

  public String classify(){
    double sideA = v1.distanceTo(v2);
    double sideB = v2.distanceTo(v3);
    double sideC = v3.distanceTo(v1);
    sideA = Math.round(sideA * 10000) / 10000;
    sideA = Math.round(sideA * 10000) / 10000;
    sideA = Math.round(sideA * 10000) / 10000;
    if (sideA == sideB && sideA == sideC) return "equilateral";
    else if (sideA == sideB || sideA == sideC || sideB == sideC) return "isosceles";
    else return "scalene";
  }

  public String toString(){
    String s1 = "(" + v1.getX() + ", " + v1.getY() + ")";
    String s2 = "(" + v2.getX() + ", " + v2.getY() + ")";
    String s3 = "(" + v3.getX() + ", " + v3.getY() + ")";
    return "v1" + s1 + " v2" + s2 + " v3" + s3;
  }

  public void setVertex(int index, Point newP){
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }

}
