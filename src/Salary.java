/**
 * Salary class to create a salary object for the Staff object instances.
 * @version 1.5
 * @since 11/18/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Salary {

    /// Salary private data members
    private double currSalary = 0;

    /// Default constructor for the Salary class.
    public Salary() {
        currSalary = 0;
    }
    /**
     * Parameterized constructor for the Salary class.
     * @param hours
     */
    public Salary(double hours, double rate) {
        calculateSalary(hours, rate);
    }

    /**
     * Method to add to the employee's salary depending on the position the employee holds.
     * @param hours
     * @throws IllegalArgumentException
     */
    public void calculateSalary(double hours, double rate) {
        if (hours < 0) { // validates hours
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }

        if (hours > 40) { // check for overtime
            currSalary += (rate * 40) + (rate * (hours - 40) * 1.5);
        } else {
            currSalary += rate * hours;
        }
    }

    /**
     * Method to reset the salary of employee to 0.
     */
    public void resetSalary() {
        this.currSalary = 0;
    }

    /**
     * Getter method to return the Salary of the employee.
     * @return salary
     */
    public double getSalary() {
        return this.currSalary;
    }

    /**
     * Method to pay out the current salary of employee and reset the salary to 0.
     * @return
     */
    public String payoutSalary() {
        double temp = getSalary();
        resetSalary();
        return String.format("Their current salary of %.2f, has been paid in full.", temp);
    }

    /**
     * Default toString method of the Salary class.
     * @return Current salary info
     */
    public String toString() {
        return String.format("Their current salary is: %.2f.", currSalary);
    }
}
