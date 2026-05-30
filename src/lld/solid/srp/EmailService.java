package lld.solid.srp;

public class EmailService {
  public void sendPayslip(Employee employee, double salary) {
    System.out.println("Payslip emailed with salary: " + salary +" for employee :"+employee.getName());
  }

}
