import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Doctor which extends the abstract class Staff and implements the Schedulable interface.
 * Represents a Doctor in the clinic who has a list of patients and a list of appointments.
 * @version 1.3
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
     * Default toString method for the Doctor subclass.
     * @return Doctor basic info
     */
    public String toString() {
        return String.format("Staff ID: %s, Dr. %s %s, %s", getStaffID(), getFName(),
                getLName(), getDrDesc());
    }

    /**
     * Defining abstract method to return all relevant info on the Doctor.
     * @return Doctor full info
     */
    public String displayInfo() {
        return String.format("Staff ID: %s, Dr. %s %s, %s%nTheir weekly salary is %.2d%n" +
                "Their list of patients is; %s%nTheir list of appointments is; %s", getStaffID(), getFName(),
                getLName(), getDrDesc(), getWeeklySalary(), getListOfPatients(), getAppointments());
    }
}