import java.time.LocalDate;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

/**
 *  Subclass Patient which extends Person class and implement Treatable and Schedulable interfaces.
 *  Represent a patient in the clinic with specific attributes and behaviors.
 *
 * @version 1.1
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */
public class Patient extends  Person implements Schedulable, Treatable{
    // Data members
    private String patientId;
    private String diagnostic;
    ArrayList<Treatment> treatmentsList = new ArrayList<>();
    private LocalDate admitDate;
    private LocalDate dismissedDate;
    private Doctor currentDoctor;
    private ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     *Constructs a new patient with specified details.
     *
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param patientId
     * @param diagnostic
     * @param admitDate
     * @param dismissedDate
     * @param currentDoctor
     * @param appointmentDate
     */
    public Patient(String fName, String lName, int age, String gender, LocalDate dob, String patientId, String diagnostic
    , LocalDate admitDate, LocalDate dismissedDate, Doctor currentDoctor, LocalDate appointmentDate) {
        super(fName, lName, age, gender, dob);
        this.patientId = patientId;
        this.diagnostic = diagnostic;
        this.admitDate = admitDate;
        this.dismissedDate = dismissedDate;
        this.currentDoctor = currentDoctor;

    }


    /**
     * Getter for patientId.
     *
     * @return the patient's ID
     */
    public String getPatientId() {
        return  patientId;
    }

    /**
     *  Sets the patient's ID.
     *
     * @param patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * Getter for diagnostic.
     *
     * @return the patient's diagnostic.
     */
    public String getDiagnostic() {
        return diagnostic;
    }

    /**
     * Sets the patient's diagnostic.
     *
     * @param diagnostic
     */
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    /**
     *
     * @return the treatment list.
     */
    public  ArrayList<Treatment> getTreatmentsList() {
        return treatmentsList;
    }

    /**
     *
     * @return the patient's admitDate.
     */
    public LocalDate getAdmitDate() {
        return  admitDate;
    }

    /**
     * Sets the patient's admit date.
     *
     * @param admitDate
     */
    public void setAdmitDate(LocalDate admitDate) {
        this.admitDate = admitDate;
    }

    /**
     *
     * @return the patient's dismissal date.
     */
    public LocalDate getDismissedDate() {
        return dismissedDate;
    }

    /**
     * Sets the patient's dismissal date.
     *
     * @param dismissedDate
     */
    public void setDismissedDate(LocalDate dismissedDate) {
        this.dismissedDate = dismissedDate;
    }

    /**
     * Method to add a treatment to the treatmentList.
     *
     * @param treatment
     */
    public void addTreatment(Treatment treatment) {
        treatmentsList.add(treatment);
    }

    /**
     *
     * @return the patient's current doctor
     */
    public Doctor getCurrentDoctor() {
        return currentDoctor;
    }

    /**
     * Sets the patient's doctor.
     *
     * @param currentDoctor
     */
    public void setCurrentDoctor(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;
    }

    /**
     * Calculates the total treatments the patients has received by calling the costs
     * of each treatment in treatment list.
     *
     * @return The total treatment cost for the patient.
     */
    public double totalFees() {
        double total = 0.0;
        for(Treatment treatment: treatmentsList) {
            total+= treatment.getTreatmentCost();
        }
        return total;
    }

    /**
     * Schedules an appointment for the patient by adding it to
     * the appointment list.
     *
     * @param appointment
     */
    @Override
    public  void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    /**
     *
     * @return The lists of appointments for the patient.
     */
    @Override
    public  ArrayList<Appointment> getAppointments() {
        return  appointments;
    }

    /**
     * A placeholder for the actual treatment functionality.
     */
    @Override
    public Treatment performTreatment() {
        System.out.println("Performing treatment for patient: " + getFName() + getLName());
        return null;
    }

    /**
     *
     * @return the patient's Info.
     */
    @Override
    public  String toString() {
        return  String.format("Patient ID: %s, Name: %s %s, Diagnosis: %s, Current Doctor: %s, Total Fees: %.2f",
                getPatientId(), getFName(), getLName(), getDiagnostic(), (currentDoctor != null ? getCurrentDoctor().getFName() + " " +
                        currentDoctor.getLName() : "None"), totalFees());
    }


}
