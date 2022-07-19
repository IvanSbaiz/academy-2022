package it.euris.patterns.creational.prototype.exercise;

import java.util.ArrayList;
import java.util.List;

public class CompanyDao {

    private static CompanyDao instance = new CompanyDao();


    private CompanyDao(){}

    public static CompanyDao getInstance(){
        return instance;
    }

    // ESEGUE QUERY
    public static Company getCompany(){
        Company resultCompany = new Company();
        List<Employee> mock = new ArrayList<>();

        mock.add(new Employee(1, 5));
        mock.add(new Employee(3, 10));
        mock.add(new Employee(6, 5));
        mock.add(new Employee(10, 2));
        resultCompany.setEmployeeList(mock);

        return resultCompany;
    }
}
