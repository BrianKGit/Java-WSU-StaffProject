/**
 * @author Brian Klein
 * Date: 9/11/17
 * Program: StaffMember.java
 * Description: User-defined class to store the staff's personal information,
 *              hiring date, staff ID, title, and salary.
 */
public class StaffMember {
    
    private PersonInfo info;
    private Date hiringDate;
    private String staffID;
    private String title;
    private double salary;
    
    

    public StaffMember() {
    }

    public StaffMember(PersonInfo info, Date hiringDate, String staffID, String title, double salary ) {
        this.info = info;
        this.hiringDate = hiringDate;
        this.staffID = staffID;
        this.title = title;
        setSalary(salary);
    }

    public PersonInfo getInfo() {
        return info;
    }

    public void setInfo(PersonInfo info) {
        this.info = info;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if(this.salary < 0){
            this.salary = 0.00;
        }
            
    }

    @Override
    public String toString() {
        return "\nPersonal Information: " + info + "\nHiring Date: " + 
                hiringDate + "\nStaff ID: " + staffID + "\nJob Title: " + 
                title + "\nSalary: $" + salary;
    }
    
    //method to give staff member a raise based on raise percentage
    public double raiseSalary(double percentageRaise) {
        
        salary = salary * (1 + percentageRaise);
        return salary;
        
        
    }
    
    
}
