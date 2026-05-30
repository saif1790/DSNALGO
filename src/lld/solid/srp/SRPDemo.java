package lld.solid.srp;

public class SRPDemo {
  public static void main(String[] args) {

    Employee employee = new Employee("Saif",5000.0,3000);
    SalaryCalculator salaryCalculator = new SalaryCalculator();
    EmployeeRepository repository = new EmployeeRepository();
    EmailService emailService = new EmailService();
    double salary = salaryCalculator.calculateSalary(employee);
    repository.save(employee);
    emailService.sendPayslip(employee, salary);

  }
}
