public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int creditPeriod = 3;
        int creditAmount = 1_000_000;
        double interestRate = 9.99;

        double creditPayments = service.calculate(creditPeriod, creditAmount, interestRate);

        System.out.println("Срок кредита " + creditPeriod + " лет");
        System.out.println("Сумма кредита " + creditAmount + " рублей");
        System.out.println("Кредитная ставка " + interestRate + " %");
        System.out.println("Ежемесячный платеж " + creditPayments + " рублей");
    }
}
