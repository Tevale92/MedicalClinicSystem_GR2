/**
 * Salary class to create a salary object for the Staff object instances.
 * @version 1.4
 * @since 11/18/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

public class Salary {

    /// Salary private data members
    static final int DOC_SALARY = 40;
    static final int RECEPT_SALARY = 25;
    private boolean isDoctor = true;
    private double salary = 0;

    /**
     * Parameterized constructor for the Salary class.
     * @param isDoctor
     * @param hours
     */
    public Salary(boolean isDoctor, double hours) {
        setPosition(isDoctor);
        calculateSalary(hours);
    }

    /**
     * Setter method to set which type of position the employee has.
     * @param isDoctor
     */
    public void setPosition(boolean isDoctor) {
        this.isDoctor = isDoctor;
    }

    /**
     * Method to add to the employee's salary depending on the position the employee holds.
     * @param hours
     * @throws IllegalArgumentException
     */
    public void calculateSalary(double hours) {
        if (hours < 0) { // validates hours
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }

        if (isDoctor) { // checks what staff position is
            if (hours > 40) { // check for overtime
                salary += (DOC_SALARY * 40) + (DOC_SALARY * (hours - 40) * 1.5);
            } else {
                salary += DOC_SALARY * hours;
            }
        }
        else {
            if (hours > 40) { // check for overtime
                salary += (RECEPT_SALARY * 40) + (RECEPT_SALARY * (hours - 40) * 1.5);
            } else {
                salary += RECEPT_SALARY * hours;
            }
        }
    }

    /**
     * Method to reset the salary of employee to 0.
     */
    public void resetSalary() {
        this.salary = 0;
    }

    /**
     * Getter method to return the Salary of the employee.
     * @return salary
     */
    public double getSalary() {
        return this.salary;
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
        return String.format("Their current salary is: %.2f.", salary);
    }
}
