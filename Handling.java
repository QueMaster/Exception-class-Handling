import java.util.Scanner;
public class Handling
{
 public static void main(String[] args)
 {
  Scanner key = new Scanner(System.in);
  String message = "Enter your age number";
  System.out.println(message.length());
  String input  = key.nextLine();
  try
  {
    int numeric = Integer.parseInt(input);
  }
  catch(NumberFormatException exc)
  {
	String errorMessage = "Re-Enter your numeric age ";
    System.out.println(errorMessage);
    input = key.nextLine();
    System.out.println("Numeric Number is"+""+input);	
  }
    System.out.println("The program continues!!!");

 }
}