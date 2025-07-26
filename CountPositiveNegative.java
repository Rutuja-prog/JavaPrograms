public class CountPositiveNegative {

    public static void main(String[] args) {
        int[] numbers = {4, -8, 2, -5, 10, -1, 7}; 
        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
    }
}
}