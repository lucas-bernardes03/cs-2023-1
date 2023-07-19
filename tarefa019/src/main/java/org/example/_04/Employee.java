package org.example._04;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Employee {

    double salary;
    double awards;

    public void employeeMethod(Employee employee) {
        double monthlySalary = getMonthlySalary(employee);
    }

    public double getMonthlySalary(Employee employee) {
        return (employee.getSalary() + employee.getAwards())/12;
    }
}
