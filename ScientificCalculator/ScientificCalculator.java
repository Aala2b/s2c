import java.util.Scanner;
import java.util.InputMismatchException; // Needed for handling non-numeric input

public class ScientificCalculator {
    double pi= 3.1415;

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

    }

    //==Menu display==
    public static void displayMenu() {
        System.out.println("Scientific Calculator");
        System.out.println("1.  Addition");
        System.out.println("2.  Subtraction");
        System.out.println("3.  Multiplication");
        System.out.println("4.  Division");
        System.out.println("5.  Square Root");
        System.out.println("6.  Power (x^y)");
        System.out.println("7.  Sine");
        System.out.println("8.  Cosine");
        System.out.println("9.  Tangent");
        System.out.println("10. Natural Logarithm (ln x)");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round to Nearest Long");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum of Two");
        System.out.println("17. Maximum of Two");
        System.out.println("0.  Exit");

    }

    // get 2 numbers from user
    public static double[] getTwoNumbers(Scanner scanner){
        system.out.print("Enter first number");
        double num1= scanner.nextDouble();
        system.out.print("Enter second number");
        double num2= scanner.nextDouble();
        return new double[]{num1, num2};
    }
    // Basic Arithmetic operations
    public static double add(double a, double b){return a+b;}
    public static double subtract(double a, double b){return a-b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }
 // Scientific math methods
    public static double calculateSquareRoot(double a) {return Math.sqrt(a); }
    public static double calculatePower(double base, double exponent) {return Math.pow(base,exponent);  }
    public static double calculateSine(double angle) {return Math.sin(angle);}
    public static double calculateCosine(double angle) {return Math.cos(angle);}
    public static double calculateTangent(double angle) {return Math.tan(angle);}
    public static double calculateNaturalLog(double a) {return Math.log(a);}
    public static double calculateLogarithmBase10(double num) { return Math.log10(num);}
    public static long roundNumber(double num) { return Math.round(num); }
    public static double ceilingNumber(double num) { return Math.ceil(num); }
    public static double floorNumber(double num) { return Math.floor(num); }
    public static double findMin(double a, double b) { return Math.min(a, b); }
    public static double findMax(double a, double b) { return Math.max(a, b); }



}
