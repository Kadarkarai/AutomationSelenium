package javaSamplePrograms;

import java.util.Scanner;

public class Calculator {
	
	private static char operation;
    private static Double n1, n2, output;
    
	  public static void main(String[] args) {

		// creating an object to get the data
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter an operation to perform : +, -, *, or /");
	    operation = in.next().charAt(0);

	    System.out.println("Enter number one");
	    n1 = in.nextDouble();
	    System.out.println("Enter number two");
	    n2 = in.nextDouble();

	    switch (operation) {
	      case '+':
	        output = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + output);
	        break;

	      case '-':
	        output = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + output);
	        break;

	      case '*':
	        output = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + output);
	        break;

	      case '/':
	        output = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + output);
	        break;

	      default:
	        System.out.println("Invalid operation!");
	        break;
	    }
	    in.close();
	  }
}
