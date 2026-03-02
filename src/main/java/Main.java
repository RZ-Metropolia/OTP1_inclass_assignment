public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("=== Temperature Converter ===\n");

        // Fahrenheit to Celsius
        double[] fahrenheitValues = {32, 68, 100, 212, -40};
        System.out.println("Fahrenheit -> Celsius:");
        for (double f : fahrenheitValues) {
            System.out.printf("  %.2f°F = %.2f°C%n", f, converter.fahrenheitToCelsius(f));
        }

        System.out.println();

        // Celsius to Fahrenheit
        double[] celsiusValues = {0, 20, 37.5, 100, -40};
        System.out.println("Celsius -> Fahrenheit:");
        for (double c : celsiusValues) {
            System.out.printf("  %.2f°C = %.2f°F%n", c, converter.celsiusToFahrenheit(c));
        }

        System.out.println();

        // Kelvin to Celsius
        double[] kelvinValues = {0, 273.15, 296, 373.15};
        System.out.println("Kelvin -> Celsius:");
        for (double k : kelvinValues) {
            System.out.printf("  %.2fK = %.2f°C%n", k, converter.kelvinToCelsius(k));
        }

        System.out.println();

        // Extreme temperature check
        double[] extremeCheckValues = {-41, -40, 0, 24, 50, 51};
        System.out.println("Extreme Temperature Check:");
        for (double c : extremeCheckValues) {
            String status = converter.isExtremeTemperature(c) ? "EXTREME" : "Normal";
            System.out.printf("  %.2f°C -> %s%n", c, status);
        }

        System.out.println("\n=== Done ===");
    }
}
