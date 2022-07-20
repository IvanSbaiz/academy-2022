package it.euris.patterns.behavioral.command.sample1;

public class TextFile {

    private String name;

    // constructor
    public TextFile(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening file " + name);
    }

    public void write() {
        System.out.println("Writing file " + name);
    }

    public void save() {
        System.out.println("Saving file " + name);
    }
}