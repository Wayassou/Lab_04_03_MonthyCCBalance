public class CreditCardBalanceCalculator {
    public static void main(String[] args) {
        double balance = 5000.00;
        double interestRate = 0.17;

        double firstMonthInterest = balance * interestRate;
        double firstMonthBalance = balance + firstMonthInterest;

        double secondMonthInterest = firstMonthBalance * interestRate;
        double secondMonthBalance = firstMonthBalance + secondMonthInterest;

        System.out.println("Balance after 1 month (with interest): $" + firstMonthBalance);
        System.out.println("Balance after 2 months (with interest): $" + secondMonthBalance);
    }
}
