import java.util.*;

class Employees {

    int id;
    private String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employees(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employees() {
    }
}

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employees>   employeesList = new ArrayList<>();
        employeesList.add(new Employees(111,"Saif",32,"Male","HR",2015,30000.0));
        employeesList.add(new Employees(222,"aayush",25,"Male","support",2023,25000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));
        employeesList.add(new Employees(111,"Saif",32,"Male","HR",2015,30000.0));
        employeesList.add(new Employees(222,"aayush",25,"Male","support",2023,25000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));
        employeesList.add(new Employees(333,"Manisha",32,"Female","HR",2019,40000.0));

        Map<String,Integer> genderCount =new HashMap();

        for(int i=0;i<employeesList.size();i++)
        {
            Employees e = employeesList.get(i);

            if(genderCount.containsKey(e.getGender())) {
              int mK =  genderCount.get(e.getGender());
              genderCount.put(e.getGender(),mK+1);
            }
                else {
                    genderCount.put(e.getGender(),1);
            }
        }
        System.out.println(genderCount);
/*
        List emplist = new ArrayList();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        emplist.add(emp6);*/

       /* Map<String, Integer> maxDeptCommitCount = new HashMap<>();
        for (int i = 0; i < emplist.size(); i++) {
            Employees e = (Employees) emplist.get(i);
            if (!maxDeptCommitCount.containsKey(e.getDept().getDept())) {
                maxDeptCommitCount.put(e.getDept().getDept(), 1);
            } else {
                freq = maxDeptCommitCount.getOrDefault(e.getDept().getDept(), 0);

                maxDeptCommitCount.put(e.getDept().getDept(), freq + 1);
            }
        }
        int maxValueInMap = (Collections.max(maxDeptCommitCount.values()));  // This will return max value in the HashMap

        System.out.println(maxValueInMap);
        *//*System.out.println(e.getDept().getDept());
        System.out.println(e.getCommitCount());*/
    }
}
