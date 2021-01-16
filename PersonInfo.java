/**
 * @author Brian Klein
 * Date: 9/11/17
 * Program:PersonInfo.java
 * Description: User-defined class to store the person's first name, last name,
 *              and personal e-mail address.
 */
public class PersonInfo {
    
    private String firstName;
    private String lastName;
    private String email;

    public PersonInfo() {
    }

    public PersonInfo(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName + "\nE-mail: " + email;
    }
    
    
    
}
