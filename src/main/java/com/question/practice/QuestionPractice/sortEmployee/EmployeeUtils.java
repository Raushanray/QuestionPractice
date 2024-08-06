package com.question.practice.QuestionPractice.sortEmployee;

import java.util.List;
import java.util.Optional;

public class EmployeeUtils {
    public static void main(String[] args) {
        List<Employees> employees = List.of(
                new Employees("Raushan", 1000 ),
                new Employees("Aman", 5000 ),
                new Employees("Mukesh", 12000 ),
                new Employees("Tannu", 3000 )
        );

//        Optional<Employees> secHighestPaying  = employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
//        System.out.println(secHighestPaying);

        Optional<Employees> secondHighestPayingEmployee = findSecondHighestPayingEmployee(employees);
        secondHighestPayingEmployee.ifPresent(emp -> {
            System.out.println("Second highest paying employee: " + emp.getName() + " " + emp.getSalary());
        });
    }

    private static Optional<Employees> findSecondHighestPayingEmployee(List<Employees> employees) {

            return employees.
                    stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
    }
}
