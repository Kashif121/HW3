/*
 * This program intends to calculate the perimeter/circumfernce and area
 *of certain shapes, depending on what the user wants to. We are going to be scanning
*from the keyboard in this program, as we rely on the user's input to determne which
*shape the calculations will be made for. This program is numerically set up in a way 
*that for rectangle calculations the user will input one, for circle calculations the
*user will input two, and lastly for square calculations any other number works, simply 3.
*  The code compiles and runs perfectly without any issues, and satisfies program
*requirements.
 */
package shapes;

import java.util.Scanner;

public class Shapes {


public static void main(String[] a){ 

    Scanner sc = new Scanner(System.in);
  
    int result; //stores user input and determines what shape the program will calculate
  
    promptUser();  //Invoke method asking user to input what shape they would like
    
    result=sc.nextInt(); //Storing the next scanned integer as result 
  
  

    if (result== 1) {            //If the user selects the number one, a rectangle will be calculated
       rectangleStat(sc, result);//Invokes rectangle method

    }
    else if (result== 2) {      //If the user selects number two, a circle will be calculated
      circleStat(sc, result);   //Invokes circle method

    }
       else {                  //If any other number is inputted, a square will be calculated
         squareStat(sc, result); //Invokes square method
    }

     }

  
public static void promptUser() {  //Prompts user to select shape based on numerical options

    System.out.println("Please choose a shape option: square, rectangle, or circle. For square type 3, for rectangle put 1, or for circle put 2. ");
}
 
 public static void rectangleStat(Scanner sc, int result) {
  
    double length;
  
    double width;
  
    double area;
  
    double perimeter;  
  
  
    System.out.println("Enter a value for Width and press RETURN.");  

  
    width = sc.nextDouble();
  
  
    System.out.println("Enter a value for Length and press RETURN."); 

  
    length = sc.nextDouble();
  
  
    perimeter = (2*width)+(2*length);
  
    
    area = width*length;

  
    System.out.println("When one side is"+ " "+ width +" "+ "and the other side is"+ " "+ length+", the area is" + " "+ area + " "+ "and the perimeter is" + " " + perimeter + "." ); 


 }
 
 public static void circleStat(Scanner sc, int result) {
 
    double radius;
  
    double area;
 
    double circumference;

  
  
    System.out.println("Enter a value for Radius and press RETURN.");  


  
    radius = sc.nextDouble();
 
  

  
    circumference = Math.PI*(2*radius);
  
    area = Math.PI*(radius*radius);

  
  
    System.out.printf("\nWhen the radius %.3f %n"+ " "+ "\nthe circumference is %.3f %n"+ " " + "\nand the area is %.3f %n", radius, circumference, area);
 
  
  }
 
 public static void squareStat(Scanner sc, int result) {
 
    double side;
 
    double area;
 
    double perimeter;  
  
  
    System.out.println("Enter a value for Side and press RETURN.");  

  
    side= sc.nextDouble();
  
  
    perimeter = (4*side);
  
  
    area = side*side;

  
    System.out.println("When one side is"+ " "+ side +", the area is" + " "+ area + " "+ "and the perimeter is" + " " + perimeter + "." ); 


 }

}