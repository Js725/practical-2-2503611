class Average {
    public double calculateAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    public double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public double calculateAverage(double a, double b) {
        return (a + b) / 2.0;
    }

    public double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}

public class q4 {
    public static void main(String[] args) {
        Average avgObj = new Average();
        
        System.out.println("Average of 2 ints (10, 20): " + avgObj.calculateAverage(10, 20));
        System.out.println("Average of 3 ints (5, 10, 15): " + avgObj.calculateAverage(5, 10, 15));
        System.out.println("Average of 2 doubles (2.5, 4.5): " + avgObj.calculateAverage(2.5, 4.5));
        System.out.println("Average of 3 doubles (1.1, 2.2, 3.3): " + avgObj.calculateAverage(1.1, 2.2, 3.3));
    }
}