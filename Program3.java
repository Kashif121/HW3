/*
 * This program intends to calculate to read dates from an input text file and then
 *calculate the age from that specific date to the current date. It utilizes various  
 * different libaries to capture the current timezone such as the Date and Calender class.
 *  This program compiles and runs perfectly. 
 */
package program3.pkg1;

import java.util.Scanner; 
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.io.PrintStream;

public class Program31 {

    public static double currentMonth, currentYear, currentDay; //global variables because we will need to use them across methods
    
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(new File("Age.txt"));
     PrintStream ps= new PrintStream("output.txt");
     double recordDay, recordMonth, recordYear, age; 
       
     getRealDate(); //Invoke method that establishes what the real month, date, and year are 
       
      while (sc.hasNext()) {
         recordMonth=sc.nextDouble(); //Reads in values from input text file
         recordDay=sc.nextDouble();
         recordYear=sc.nextDouble();
         age = (currentYear - recordYear) + (currentMonth - recordMonth) / 12; //Does basic arithmetic to determine age of records in input file
        ps.printf("For %.0f, %.0f, and %.0f your age is %.0f%n%n%n",  //Formats presentation of data
        recordMonth, recordDay, recordYear, age); 
    }
    }
    

    public static void getRealDate() {
    
        Date date = new Date();		//Date methods

        Calendar calendar = Calendar.getInstance(); //method used to obtain calender utilizing current time zone

        calendar.setTime(date); //Set the date into the calendar 

 
        currentDay = calendar.get(Calendar.DAY_OF_MONTH);	//Obtain quantity of current day, month, and year
 
        currentMonth = calendar.get(Calendar.MONTH);		//Assign those quantities to each respecitive current variable
 
        currentYear = calendar.get(Calendar.YEAR);		

 } 
    
}
