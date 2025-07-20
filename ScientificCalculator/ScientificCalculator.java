import java.util.Scanner;
import java.util.InputMismatchException; // Needed for handling non-numeric input

public class ScientificCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            displayMenu(); //constantly displays menu
            performOperation(scanner); //calculate
            System.out.println();
        }

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
        System.out.print("Enter first number");
        double num1= scanner.nextDouble();
        System.out.print("Enter second number");
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

//--- Helper Methods for User Interaction (calling from main's switch-case) ---
    private static void performOperation(Scanner scanner){
        try {
            System.out.println("Enter your choice");
            int choice = scanner.nextInt(); //get choice input from user

            if (choice == 0) {
                System.out.println("Exiting calculator");
                System.exit(0);
            }
            switch (choice) {
                case 1:
                    double[] numbersAdd = getTwoNumbers(scanner);
                    System.out.println("Result:" + " " + add(numbersAdd[0], numbersAdd[1])); //perform addition
                    break;
                case 2:
                    double[] numbersMinus = getTwoNumbers(scanner);
                    System.out.println("Result:" + " " + subtract(numbersMinus[0], numbersMinus[1])); //perform subtraction
                    break;
                case 3:
                    double[] numbersMultiply = getTwoNumbers(scanner);
                    System.out.println("Result:" + " " + multiply(numbersMultiply[0], numbersMultiply[1])); //perform multiplication
                    break;
                case 4:
                    double[] numbersDivide = getTwoNumbers(scanner);
                    if (numbersDivide[1] == 0) {
                        System.out.println("Error, cant divide by 0");
                    } else {
                        System.out.println("Result:" + " " + divide(numbersDivide[0], numbersDivide[1])); //perform division
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Error: Cannot take square root of a negative number.");
                    } else {
                        System.out.println("Result: " + calculateSquareRoot(num));
                    }
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + calculatePower(base, exponent));
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    double degreesSine = scanner.nextDouble();
                    System.out.println("Result: " + calculateSine(degreesSine));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    double degreesCosine = scanner.nextDouble();
                    System.out.println("Result: " + calculateCosine(degreesCosine));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    double degrees = scanner.nextDouble();
                    if (degrees % 180 == 90) {
                        System.out.println("Error: Tangent is undefined at 90°, 270°, etc.");
                    } else {
                        System.out.println("Result: " + calculateTangent(degrees));
                    }
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    double numLog = scanner.nextDouble();
                    if (numLog <= 0) {
                        System.out.println("Error: Natural log is undefined for zero or negative numbers.");
                    } else {
                        System.out.println("Result: " + calculateNaturalLog(numLog));
                    }
                    break;
                case 11:
                    System.out.print("Enter number: ");
                    double numLog10 = scanner.nextDouble();
                    if (numLog10 <= 0) {
                        System.out.println("Error: Log base 10 is undefined for zero or negative numbers.");
                    } else {
                        System.out.println("Result: " + calculateLogarithmBase10(numLog10));
                    }
                    break;
                case 12:
                    System.out.print("Enter number: ");
                    double numAbs = scanner.nextDouble();
                    System.out.println("Result: " + Math.abs(numAbs));
                    break;
                case 13:
                    System.out.print("Enter number: ");
                    double numRound = scanner.nextDouble();
                    System.out.println("Result: " + roundNumber(numRound));
                    break;
                case 14:
                    System.out.print("Enter number: ");
                    double numCeiling= scanner.nextDouble();
                    System.out.println("Result: " + ceilingNumber(numCeiling));
                    break;
                case 15:
                    System.out.print("Enter number: ");
                    double numFloor = scanner.nextDouble();
                    System.out.println("Result: " + floorNumber(numFloor));
                    break;
                case 16:
                    double[] numbersMin = getTwoNumbers(scanner);
                    System.out.println("Result: " + findMin(numbersMin[0], numbersMin[1]));
                    break;
                case 17:
                    double[] numbersMax = getTwoNumbers(scanner);
                    System.out.println("Result: " + findMax(numbersMax[0], numbersMax[1]));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

                    catch(InputMismatchException e){
                    System.out.println("Invalid input! Please enter valid numbers.");
                    scanner.nextLine(); // clear invalid input
                }

            }

    }


