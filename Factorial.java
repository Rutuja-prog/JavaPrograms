public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        long factorial = 1; // Use long to handle larger factorials if needed

        // Calculate factorial using a for loop
        for (int i = 1; i <= num; ++i) {
            factorial *= i; // factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}