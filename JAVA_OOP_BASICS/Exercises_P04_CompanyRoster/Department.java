package Exercises_P04_CompanyRoster;

import java.util.List;

public class Department {
   private List<Employee> employee;
   public void setEmployee(List<Employee> employee){
       this.employee=employee;
   }
   public List<Employee> getEmployee(){
       return this.employee;

   }
}
