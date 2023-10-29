import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scn.nextLine();
    System.out.print("Enter your age: ");
    int age = scn.nextInt();
    System.out.println("Hello " + name + ", you are " + age + " years old.");
    scn.close();    
}
}

