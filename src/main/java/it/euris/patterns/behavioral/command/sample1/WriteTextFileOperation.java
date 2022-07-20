package it.euris.patterns.behavioral.command.sample1;

public class WriteTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    // constructors
    public WriteTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.write();
    }
}
