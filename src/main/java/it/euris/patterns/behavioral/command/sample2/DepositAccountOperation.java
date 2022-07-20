package it.euris.patterns.behavioral.command.sample2;

public class DepositAccountOperation implements AccountOperation {
    private Account account;

    public int value;

    public DepositAccountOperation(Account account, int value) {
        this.account = account;
        this.value = value;
    }

    @Override
    public void execute() {
        account.deposit(value);
    }

    @Override
    public void undo() {
        account.withdraw(value);
    }
}
