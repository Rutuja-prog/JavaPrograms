public class EvenNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers in the array:");

        
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] % 2 == 0) {
                
                System.out.println(numbers[i]);
            }
        }
    }
}