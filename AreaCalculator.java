package sprint;

public class AreaCalculator {
    public static double calculateArea (double a) { // methods need to be static to call it without having to create an object in main.java
        return Math.round(a * a * 100.0) / 100.0;   // needs to be with ".0" because it's floating point division.
    }
    public static double calculateArea (double a, double b) {
        return Math.round(a * b * 100.0) / 100.0;
    }
    public static double calculateArea (double a, boolean b) {
        if (b == true) {
            return Math.round((a * a * Math.PI)* 100.0) / 100.0;
        } else {
            return Double.NaN;
        }
    }
}
