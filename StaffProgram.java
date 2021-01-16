/**
 * @author Brian Klein
 * Date: 9/11/17
 * Program: StaffProgram.java
 * Description: Client program to output staff member information, change staff
 *              member's e-mail address, and give staff member a raise.
 */
import java.util.Scanner;

public class StaffProgram {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        String fName, lName, email, id, title;
        double salary, percentageRaise;
        int month, day, year;

        //get user input to create staff member
        System.out.print ("Enter Staff Member First Name: ");
        fName = console.nextLine();
        System.out.print ("Enter Staff Member Last Name: ");
        lName = console.nextLine();
        System.out.print ("Enter Staff Member Email Address: ");
        email = console.next();
        System.out.print ("Enter Month Staff Member Hired(MM): ");
        month = console.nextInt();
        System.out.print ("Enter Day Staff Member Hired(DD): ");
        day = console.nextInt();
        System.out.print ("Enter Year Staff Member Hired(YY): ");
        year = console.nextInt();
        System.out.print ("Enter Staff Member ID#: ");
        id = console.next();
        console.nextLine();
        System.out.print ("Enter Staff Member Job Title: ");
        title = console.nextLine();
        System.out.print ("Enter Staff Member Salary: $");
        salary = console.nextDouble();
        
        //create a Staff Member object
        StaffMember staff1 = new StaffMember(new PersonInfo(fName, lName, email),
                                             new Date(month, day, year),
                                             id, title, salary);

        

        //print the Staff Member information
        System.out.println (staff1);
        
        //get user input for new email
        System.out.print ("\nEnter New Email Address: ");
        email = console.next();
        staff1.setInfo(new PersonInfo(fName, lName, email));
        
        //print the Staff Member information
        System.out.println (staff1);
        
        System.out.println("\nEnter the raise percentage you would like to award "
                           + "to the Staff Member: ");
        percentageRaise = console.nextDouble()/100;
        staff1.raiseSalary(percentageRaise);
        
        //print the Staff Member information
        System.out.println (staff1);
    }

}
