public class FactorialCalculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        long factorial1 = calculateFactorial(num1);
        long factorial2 = calculateFactorial(num2);

        System.out.println("Factorial of " + num1 + " is: " + factorial1);
        System.out.println("Factorial of " + num2 + " is: " + factorial2);
    }
