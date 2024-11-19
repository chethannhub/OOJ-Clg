import java.util.Scanner;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    Account(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavAcct extends Account {
    final double interestRate = 0.04; // Assuming 4% annual interest

    SavAcct(String name, int accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    public void computeInterest(int months) {
        double interest = balance * (interestRate / 12) * months;
        balance += interest;
        System.out.println("Interest added for " + months + " months: " + interest);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
        displayBalance();
    }
}

class CurAcct extends Account {
    final double minBalance = 500.0;
    final double penalty = 50.0;

    CurAcct(String name, int accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    public void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty imposed due to minimum balance violation: " + penalty);
        }
        displayBalance();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance.");
        }
        displayBalance();
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Select account type (1 for Savings, 2 for Current): ");
        int accTypeChoice = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account;
        if (accTypeChoice == 1) {
            account = new SavAcct(name, accNo, balance);
        } else {
            account = new CurAcct(name, accNo, balance);
        }

        int choice;
        do {
            System.out.println("\nOptions:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (account instanceof SavAcct) {
                System.out.println("4. Compute Interest");
            }
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (account instanceof SavAcct) {
                        ((SavAcct) account).withdraw(withdrawAmount);
                    } else {
                        ((CurAcct) account).withdraw(withdrawAmount);
                    }
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (account instanceof SavAcct) {
                        System.out.print("Enter number of months for interest calculation: ");
                        int months = sc.nextInt();
                        ((SavAcct) account).computeInterest(months);
                    } else {
                        System.out.println("Invalid option for current account.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
