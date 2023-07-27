package belajar.java.application;

import belajar.java.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("prdty Corp");

        Company.Employee employee = company. new Employee();
        employee.setName("Adit Praditia");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company kcpcomp = new Company();
        company.setName("Zingga Comp");

        Company.Employee employee1 = company. new Employee();
        employee1.setName("Nindya");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
