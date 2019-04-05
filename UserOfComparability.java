/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        Date d0 = new Date(2019, 4, 4);
        reportRelationship( "Date vs itself", d0, d0, "0");

        reportRelationship( "Date vs earlier date", d0, new Date(0, 12, 31), "positive int (1)");

        reportRelationship( "Date in same year", d0, new Date(2019, 1, 1), "positive int (1)");

        reportRelationship( "Date in same month", d0, new Date(2019, 4, 5), "negative int (-1)");

        // System.out.println(p0.compareTo(d0));
        IncomparableDog sad = new IncomparableDog();

        IncomparableDog bird = new IncomparableDog();

        //System.out.println(sad.compareTo(bird));
    }


    /**
      run one test
     */
    private static void reportRelationship
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
