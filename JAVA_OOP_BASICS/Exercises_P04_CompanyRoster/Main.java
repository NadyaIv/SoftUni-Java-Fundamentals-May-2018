package Exercises_P04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        List<Employee> employee = new ArrayList<>();
        Map<String, List<Employee>> department = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String[] inputs = reader.readLine().split(" ");
            if (inputs.length == 4) {
                Employee emp = new Employee(inputs[0], Double.parseDouble(inputs[1]), inputs[2], inputs[3]);
                employee.add(emp);
            } else if (inputs.length == 5) {
                if (Character.isDigit(inputs[4].charAt(0))) {
                    Employee emp = new Employee(inputs[0], Double.parseDouble(inputs[1]), inputs[2], inputs[3], Integer.valueOf(inputs[4]));
                    employee.add(emp);
                } else {
                    Employee emp = new Employee(inputs[0], Double.parseDouble(inputs[1]), inputs[2], inputs[3], inputs[4]);
                    employee.add(emp);
                }
            } else {
                Employee emp = new Employee(inputs[0], Double.parseDouble(inputs[1]), inputs[2], inputs[3], inputs[4], Integer.valueOf(inputs[5]));
                employee.add(emp);

            }

        }
        for (Employee emp : employee) {
            department.putIfAbsent(emp.getDepartment(), new ArrayList<>());
            department.get(emp.getDepartment()).add(emp);
        }

      department.entrySet().stream().sorted((a,b)->Double.compare(b.getValue().stream().mapToDouble(g->g.getSalary()).average().getAsDouble(),
              a.getValue().stream().mapToDouble(g->g.getSalary()).average().getAsDouble())).limit(1).forEach(x->{
          System.out.printf("Highest Average Salary: %s\n",x.getKey());
                  x.getValue().stream().sorted((a,b)->Double.compare(b.getSalary(),a.getSalary())).forEach(y-> System.out.println(y));
              });
    }
}
