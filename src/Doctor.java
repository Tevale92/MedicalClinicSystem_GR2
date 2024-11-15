import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Doctor which extends the abstract class Staff.
 * @version 1.1
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Doctor extends Staff implements Schedulable {

    /// Doctor private data members
    private String drDesc;
    private ArrayList<Person> listOfPatients = new ArrayList<>();
    private ArrayList<Appointment> listOfAppointments = new ArrayList<>();

    /**
     * Parameterized constructor for the Doctor class.
     * Creates a Doctor object by calling the Staff constructor and initializing the Doctor data members.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param staffID
     * @param weeklySalary
     * @param drDesc
     */
    public Doctor(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double weeklySalary, String drDesc) {
        super(fName, lName, age, gender, dob, staffID, weeklySalary);

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
     * Defining interface method from Schedulable to add an Appointment to the list of appointments.
     * @param appointment
     */
    public void scheduleAppointment(Appointment appointment) {
        listOfAppointments.add(appointment);
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
     * Getter method to return the list of LocalDate (appointments) object's of the Doctor.
     * @return listOfAppointments
     */
    public ArrayList<Appointment> getAppointments() {
        return listOfAppointments;
    }

    /**
     * Defining abstract method from the Staff abstract class to calculate overtime salary.
     * @param hours
     * @return overtimeSalary is 50% more for Doctor
     * @throws IllegalArgumentException hours cannot be negative
     */
    public double overtimeSalary(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        double overtimeSalary = getWeeklySalary();
        if (hours > 40) {
            overtimeSalary = overtimeSalary/40;
            overtimeSalary = (overtimeSalary * 40) + (overtimeSalary * (hours - 40) * 1.5);
        }
        return overtimeSalary;
    }

    /**
     * Default toString method for the Doctor subclass.
     * @return Doctor basic info
     */
    public String toString() {
        return "Dr. " + getFName() + " " + getLName() + ", " + getDrDesc() + ". ID = " + getStaffID();
    }

}