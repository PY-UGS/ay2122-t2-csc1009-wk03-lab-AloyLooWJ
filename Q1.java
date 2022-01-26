import java.time.LocalDateTime;
import java.util.Scanner;
public class Q1 
{
    public static void main(String[] args)
    {
        //DEFAULT LOAN
        Loan defLoan = new Loan();
        LocalDateTime loanDate2 = defLoan.getLoanDate();
        double monthlyPayment2 = defLoan.getMonthlyPayment();
        double totalPayment2 = defLoan.getTotalPayment();
        System.out.println("The loan was created on " + loanDate2);
        System.out.printf("The monthly payment is %.2f\n", monthlyPayment2);
        System.out.printf("The total payment is %.2f\n", totalPayment2);
        
        //USER INPUT LOAN
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();
        
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input2.nextInt();
        
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input3.nextDouble();
        input.close();
        input2.close();
        input3.close();

        Loan myLoan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        LocalDateTime loanDate = myLoan.getLoanDate();
        double monthlyPayment = myLoan.getMonthlyPayment();
        double totalPayment = myLoan.getTotalPayment();
        System.out.println("The loan was created on " + loanDate);
        System.out.printf("The monthly payment is %.2f\n", monthlyPayment);
        System.out.printf("The total payment is %.2f\n", totalPayment);

    }
}