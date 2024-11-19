import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Receptionist which extends the abstract class Staff and implements the Schedulable interface.
 * Represents a Receptionist in the clinic who has a lit of all the scheduled appointments.
 * @version 1.5
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Receptionist extends Staff {

    /**
     * Parameterized constructor for the Receptionist class.
     * Creates a Doctor object by calling the Staff constructor and initializing the Doctor data members.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param staffID
     * @param hoursWorked
     */
    public Receptionist(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double hoursWorked, double rate) {
        super(fName, lName, age, gender, dob, staffID, hoursWorked, rate);
    }

    /**
     * Defining abstract method from the Person superclass to update the general info.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     */
    public void updateInfo(String fName, String lName, int age, String gender, LocalDate dob) {
        setFName(fName);
        setLName(lName);
        setAge(age);
        setGender(gender);
        setDob(dob);
    }

    /**
     * Default toString method for the Receptionist subclass.
     * @return Receptionist basic info
     */
    public String toString() {
        return String.format("Staff ID: %s, Dr. %s %s", getId(), getFName(), getLName());
    }

    /**
     * Defining abstract method to return all relevant info on the Receptionist.
     * @return Receptionist full info
     */
    public String displayInfo() {
        return String.format("Staff ID: %s, %s %s%n%s%n" +
        "The list of appointments is; %s", getId(), getFName(),
        getLName(), getStaffSalary(), getAppointments());
    }
}
