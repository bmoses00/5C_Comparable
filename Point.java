/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable {
    private double xcor;
    private double ycor;

    public int compareTo( Object otherObj) { // returns difference between distances from origin
        Point p1 = (Point) otherObj;
        double dist1 = Math.sqrt(xcor * xcor + ycor * ycor);
        double dist2 = Math.sqrt(p1.xcor * p1.xcor + p1.ycor * p1.ycor);
        return (int) Math.floor(dist1 - dist2);
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
