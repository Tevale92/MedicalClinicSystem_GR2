import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Receptionist which extends the abstract class Staff.
 * @version 1.1
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Receptionist extends Staff implements Schedulable{

    /// Receptionist private data members
    private ArrayList<Appointment> scheduleList = new ArrayList<>();

    public Receptionist(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double weeklySalary) {
        super(fName, lName, age, gender, dob, staffID, weeklySalary);
    }

    /**
     * Defining interface method from Schedulable to add an Appointment to the list of appointments.
     * @param appointment
     */
    public void scheduleAppointment(Appointment appointment) {
        scheduleList.add(appointment);
    }

    /**
     * Defining interface method from Schedulable to return the list of Appointment objects.
     * @return scheduleList
     */
    public ArrayList<Appointment> getAppointments() {
        return scheduleList;
    }

    /**
     * Defining abstract method from the Staff abstract class to calculate overtime salary.
     * @param hours
     * @return overtimeSalary is 25% more for Receptionist
     * @throws IllegalArgumentException hours cannot be negative
     */
    public double overtimeSalary(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        double overtimeSalary = getWeeklySalary();
        if (hours > 40) {
            overtimeSalary = overtimeSalary/40;
            overtimeSalary = (overtimeSalary * 40) + (overtimeSalary * (hours - 40) * 1.25);
        }
        return overtimeSalary;
    }

    /**
     * Default toString method for the Receptionist subclass.
     * @return Receptionist basic info
     */
    public String toString() {
        return getFName() + " " + getLName() + ". ID = " + getStaffID();
    }
}
