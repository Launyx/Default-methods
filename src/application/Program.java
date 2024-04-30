package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = Double.parseDouble(tec.nextLine());
        System.out.print("Months: ");
        int months = Integer.parseInt(tec.nextLine());

        BrazilInterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", payment));

        tec.close();
    }
}
