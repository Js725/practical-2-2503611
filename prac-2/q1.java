public class q1 {
    public static void main(String[] args) {
        int[] numbers = {0, 2, 18, 20};
        System.out.printf("%-10s %-15s %-10s\n", "Number", "SquareRoot", "Cube");
        
        for (int num : numbers) {
            double squareRoot = Math.sqrt(num);
            double cube = Math.pow(num, 3);
            System.out.printf("%-10d %-15.4f %-10.4f\n", num, squareRoot, cube);
        }
    }
}