package helloWorld;

/**
 * This is a standard implementation of "Hello World!" with return
 * 
 * @author Mark Elliott
 * @version 1.0
 */

public class Hello {
	
  public static String getString() {
    return "Hello World!";
  }

  public static void main(String[] args) {
	  String myString = getString();
	  System.out.print(myString);
  }
  
}