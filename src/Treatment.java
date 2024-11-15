/**
 *
 * @version 1.1
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Treatment {

    /// Treatment private data members
    private String treatmentDesc;
    private String treatmentDuration;
    private String prescribedBy;
    private double treatmentCost;


    /**
     * Parameterized constructor for the Person class.
     * @param treatmentDesc
     * @param treatmentDuration
     * @param prescribedBy
     * @param treatmentCost
     */
    public Treatment(String treatmentDesc, String treatmentDuration, String prescribedBy, double treatmentCost) {
        setTreatmentDesc(treatmentDesc);
        setTreatmentDuration(treatmentDuration);
        setPrescribedBy(prescribedBy);
        setTreatmentCost(treatmentCost);
    }


    /**
     * Setter method to set the treatment description.
     * @param treatmentDesc
     */
    public void setTreatmentDesc(String treatmentDesc) {
        this.treatmentDesc = treatmentDesc;
    }

    /**
     * Setter method to set the treatment duration.
     * @param treatmentDuration
     */
    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }

    /**
     * Setter method to set prescribed by.
     * @param prescribedBy
     */
    public void setPrescribedBy(String prescribedBy) {
        this.prescribedBy = prescribedBy;
    }

    /**
     * Setter method to set the cost of treatment.
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
     * Getter method to return the treatment description
     * @return treatmentDesc
     */
    public String getTreatmentDesc() {
        return this.treatmentDesc;
    }

    /**
     * Getter method to return the treatment duration
     * @return treatmentDuration
     */
    public String getTreatmentDuration() {
        return this.treatmentDuration;
    }

    /**
     * Getter method to return the prescribed by
     * @return prescribedBy
     */
    public String getPrescribedBy() {
        return this.prescribedBy;
    }

    /**
     * Getter method to return the treatment cost
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
