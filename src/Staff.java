import java.time.LocalDate;

/**
 * Abstract subclass Staff which extends the Person class.
 * Defines the common attributes and methods for any Staff at the Clinic.
 * @version 1.1
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public abstract class Staff extends Person{

    /// private data members of the abstract Staff subclass
    private String staffID;
    private double hoursWorked;

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
    public Staff(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double hoursWorked) {
        super(fName, lName, age, gender, dob);

        setStaffID(staffID);
        setHoursWorked(hoursWorked);
    }

    /**
     * Method to set the Staff object's staff ID.
     * @param staffID
     */
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    /**
     * Method to set the Staff object's weekly salary.
     * @param hoursWorked
     * @throws IllegalArgumentException if weekly salary is negative
     */
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours Worked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    /**
     * Getter method to return the Staff object's staff ID.
     * @return staffID
     */
    public String getStaffID() {
        return staffID;
    }
    /**
     * Getter method to return the Staff object's weekly salary.
     * @return weeklySalary
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Default toString method for the abstract Staff subclass.
     * @return Staff object's basic information
     */
    public String toString() {
        return super.toString() + "\nStaff ID: " + getStaffID() +
                ".\nHours Worked: " + String.format("%.2f$.", getHoursWorked());
    }

}
