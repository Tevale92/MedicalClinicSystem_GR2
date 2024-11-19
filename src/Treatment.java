import java.time.LocalDate;

/**
 * Treatment class which creates an object to describe the Treatment for the Patient.
 * @version 1.5
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Treatment {

    /// Treatment private data members
    private String treatmentID;
    private String treatmentDesc;
    private LocalDate treatmentDate;
    private String treatmentDuration;
    private String doctorId;
    private double treatmentCost;

    /**
     * Parameterized constructor for the Treatment class.
     * @param treatmentID
     * @param treatmentDesc
     * @param aDate
     * @param treatmentDuration
     * @param doctorId
     * @param treatmentCost
     */
    public Treatment(String treatmentID, String treatmentDesc, LocalDate aDate,
            String treatmentDuration, String doctorId, double treatmentCost) {
        setTreatmentID(treatmentID);
        setTreatmentDesc(treatmentDesc);
        setTreatmentDuration(treatmentDuration);
        setTreatmentDate(aDate);
        setdoctorId(doctorId);
        setTreatmentCost(treatmentCost);
    }

    /**
     * Setter method to set the treatment ID.
     * @param treatmentID
     */
    public void setTreatmentID(String treatmentID) {
        this.treatmentID = treatmentID;
    }
    /**
     * Setter method to set the treatment description.
     * @param treatmentDesc
     */
    public void setTreatmentDesc(String treatmentDesc) {
        this.treatmentDesc = treatmentDesc;
    }
    /**
     * Setter method to set the treatment Date.
     * @param aDate
     */
    public void setTreatmentDate (LocalDate aDate) {
        this.treatmentDate = aDate;
    }
    /**
     * Setter method to set the treatment duration.
     * @param treatmentDuration
     */
    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }
    /**
     * Setter method to set who prescribed the treatment.
     * @param doctorId
     */
    public void setdoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    /**
     * Setter method to set the cost of the treatment.
     * @param treatmentCost
     * @throws IllegalArgumentException if cost of treatment is less than 0
     */
    public void setTreatmentCost(double treatmentCost) {
        if (treatmentCost < 0) {
            throw new IllegalArgumentException("Treatment cost must be a positive number");
        }
        this.treatmentCost = treatmentCost;
    }

    /**
     * Method to edit and return a Treatment.
     */
    public Treatment editTreatment(Treatment aTreatment) {
        setTreatmentID(aTreatment.getTreatmentID());
        setTreatmentDesc(aTreatment.getTreatmentDesc());
        setTreatmentDuration(aTreatment.getTreatmentDuration());
        setTreatmentDate(aTreatment.getTreatmentDate());
        setdoctorId(aTreatment.getDoctorId());
        setTreatmentCost(aTreatment.getTreatmentCost());

        return this;
    }

    /**
     * Getter method to return the treatment description.
     * @return treatmentDesc
     */
    public String getTreatmentID() {
        return this.treatmentID;
    }
    /**
     * Getter method to return the treatment description.
     * @return treatmentDesc
     */
    public String getTreatmentDesc() {
        return this.treatmentDesc;
    }
    /**
     * Getter method to return the treatment duration.
     * @return treatmentDuration
     */
    public LocalDate getTreatmentDate() {
        return this.treatmentDate;
    }
    /**
     * Getter method to return the treatment description.
     * @return treatmentDesc
     */
    public String getTreatmentDuration() {
        return this.treatmentDuration;
    }
    /**
     * Getter method to return who prescribed the treatment.
     * @return prescribedBy
     */
    public String getDoctorId() {
        return this.doctorId;
    }
    /**
     * Getter method to return the treatment cost.
     * @return treatmentCost
     */
    public double getTreatmentCost() {
        return this.treatmentCost;
    }

    /**
     * Default toString method of Treatment class.
     * @return Treatment info
     */
    public String toString() {
        return "The treatment id is: " + getTreatmentID() + ".\nThe treatment description is: " + getTreatmentDesc() +
                ".\nThe treatment duration is: " + getTreatmentDuration() + ".\nThe id of the doctor who prescribed this treatment: " +
                getDoctorId() + ".\nThe treatment cost is: " + getTreatmentCost();
    }


}
