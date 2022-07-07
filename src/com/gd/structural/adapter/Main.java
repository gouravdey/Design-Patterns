package com.gd.structural.adapter;

public class Main {

    public static void main(String[] args) {

        BusinessCardDesigner designer = new BusinessCardDesigner();

        // Class Adapter
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populateEmployeeData(classAdapter);

        String card1 = designer.designCard(classAdapter);
        System.out.println(card1);

        System.out.println("==========================");

        // Object Adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);

        String card2 = designer.designCard(objectAdapter);
        System.out.println(card2);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Gourav Dey");
        employee.setJobTitle("Senior Engineer");
        employee.setOfficeLocation("Kolkata");
    }
}
