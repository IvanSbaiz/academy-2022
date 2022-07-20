package it.euris.patterns.behavioral.command.sample2;

class Main {

    public static void main(String[] args) {
        AccountOperationExecutor accountOperationExecutor
                = new AccountOperationExecutor();
        Account account = new Account(0);

        accountOperationExecutor.executeOperation(new DepositAccountOperation(account, 300));
        accountOperationExecutor.executeOperation(new WithdrawOperation(account, 200));
        accountOperationExecutor.executeOperation(new WithdrawOperation(account, 50));
        accountOperationExecutor.executeOperation(new DepositAccountOperation(account, 100));

        System.out.println("Summary amount :" + account.getSummaryValue());

//        accountOperationExecutor.undoOperations();
        accountOperationExecutor.undoAllOperations();
        System.out.println("Summary amount :" + account.getSummaryValue());


    }

}