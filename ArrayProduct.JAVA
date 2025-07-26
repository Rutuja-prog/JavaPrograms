public class ArrayProduct {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 9, 7, 5}; 
        long product = 1; 

        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }

        System.out.println("The product of array elements is: " + product);
    }
}