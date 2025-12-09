package com;

public class CloneDemo1 implements Cloneable {

  String name;
  int age ;
  Address address;

  public CloneDemo1(String name,int age,Address address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public static void main(String[] args) throws CloneNotSupportedException {

    Address address1 = new Address("Ghazipur");
    CloneDemo1 c1 = new CloneDemo1("Saif",35,address1);
    System.out.println("Name :" + c1.name + " Age :" + c1.age + " Address :"+c1.address.city);
    CloneDemo1 c2 = (CloneDemo1) c1.clone();
    System.out.println("Name :" + c2.name + " Age :" + c2.age + " Address :"+c2.address.city);

    c2.name = "sam";
    c2.age = 30;
    c2.address.city = "New delhi";
    System.out.println("Name :" + c1.name + " Age :" + c1.age + " Address :"+c1.address.city);
    System.out.println("Name :" + c2.name + " Age :" + c2.age + " Address :"+c2.address.city);

  }
  public Object clone() throws CloneNotSupportedException{
    Address address1 = new Address(address.city);
    CloneDemo1 cloneDemo1 = new CloneDemo1(name,age,address1);
    return cloneDemo1;
  }
}

class Address {
  String city;

  public Address(String city){
    this.city = city;
  }
}
