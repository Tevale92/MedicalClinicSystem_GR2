import java.util.ArrayList;

/**
 * Treatable interface which declares two methods.
 * The performTreatment method is to add a Treatment to the list of treatments.
 * The treatmentDescs is a getter method to return the list of treatments.
 * @version 1.3
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

interface Treatable {

    public void performTreatment(Treatment treatment);

    public ArrayList<Treatment> treatmentDescs();
}
