/*
 * This program intends to read a number from an input text file and run each of these 
 *numbers through various methods that determine the Fibonacci sequence, the Factorial,
 *and the sum of squares. This will then be printed to an output text file with the 
 *first column being the Fibonacci, the second being Factorial, and the third being sum of squares.
 *   This program compiles and runs without any errors or issues. 
 */
package numbers;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Numbers {


    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(new File ("Numbers.txt"));
        PrintStream ps = new PrintStream("output.txt");
		
		int n;
		
                //While loop is used to scan from the input file
		while (sc.hasNext()) {
                n = sc.nextInt();
               
                ps.print(Fibonacci(n)+" ");
                ps.print(Factorial(n)+" ");
                ps.println(square(n));
           
                //Use ps.print to print to output txt file 
                //Invoke methods in while loop to run all the input numbers into them 
               
            }
		
		 
		
            }

     public static int Factorial(int n) { //paremeter n is necessary here as we are reading n in from the input file
	int i;
	int multiplication; //Multiplication also sounds for product 
	multiplication=1;
	
        for(i=1; i<=n; i++) { //For loop is necessary so as we incremement repeatedly according to conditions specified
	multiplication= multiplication* i; // For each new number going throught the number, the last numbers factorial times the new number gives you the new number factorial
	 }
   
        return multiplication; //Return value to main
     }
	 
	 
	 

     public static int Fibonacci(int n) {
	int number1 = 1;   //First two numbers are intialized 
	int number2 = 0;
        int number3;      //number 3 will be given the value of number 2+ number1
        int i = 0;
      
        while (i< n+1) {
  
            
            number3 = number2 + number1;
            number1 = number2;
            number2 = number3;      //number 2 will be assigned the value of number 3
            i= i + 1;
	    
		}
	   return number2;
         }
		
	public static int square (int n) {
	int i;
	int addition;
	addition=0;
	
  
	for(i=1; i<=n; i++) 
	addition= addition+ (i*i); //As new numbers increment throught the loop, past numbers sum of squares are added to the new number squared. 
        return addition;          //Example: 1^2+2^2=5 (sum of square for 2)
	}
}

