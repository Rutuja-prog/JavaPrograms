public class ArrayElements{
    public static void main(String[] args) {
        int[] numbers = new int[20]; 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        System.out.println("Array elements using an enhanced for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}