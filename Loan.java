import java.time.LocalDateTime;

public class Loan {
    private static double annualInterestRate;
    private static int numberOfYears;
    private static double loanAmount;
    private static LocalDateTime loanDate;

    public Loan()
    {
        setAnnualInterestRate(2.5);
        setNumberOfYears(1);
        setLoanAmount(1000);
    }

    public Loan(double annualIR, int noOfYears, double lAmount)
    {
        setAnnualInterestRate(annualIR);
        setNumberOfYears(noOfYears);
        setLoanAmount(lAmount);
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public int getNumberOfYears()
    {
        return numberOfYears;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public LocalDateTime getLoanDate()
    {
        loanDate = LocalDateTime.now();
        return loanDate;
    }

    public void setAnnualInterestRate(double new_annualInterestRate)
    {
        annualInterestRate = new_annualInterestRate;
    }

    public void setNumberOfYears(int new_numberOfYears)
    {
        numberOfYears = new_numberOfYears;
    }

    public void setLoanAmount(double new_loanAmount)
    {
        loanAmount = new_loanAmount;
    }

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = annualInterestRate/12/100;
        double a = 1 + monthlyInterestRate;
        double b = numberOfYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1/Math.pow(a,b)));
        return monthlyPayment;
    }

    public double getTotalPayment()
    {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}