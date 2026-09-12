import java.util.Scanner;

public class MonthlyExpenseAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget, total = 0, expense;
        int n;
        n=3;


        System.out.println("===== MONTHLY EXPENSE & BUDGET ANALYZER =====");

        System.out.print("Enter your monthly budget: ₹");
        budget = sc.nextDouble();

        System.out.print("Enter number of expenses: ");
        n = sc.nextInt();

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter expense " + i + " amount: ₹");
            expense = sc.nextDouble();

            total = total + expense;
        }

        double remaining = budget - total;

        System.out.println("\n===== EXPENSE SUMMARY =====");

        System.out.println("Monthly Budget: ₹" + budget);
        System.out.println("Total Expenses: ₹" + total);

        if (remaining >= 0) {
            System.out.println("Remaining Budget: ₹" + remaining);
            System.out.println("Status: You are within your budget.");
        } else {
            System.out.println("Amount Over Budget: ₹" + (-remaining));
            System.out.println("Status: You have exceeded your budget.");
        }

        sc.close();
    }
}
