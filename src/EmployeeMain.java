import java.util.*;

class Employees {

    private String name;
    private Department dept;
    private int commitCount;

    public Employees(String name, Department dept, int commitCount) {
        this.name = name;
        this.dept = dept;
        this.commitCount = commitCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public int getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(int commitCount) {
        this.commitCount = commitCount;
    }
}

class Department
{
    private String dept;

    public Department(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class EmployeeMain
{
    public static void main(String[] args) {

        //int freq = 09;
        int freq = 0;
       Employees emp1 = new  Employees("saif",new Department("IT"),3);
        Employees emp2 = new Employees("aayush",new Department("support"),2);
        Employees emp3 = new  Employees("Avinash",new Department("support"),3);
        Employees emp4 = new  Employees("Ishan",new Department("IT"),5);
        Employees emp5 = new  Employees("Kuldeep",new Department("IT"),7);
        Employees emp6 = new Employees("Anurag",new Department("devops"),1);

        List emplist = new ArrayList();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        emplist.add(emp6);

        Map<String,Integer> maxDeptCommitCount = new HashMap<>();
        for(int i=0; i<emplist.size(); i++)
        {
            Employees e =(Employees) emplist.get(i);
            if(!maxDeptCommitCount.containsKey(e.getDept().getDept()))
            {
                maxDeptCommitCount.put(e.getDept().getDept(),1);
            }
            else
            {
               freq = maxDeptCommitCount.getOrDefault(e.getDept().getDept(),0);

               maxDeptCommitCount.put(e.getDept().getDept(),freq+1);
            }
        }
        int maxValueInMap=(Collections.max(maxDeptCommitCount.values()));  // This will return max value in the HashMap

        System.out.println(maxValueInMap);
        /*System.out.println(e.getDept().getDept());
        System.out.println(e.getCommitCount());*/
    }
}
