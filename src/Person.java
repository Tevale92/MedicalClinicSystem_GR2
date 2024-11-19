import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Abstract Superclass Person which defines
 * the common attributes and methods for any person at the Clinic.
 * @version 1.5
 * @since 11/14/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public abstract class Person implements Schedulable, Treatable{

    /// Person private data members
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private LocalDate dob;
    private ArrayList<Treatment> treatmentsList = new ArrayList<>();
    private ArrayList<Appointment> appointmentList = new ArrayList<>();

    /**
     * Parameterized constructor for the Person class.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     */
    public Person(String fName, String lName, int age, String gender, LocalDate dob) {
        setFName(fName);
        setLName(lName);
        setAge(age);
        setGender(gender);
        setDob(dob);
    }

    /**
     * Setter method to set the Person object's first name.
     * @param fName
     */
    public void setFName(String fName) {
        this.fName = fName;
    }
    /**
     * Setter method to set the Person object's last name.
     * @param lName
     */
    public void setLName(String lName) {
        this.lName = lName;
    }
    /**
     * Setter method to set the Person object's age.
     * @param age
     * @throws IllegalArgumentException if age is less than 0 or greater than 120
     */
    public void setAge(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.age = age;
    }
    /**
     * Setter method to set the Person object's gender.
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Setter method to set the Person object's date of birth.
     * @param dob
     */
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    /**
     * Implementing Treatable interface method to add a treatment to the Persons's treatments.
     * @param treatment
     */
    public void performTreatment(Treatment treatment) {
        treatmentsList.add(treatment);
    }
    /**
     * Implementing Schedulabe interface method to add an appointment to the Persons's appointments.
     * @param appointment
     */
    public void scheduleAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }


    /**
     * Getter method to return the Person object's first name.
     * @return fName
     */
    public String getFName() {
        return fName;
    }
    /**
     * Getter method to return the Person object's last name.
     * @return lName
     */
    public String getLName() {
        return lName;
    }
    /**
     * Getter method to return the Person object's age.
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * Getter method to return the Person object's gender.
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * Getter method to return the Person object's date of birth.
     * @return dob
     */
    public LocalDate getDob() {
        return dob;
    }
    /**
     * Implementing the Treatable interface method to return the Patient's treatments.
     * @return treatments.
     */
    public ArrayList<Treatment> treatmentDescs() {
        return treatmentsList;
    }
    /**
     * Implementing the Schedulable interface method to return the Patient's appointments.
     * @return appointments.
     */
    public ArrayList<Appointment> getAppointments() {
        return appointmentList;
    }

    /**
     * Default toString method for the Person class.
     * @return first name, last name and age
     */
    public String toString() {
        return String.format("%s %s, %s years old.", getFName(), getLName(),
                getAge());
    }

    /// Abstract person method to update the basic person data members.
    public abstract void updateInfo(String fName, String lName, int age, String gender, LocalDate dob);
    /// Abstract person method to display more detailed info on the person.
    public abstract String displayInfo();
    /// Abstract person method to get the person's id
    public abstract String getId();

}
