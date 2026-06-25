import java.util.*;
public class FinancialForecasting{
    private static Map<Integer, Double> map = new HashMap<>();
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        if (map.containsKey(years)) {
            return map.get(years);
        }
        double futureValue = calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
        map.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 5000.0; 
        double growthRate = 0.15;     
        int years = 15;            

        System.out.printf("The initial investment is: %.2f%n",initialValue);
        System.out.printf("The growth rate is: %.2f%n",growthRate);
        System.out.printf("Number of years is: %d%n",years);

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
