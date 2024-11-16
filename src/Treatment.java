import java.time.LocalDate;

/**
 * Treament class which creates an object to describe the Treatment for the Patient.
 * @version 1.3
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Treatment {

    /// Treatment private data members
    private String treatmentID;
    private String treatmentDesc;
    private LocalDate treatmentDate;
    private String treatmentDuration;
    private Doctor prescribedBy;
    private double treatmentCost;

    /**
     * Parameterized constructor for the Treatment class.
     * @param treatmentDesc
     * @param treatmentDuration
     * @param prescribedBy
     * @param treatmentCost
     */
    public Treatment(String treatmentID, String treatmentDesc, LocalDate aDate,
            String treatmentDuration, Doctor prescribedBy, double treatmentCost) {
        setTreatmentID(treatmentID);
        setTreatmentDesc(treatmentDesc);
        setTreatmentDuration(treatmentDuration);
        setTreatmentDate(aDate);
        setPrescribedBy(prescribedBy);
        setTreatmentCost(treatmentCost);
    }

    /**
     * Setter method to set the treatment description.
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
     * @param prescribedBy
     */
    public void setPrescribedBy(Doctor prescribedBy) {
        this.prescribedBy = prescribedBy;
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
    public Doctor getPrescribedBy() {
        return this.prescribedBy;
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
        return "The treatment description is: " + getTreatmentDesc() + "\nThe treatment duration is: "
                + getTreatmentDuration() + "The treatment was prescribed by: " + getPrescribedBy()
                + "\nThe treatment cost is: " + getTreatmentCost();

    }


}
