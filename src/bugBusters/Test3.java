package bugBusters;

public class Test3 {
    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(3, 6));
        System.out.println(calcFeetAndInchesToCentimeters(5, 5));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double result ;
        if (feet >= 0 && inches >= 0 && inches<=12) {
            result = ((12 * feet * 2.54) + calcFeetAndInchesToCentimeters(inches));
        } else {
            result = -1;
        }
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double inchesToCm;
        if (inches >= 0) {
             inchesToCm = inches * 2.54;
        } else {
            inchesToCm = -1;
        }
        return inchesToCm;
    }

}