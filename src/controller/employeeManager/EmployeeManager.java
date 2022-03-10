package controller.employeeManager;

import model.employee.Employee;

import java.util.ArrayList;

public abstract class EmployeeManager {
    private static ArrayList<Employee> savedList;
    private static SetValidDetail setter;
    private Employee target;

    public EmployeeManager() {
    }

    public EmployeeManager(Employee target) {
        this.target = target;
        setter=null;
    }
    abstract void addEmployee();
    abstract void removeEmployeeById();
    abstract void setEmployeeInfo();
}