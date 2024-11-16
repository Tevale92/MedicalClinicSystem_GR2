import java.time.LocalDate;

/**
 * Appointment class which creates an object to describe the Appointment for the Patient and Staff.
 * @version 1.3
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Appointment {

    /// Appointment private data members
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    /**
     * Parameterized constructor to create an Appointment object.
     * @param aPatient
     * @param aDoctor
     * @param aDate
     */
    public Appointment(Patient aPatient, Doctor aDoctor, LocalDate aDate) {
        setPatient(aPatient);
        setDoctor(aDoctor);
        setDate(aDate);
    }

    /**
     * Setter method to set the Patient of the appointment.
     * @param aPatient
     */
    public void setPatient(Patient aPatient) {
        this.patient = aPatient;
    }
    /**
     * Setter method to set the Doctor of the appointment.
     * @param aDoctor
     */
    public void setDoctor(Doctor aDoctor) {
        this.doctor = aDoctor;
    }
    /**
     * Setter method to set the Date of the appointment.
     * @param aDate
     */
    public void setDate(LocalDate aDate) {
        this.date = aDate;
    }

    /**
     * Getter method to return the Patient of the appointment.
     * @return person
     */
    public Patient getPatient() {
        return patient;
    }
    /**
     * Getter method to return the Doctor of the appointment.
     * @return doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }
    /**
     * Getter method to return the LocalDate of the appointment.
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Default toString method of the Appointment class.
     * @return Appointment info
     */
    public String toString() {
        return "This appointment is with the patient: " + getPatient() + " and the doctor: " + getDoctor() +
                ".\nThe appointment is supposed to take place on: " + getDate();
    }
}
