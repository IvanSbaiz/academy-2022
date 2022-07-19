package it.euris.patterns.creational.prototype.exercise;

public class Main {

    private static CompanyDao dao = CompanyDao.getInstance();

    public static void main(String[] args) {

        Company companyPrototype = dao.getCompany();

        Company simulazione1 = companyPrototype.clone();
        Company simulazione2 = companyPrototype.clone();

        removeFirstEmployee(simulazione1);

        removeFirstEmployee(simulazione2);
        removeFirstEmployee(simulazione2);

        // METODO DI CALCOLO simulazione1, simulazione2, companyPrototype

        System.out.println(companyPrototype.getEmployeeList().size());
        System.out.println(simulazione1.getEmployeeList().size());
        System.out.println(simulazione2.getEmployeeList().size());

    }

    public static void  removeFirstEmployee(Company company){
        company.getEmployeeList().remove(0);
    }

}
