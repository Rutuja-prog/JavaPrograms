public class Armstrong2DArray {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = 0;

        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        // Calculate the sum of digits raised to the power of numDigits
        temp = originalNumber;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 153},
            {370, 371, 407},
            {1634, 8208, 9474}
        };

        System.out.println("Armstrong numbers in the 2D array:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isArmstrong(matrix[i][j])) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}