/**
 * Billing class which creates an object to describe the Billing for the Patient.
 * @version 1.4
 * @since 11/18/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Billing {

    /// Billing private data member
    private double totBillingAmount = 0;

    /**
     * Default and Parameterized constructor for the Billing class.
     * @param totBillingAmount
     */
    public Billing(double totBillingAmount) {
        addBill(totBillingAmount);
    }

    /**
     * Setter method to set the total billing amount.
     * @param billingAmount
     */
    public void addBill(double billingAmount) {
        if (billingAmount < 0) {
            throw new IllegalArgumentException("Total amount cannot be negative");
        }
        this.totBillingAmount += billingAmount;
    }

    /**
     * Getter method to return the total billing amount.
     * @return totBillingAmount
     */
    public double getTotBillingAmount() {
        return totBillingAmount;
    }

    /**
     * Default toString method of the Billing class.
     * @return Billing info
     */
    public String toString() {
        return String.format("Total Billing Amount: $%.2f", getTotBillingAmount());
    }
}
