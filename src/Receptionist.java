import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Receptionist which extends the abstract class Staff.
 * @version 1.1
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Receptionist extends Staff{

    /// Receptionist private data members
    private ArrayList<LocalDate> scheduleList = new ArrayList<>();

    public Receptionist(String fName, String lName, int age, String gender, LocalDate dob, String staffID, double weeklySalary) {
        super(fName, lName, age, gender, dob, staffID, weeklySalary);
    }

    /**
     * Method to add a date to the schedule list of the Receptionist.
     * @param date
     */
    public void addSchedule(LocalDate date) {
        scheduleList.add(date);
    }

    /**
     * Method to return the schedule list of the Receptionist.
     * @return scheduleList
     */
    public ArrayList<LocalDate> getScheduleList() {
        return scheduleList;
    }

    /**
     * Defining abstract method from the Staff abstract class.
     * @param hours
     * @return overtimeSalary is 25% more for Receptionist
     */
    public double overtimeSalary(double hours) {
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
        return "";
    }
}
