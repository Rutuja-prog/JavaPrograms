public class ArraySum {

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

    
        int sum = 0;

    System.out.println("print the sum of int")

        for (int num : numbers) {
            sum += num; 
        }

        // Print the calculated sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}