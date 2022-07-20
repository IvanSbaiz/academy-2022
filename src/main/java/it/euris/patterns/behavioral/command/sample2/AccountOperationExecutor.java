package it.euris.patterns.behavioral.command.sample2;

import java.util.ArrayList;
import java.util.List;

public class AccountOperationExecutor {

    private final List<AccountOperation> accountOperations
            = new ArrayList<>();

    void executeOperation(AccountOperation accountOperation){
        accountOperations.add(accountOperation);
        accountOperation.execute();
    }

    AccountOperation popOperation(){
        return accountOperations.remove(accountOperations.size() -1);
    }


    public void undoLastOperation() {
        AccountOperation lastOperation = popOperation();
        lastOperation.undo();
    }

    public void undoAllOperations() {
        while(accountOperations.size() != 0){
            undoLastOperation();
        }
    }
}


