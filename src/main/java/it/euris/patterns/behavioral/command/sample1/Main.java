package it.euris.patterns.behavioral.command.sample1;

class Main {

    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file1.txt");
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(textFile));
        textFileOperationExecutor.executeOperation(new WriteTextFileOperation(textFile));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(textFile));
    }

}