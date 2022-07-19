package it.euris.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList  = new ArrayList<>();

    public Employees(List<String> empList){
        this.empList = empList;
    }

    public Employees() {
    }

    public void load(){
        empList.add("a");
        empList.add("b");
        empList.add("c");
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empList=" + empList +
                '}';
    }

    @Override
    public Object clone(){
        return new Employees(new ArrayList<>(empList));
    }

}
