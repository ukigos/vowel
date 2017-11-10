import java.util.Scanner;
class student
{
 public static void main(String[] args)
{
  int roll;
  String name;
  Scanner s= new Scanner(System.in);
  System.out.println("Enter roll no.");
  roll=s.nextInt();
  System.out.println("Enter name");
  name=s.next();
 System.out.println("Name is: " + name );
 System.out.println("Roll no. is: " + roll);

}

}