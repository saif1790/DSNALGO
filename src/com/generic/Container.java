package com.generic;

import com.java8.feature.stream.filter.Employee;

public class Container<T> {
  private T item;
  private Employee employee;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  @Override
  public String toString() {
    return "Container{" +
            "item=" + item +
            ", employee=" + employee +
            '}';
  }
}
