public class CreditPaymentService {

    public double calculate(int creditPeriod, int creditAmount, double interestRate){

        double monthsRate = interestRate/12/100;
        int months = creditPeriod*12;
        double rank = Math.pow(1 + monthsRate, months);
        double creditPayments = creditAmount * ((monthsRate*rank)/(rank-1));
        return creditPayments;
    }

}
