package org.example;

public class Main {
    public static void main(String[] args) {

        Healthplan healthplan1 =new Healthplan(1,"A Sigorta",Plan.BASIC);
        Healthplan healthplan2 =new Healthplan(2,"B Sigorta",Plan.ADVANCE);

        String[] healthPlans=new String[3];
        healthPlans[0]= healthplan1.getName();
        healthPlans[1]= healthplan2.getName();

        Employee employee=new Employee(1,"ahmet","ahmet@ahmet.com","1234",healthPlans);
        employee.addHealthPlan(0,"C Sigorta");
        employee.addHealthPlan(2,"C Sigorta");
        employee.addHealthPlan(2,"X Sigorta");
        employee.addHealthPlan(3,"C Sigorta");
        System.out.println(employee.toString());


        System.out.println("-------------------------------------");
        String[] developerNames=new String[4];
        developerNames[0]=employee.getFullName();
        developerNames[1]="emrah";
        Company company=new Company(1,"workintech",-100,developerNames);
        System.out.println(company.toString());
        company.addEmployee(3,"Semih");
        System.out.println(company.toString());
        company.addEmployee(3,"Semra");
        System.out.println(company.toString());
        company.addEmployee(2,"Semra");
        System.out.println(company.toString());
    }
}