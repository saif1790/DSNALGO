package lld.solid.srp;

public class Employee {

  private String name;
  private double baseSalary;
  private double bonus;

  public Employee(String name, double baseSalary, double bonus) {
    this.name = name;
    this.baseSalary = baseSalary;
    this.bonus = bonus;
  }

  public String getName() {
    return name;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public double getBonus() {
    return bonus;
  }
}
