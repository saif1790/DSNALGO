package lld.solid.srp;

public class SalaryCalculator {

  public double calculateSalary(Employee employee){
    return employee.getBaseSalary() + employee.getBonus();
  }
}
