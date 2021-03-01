package lab01.example.model.operations;

public class BankOperatorImpl implements BankOperator {

    @Override
    public double deposit(double bankAccountAmount, double depositAmount) {
        return bankAccountAmount + depositAmount;
    }

    @Override
    public double withdraw(double bankAccountAmount, double withdrawAmount) {
        return bankAccountAmount - withdrawAmount;
    }
}
