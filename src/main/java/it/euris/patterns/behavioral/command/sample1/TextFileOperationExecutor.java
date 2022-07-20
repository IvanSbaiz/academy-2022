package it.euris.patterns.behavioral.command.sample1;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations
            = new ArrayList<>();

    public void executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        textFileOperation.execute();
    }
}


