import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitiBank
{
    public static void main(String[] args) {

        /*StringBuilder sb = new StringBuilder("saif");
        StringBuilder sb1 = new StringBuilder("saif");
        Map<StringBuilder,Integer> m = new HashMap<>();
        m.put(sb,1);
        m.put(sb1,2);
       // sb.append("alam");
        System.out.println(m.get(sb1));
        System.out.println(sb1);*/
        int freq = 0;
        Employee emp1 = new  Employee("z00038","z00001");
        Employee emp2 = new Employee("z00039","z00001");
        Employee emp3 = new  Employee("z00040","z00002");
        Employee emp4 = new  Employee("z00041","z00001");
        Employee emp5 = new  Employee("z00042","z00002");
        Employee emp6 = new Employee("z00043","z00001");

        List emplist = new ArrayList();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        emplist.add(emp6);

        Map<String,Integer> managerIDMap = new HashMap<>();
        Employee e = null;
        for(int i=0; i<emplist.size(); i++)
        {
            e =(Employee) emplist.get(i);
            if(!managerIDMap.containsKey(e.getManagerId()))
            {
                managerIDMap.put(e.getManagerId(),1);
            }
            else
            {
                freq = managerIDMap.getOrDefault(e.getManagerId(),0);

                managerIDMap.put(e.getManagerId(),freq+1);
            }
        }
        for(int i=0; i<emplist.size(); i++)
        {
            e =(Employee) emplist.get(i);
           for (Map.Entry<String,Integer> entry : managerIDMap.entrySet()) {
               if (e.getManagerId().equals(entry.getKey())) {
                   System.out.println("Manager ID :" + e.getManagerId());
                   System.out.println("\n" + e.getEmpCode());
               }

           }
        }
       /* System.out.println("Key = " + entry.getKey() +
                ", Value = " + entry.getValue());*/
    }
}

 class Employee
{
    private String empCode;
    private String managerId;

    public Employee(String empCode, String managerId) {
        this.empCode = empCode;
        this.managerId = managerId;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
