package it.euris.patterns.creational.prototype.exercise;

import java.util.ArrayList;
import java.util.List;

public class Company implements Cloneable {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public Company clone() {
        Company resultCompany = new Company();
        List<Employee> resultEmployeeList = new ArrayList<>();

        employeeList.forEach( employee -> {
            resultEmployeeList.add(employee);
        });
        resultCompany.setEmployeeList(resultEmployeeList);

        return resultCompany;
    }
}
