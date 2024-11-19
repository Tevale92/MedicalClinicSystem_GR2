import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Abstract subclass Staff which extends the Person class.
 * Defines the common attributes and methods for any Staff at the Clinic.
 * @version 1.5
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public abstract class Staff extends Person{

    /// private data members of the abstract Staff subclass
    private String staffID;
    private double hoursWorked, rate;
    private Salary staffSalary = new Salary();

    /**
     * Parameterized constructor for the abstract Staff subclass.
     * Creates a Staff object by calling the Person constructor and initializing the Staff data members.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param staffID
     * @param hoursWorked
     */
    public Staff(String fName, String lName, int age, String gender, LocalDate dob, String staffID,
                 double hoursWorked, double rate) {
        super(fName, lName, age, gender, dob);

        setStaffID(staffID);
        setHoursWorked(hoursWorked);
        setSalary(hoursWorked, rate);
    }

    /**
     * Method to set the Staff object's staff ID.
     * @param staffID
     */
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    /**
     * Method to set the Staff object's hours worked this week.
     * @param hoursWorked
     * @throws IllegalArgumentException if weekly salary is negative
     */
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours Worked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }
    /// Method to set the Salary object of the Staff object.
    public void setSalary(double hoursWorked, double rate) {
        staffSalary.calculateSalary(hoursWorked, rate);
    }

    /**
     * Getter method to return the Staff object's staff ID.
     * @return staffID
     */
    public String getId() {
        return staffID;
    }
    /**
     * Getter method to return the Staff object's hours worked this week.
     * @return weeklySalary
     */
    public double getHoursWorked() {
        return hoursWorked;
    }
    /**
     * Getter method to return the Staff object's hourly rate.
     * @return weeklySalary
     */
    public double getRate() {
        return rate;
    }
    /** Getter method to return the Staff object's Salary object.
     * @return staffSalary
     */
    public Salary getStaffSalary() {
        return staffSalary;
    }

    /**
     * Implementing Treatable interface method to add a treatment to the patient's treatment list.
     * @param treatment
     */
    public void performTreatment(Treatment treatment) {
        performTreatment(treatment);
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
     * Default toString method for the abstract Staff subclass.
     * @return Staff object's basic information
     */
    public String toString() {
        return String.format("Hours Worked: %.2f at a salary of %.2f$.", getHoursWorked(), getRate());
    }
}
