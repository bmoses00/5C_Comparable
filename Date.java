/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;

    public int compareTo( Object otherObj) {
        Date d1 = (Date) otherObj;

        if (d1.y < y) return 1;
        else if (d1.y > y) return -1;
        else if (d1.m < m) return 1;
        else if (d1.m > m) return -1;
        else if (d1.d < d) return 1;
        else if (d1.d > d) return -1;
        else return 0;
    }

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // someday: ISO 8601
        return y + "-" + m + "-" + d;
    }

}
