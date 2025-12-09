public class HashCodeDemo {

  int i;

  public static void main(String[] args) {

   /* HashCodeDemo hashCodeDemo = new HashCodeDemo(10);
    System.out.println(hashCodeDemo);

    StringBuffer s1 = new StringBuffer("ABC");
    StringBuffer s2 = new StringBuffer("ABC");
    System.out.println(s1.hashCode());

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s2.equals(s1));*/

    Student s1 = new Student(101, "saif");
    Student s2 = new Student(102, "saif");
    s2 = s1;
    Student s3 = new Student(101, "sam");
    String a = "FB";
    String b = "Ea";

    System.out.println(a.equals(b));        // false
    System.out.println("--" + a.hashCode());       // 2236
    System.out.println("--" + b.hashCode());
    /*System.out.println("Before overridden of equals and hashCode");
    System.out.println(s1.equals(s2));//false
    System.out.println(s1 == s2);//false
    System.out.println(s1.hashCode());//460141958
    System.out.println(s2.hashCode());//1163157884*/

    System.out.println("After overridden of equals and hashCode");
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//false
    System.out.println(s1 == s2);//true
    System.out.println(s1 == s3);//false
    System.out.println(s1.hashCode());//460141958
    System.out.println(s2.hashCode());//460141958
    System.out.println(s3.hashCode());//1163157884
  }

  /*public HashCodeDemo(int i){
    this.i = i;
  }*/
  /*public int hashCode(){
    return i;
  }*/

  public String toString() {

    return i + " ";
  }
}

class Student {
  int id;
  String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {

    if (obj instanceof Student) {
      Student student = (Student) obj;
      return this.name.equals(student.name) && this.id == student.id;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return name.hashCode() + id;
  }


}
