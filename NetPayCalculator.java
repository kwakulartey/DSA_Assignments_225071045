public class NetPayCalculator {
    public static double calculateNetPay(int hoursWorked, String gender) {
        // Tax rates as constants
        double INCOME_TAX = 0.15;
        double HEALTH_LEVY = 0.025;
        double DISTRICT_TAX = 0.01;

         double MALE_RATE = 500;
         double FEMALE_RATE = 550;

        double rate = gender.equalsIgnoreCase("male") ? MALE_RATE : FEMALE_RATE;

        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * rate;
        } else {
            grossPay = (40 * rate) + ((hoursWorked - 40) * rate * 1.5);
        }

        double totalTaxRate = INCOME_TAX + HEALTH_LEVY + DISTRICT_TAX;
        double deductions = grossPay * totalTaxRate;

        return grossPay - deductions;
    }

    public static void main(String[] args) {
        System.out.println("Net Pay (Male, 38 hrs): " + calculateNetPay(38, "male"));
        System.out.println("Net Pay (Female, 45 hrs): " + calculateNetPay(45, "female"));
    }
}
