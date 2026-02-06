public class q3 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-12s | %-12s %-10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        
        double celsius = 0.0;
        double fahrenheit = 50.0;
        
        for (int i = 0; i <= 5; i++) {
            System.out.printf("%-10.1f %-12.4f | %-12.1f %-10.4f\n", 
                celsius, celsiusToFahrenheit(celsius), 
                fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius += 10.0;
            fahrenheit += 10.0;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}