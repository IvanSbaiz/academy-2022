package it.euris.patterns.behavioral.command.sample1;

public class SaveTextFileOperation implements TextFileOperation {
    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
