import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Subclass Patient which extends Person class and implements the Treatable and Schedulable interfaces.
 * Represent a Patient in the clinic with specific attributes and behaviors.
 * @version 1.5
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Patient extends Person {

    /// Private Data members
    private String patientId;
    private String diagnostic;
    private LocalDate admitDate;
    private LocalDate dismissedDate;
    private Doctor currentDoctor;
    private Billing patientBill = new Billing();

    /**
     * Default parameterized constructor for the Patient Class.
     * @param fName
     * @param lName
     * @param age
     * @param gender
     * @param dob
     * @param patientId
     * @param diagnostic
     * @param admitDate
     * @param dismissedDate
     */
    public Patient(String fName, String lName, int age, String gender, LocalDate dob, String patientId, String diagnostic,
        LocalDate admitDate, LocalDate dismissedDate) {
        super(fName, lName, age, gender, dob);

        setPatientId(patientId);
        setDiagnostic(diagnostic);
        setAdmitDate(admitDate);
        setDismissedDate(dismissedDate);
    }

    /**
     * Setter method to set the patient's ID.
     * @param patientId
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    /**
     * Setter method to set the patient's diagnostic.
     * @param diagnostic
     */
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
    /**
     * Setter method to set the patient's adimt date.
     * @param admitDate
     */
    public void setAdmitDate(LocalDate admitDate) {
        this.admitDate = admitDate;
    }
    /**
     * Setter method to set the patient's dismissal date.
     * @param dismissedDate
     */
    public void setDismissedDate(LocalDate dismissedDate) {
        this.dismissedDate = dismissedDate;
    }
    /**
     * Setter method to set the patient's doctor.
     * @param currentDoctor
     */
    public void setCurrentDoctor(Doctor currentDoctor) {
        this.currentDoctor = currentDoctor;
    }
    /**
     * Implementing Treatable interface method to add a treatment to the patient's treatment list.
     * @param treatment
     */
    public void performTreatment(Treatment treatment) {
        super.performTreatment(treatment);
        patientBill.addBill(treatment.getTreatmentCost());
    }

    /**
     * Getter method to return the patient ID.
     * @return patientID
     */
    public String getId() {
        return  patientId;
    }
    /**
     * Getter method to return the patient's diagnostic.
     * @return diagnostic
     */
    public String getDiagnostic() {
        return diagnostic;
    }
    /**
     * Getter method to return the patient's admission date.
     * @return admitDate
     */
    public LocalDate getAdmitDate() {
        return  admitDate;
    }
    /**
     * Getter method to return the patient's dismissal date.
     * @return dismissedDate
     */
    public LocalDate getDismissedDate() {
        return dismissedDate;
    }
    /**
     * Getter method to return the patient's current Doctor.
     * @return currentDoctor
     */
    public Doctor getCurrentDoctor() {
        return currentDoctor;
    }
    /**
     * Getter method to return the total billing amount of patientBill.
     * @return The total treatment cost for the patient.
     */
    public double getTotalFees() {
        return patientBill.getTotBillingAmount();
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
     * Default toString method for the Patient class.
     * @return the patient's Info.
     */
    @Override
    public String toString() {
        return  String.format("Patient ID: %s, Name: %s %s",
                getId(), getFName(), getLName());
    }

    /**
     * Defining abstract method to return all relevant info on the Patient.
     * @return Patient full info
     */
    public String displayInfo() {
        return String.format("Patient ID: %s, Name: %s %s%nCurrent Doctor: %s%nDiagnosis: %s%n%s",
        getId(), getFName(), getLName(), getCurrentDoctor(), getDiagnostic(), patientBill);
    }
}
