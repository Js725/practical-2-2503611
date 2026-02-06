public class q2 {
    public static void main(String[] args) {
        int[] testNumbers = {0, 2, 18, 20};
        System.out.printf("%-10s %-15s\n", "Number", "SquareRoot");
        
        for (int n : testNumbers) {
            System.out.printf("%-10d %-15.4f\n", n, customSqrt(n));
        }
    }

    public static double customSqrt(double number) {
        if (number < 0) {
            System.out.println("Error: Negative number input. Program terminated.");
            System.exit(1);
        }
        if (number == 0) return 0.0;
        if (number == 1) return 1.0;

        double lowerLimit, upperLimit;
        if (number > 1) {
            lowerLimit = 1.0;
            upperLimit = number;
        } else {
            lowerLimit = number;
            upperLimit = 1.0;
        }

        while (((upperLimit - lowerLimit) / lowerLimit) >= Math.pow(10, -8)) {
            double midpoint = (lowerLimit + upperLimit) / 2.0;
            if (midpoint * midpoint > number) {
                upperLimit = midpoint;
            } else {
                lowerLimit = midpoint;
            }
        }
        return (lowerLimit + upperLimit) / 2.0;
    }
}