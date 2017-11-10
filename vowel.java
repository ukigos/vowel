import java.util.Scanner;
class vowel
{
 public static void main(String[] args)
 {
  String i;
 Scanner v=new Scanner(System.in);
  System.out.println("Enter an alphabet:");
  i=v.next();
 switch(i)
{ case "a":
  case "e":
  case "i":
  case "o":
  case "u":
  case "A":
  case "E":
  case "I":
  case "O":
  case "U":
      System.out.println("This is a vowel.");
      break;
default:
    System.out.println("This is a consonant.");
}
 }
}