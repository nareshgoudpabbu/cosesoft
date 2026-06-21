import java.util.ArrayList;
import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;
        ArrayList<String> transactions = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("       SMART ATM SYSTEM");
        System.out.println("==================================");

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN! Access Denied.");
            return;
        }

        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        transactions.add("Deposited ₹" + deposit);
                        System.out.println("Deposit Successful.");
                    } else {
                        System.out.println("Invalid Amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdrawal Amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance && withdraw > 0) {
                        balance -= withdraw;
                        transactions.add("Withdrawn ₹" + withdraw);
                        System.out.println("Withdrawal Successful.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("\n----- MINI STATEMENT -----");

                    if (transactions.isEmpty()) {
                        System.out.println("No Transactions Available.");
                    } else {
                        for (String t : transactions) {
                            System.out.println(t);
                        }
                    }

                    System.out.println("Available Balance: ₹" + balance);
                    break;

                case 5:
                    System.out.print("Enter New PIN: ");
                    pin = sc.nextInt();
                    System.out.println("PIN Changed Successfully.");
                    break;

                case 6:
                    System.out.println("Thank You For Using Smart ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
