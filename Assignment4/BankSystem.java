public class BankSystem {

    public static void main(String[] args) {

        SecureAccount acc = new SecureAccount("456789032245678", 123435, 9);

        System.out.println("Account Information");
        System.out.println("Account Number : " + acc.getAccNo());
        System.out.println("Available Balance : " + acc.getAmount());

        System.out.println("Balance After Deposit : " + acc.deposit(30000));
        System.out.println("Balance After Withdrawal : " + acc.withdraw(5000));

        System.out.println("Yearly Interest Rate : " + acc.getRate());
        System.out.println("Balance With Interest : " + acc.calculateInterest());
    }
}

abstract class Account {

    private String accNo;
    private double amount;

    public Account(String accNo, double amount) {
        this.accNo = accNo;
        this.amount = amount;
    }

    public double deposit(double money) {
        amount = amount + money;
        return amount;
    }

    public double withdraw(double money) {
        amount = amount - money;
        return amount;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class SecureAccount extends Account {

    private double rate;

    public SecureAccount(String accNo, double amount, double rate) {
        super(accNo, amount);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double withdraw(double money) {

        double remaining = getAmount() - money;

        if (remaining < 1000) {
            return getAmount();
        } else {
            setAmount(remaining);
            return getAmount();
        }
    }

    public double calculateInterest() {
        return getAmount() + (getAmount() * rate / 100);
    }
}