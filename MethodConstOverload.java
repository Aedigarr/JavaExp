public class MethodConstOverload {

  public static void main(String[] args) {
    Student student1 = new Student("John Doe", 20);
    System.out.println(student1.getName());
    System.out.println(student1.getAge());

    Student student2 = new Student("Jane Doe", 21);
    System.out.println(student2.getName());
    System.out.println(student2.getAge());
  }

}

class Student {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name) {
    this.name = name;
    this.age = 18;
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

}