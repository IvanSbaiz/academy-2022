package it.euris.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Employee e = new EmployeeBasic();
        System.out.println(e.getRoles());
        e = new ProjectManager(e);
        System.out.println(e.getRoles());
        e = new AdministrativeManager(e);
        System.out.println(e.getRoles());
        e = new EmployeeBasic();
        System.out.println((e.getRoles()));
    }

}
