package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean first = firstSide + secondSide > thirdSide;
        boolean second = secondSide + thirdSide > firstSide;
        boolean third = firstSide + thirdSide > secondSide;

       if (first && second && third) {
           System.out.println("this is a valid triangle");
       } else {
           System.out.println("it's not a triangle");
       }
    }
}
