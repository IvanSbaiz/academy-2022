package it.euris.patterns.behavioral.command.sample1;

public class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    // constructors
    public OpenTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
