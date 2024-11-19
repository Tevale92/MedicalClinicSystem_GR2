import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Doctor which extends the abstract class Staff and implements the Schedulable interface.
 * Represents a Doctor in the clinic who has a list of patients and a list of appointments.
 * @version 1.5
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Doctor extends Staff {

    /// Doctor private data members
    private String drDesc;
    private ArrayList<Person> listOfPatients = new ArrayList<>();

    /**
     * Parameterized constructor for the Doctor class.
     * Creates a Doctor object by calling the Staff constructor and initializing the Doctor data members.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param staffID
     * @param hoursWorked
     * @param drDesc
     */
    public Doctor(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double hoursWorked, double rate, String drDesc) {
        super(fName, lName, age, gender, dob, staffID, hoursWorked, rate);

        setDrDesc(drDesc);
    }

    /**
     * Setter method to set the Doctor object's profession description.
     * @param drDesc
     */
    public void setDrDesc(String drDesc) {
        this.drDesc = drDesc;
    }
    /**
     * Method to add a patient to the list of patients of the Doctor.
     * @param patient
     */
    public void addPatient(Person patient) {
        listOfPatients.add(patient);
    }

    /**
     * Getter method to return the Doctor object's profession description.
     * @return drDesc
     */
    public String getDrDesc() {
        return drDesc;
    }
    /**
     * Getter method to return the list of Patient object's of the Doctor.
     * @return listOfPatients
     */
    public ArrayList<Person> getListOfPatients() {
        return listOfPatients;
    }

    /**
     * Default toString method for the Doctor subclass.
     * @return Doctor basic info
     */
    public String toString() {
        return String.format("Staff ID: %s, Dr. %s %s, %s", getId(), getFName(),
                getLName(), getDrDesc());
    }

    /**
     * Defining abstract method to return all relevant info on the Doctor.
     * @return Doctor full info
     */
    public String displayInfo() {
        return String.format("Staff ID: %s, Dr. %s %s, %s%n%s%n" +
                "Their list of patients is; %s%nTheir list of appointments is; %s", getId(), getFName(),
                getLName(), getDrDesc(), getStaffSalary(), getListOfPatients(), getAppointments());
    }
}