import java.time.LocalDate;

/**
 * Appointment class which creates an object to describe the Appointment for the Patient and Staff.
 * @version 1.5
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Appointment {

    /// Appointment private data members
    private Person patient;
    private Person doctor;
    private LocalDate date;

    /**
     * Parameterized constructor to create an Appointment object.
     * @param aPatient
     * @param aDoctor
     * @param aDate
     */
    public Appointment(Person aPatient, Person aDoctor, LocalDate aDate) {
        setPatient(aPatient);
        setDoctor(aDoctor);
        setDate(aDate);
    }

    /**
     * Setter method to set the Patient of the appointment.
     * @param aPatient
     */
    public void setPatient(Person aPatient) {
        this.patient = aPatient;
    }
    /**
     * Setter method to set the Doctor of the appointment.
     * @param aDoctor
     */
    public void setDoctor(Person aDoctor) {
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
     * Method to edit and return an Appointment.
     */
    public Appointment editAppointment(Appointment aAppointment) {
        setPatient(aAppointment.getPatient());
        setDoctor(aAppointment.getDoctor());
        setDate(aAppointment.getDate());

        return this;
    }

    /**
     * Getter method to return the Patient of the appointment.
     * @return person
     */
    public Person getPatient() {
        return patient;
    }
    /**
     * Getter method to return the Doctor of the appointment.
     * @return doctor
     */
    public Person getDoctor() {
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
