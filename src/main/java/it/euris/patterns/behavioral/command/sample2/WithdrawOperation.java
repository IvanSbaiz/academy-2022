package it.euris.patterns.behavioral.command.sample2;

public class WithdrawOperation implements AccountOperation {

    private Account account;

    public int value;

    public WithdrawOperation(Account account, int value) {
        this.account = account;
        this.value = value;
    }

    @Override
    public void execute() {
        account.withdraw(value);
    }

    @Override
    public void undo() {
        account.deposit(value);
    }

}
