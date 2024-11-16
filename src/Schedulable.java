import java.util.ArrayList;

/**
 * Schedulable interface which declares two methods.
 * The scheduleAppointment method is to add an Appointment to the list of appointments.
 * The getAppointments is a getter method to return the list of appointments.
 * @version 1.3
 * @since 11/15/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */

interface Schedulable {

    public void scheduleAppointment(Appointment appointment);

    public ArrayList<Appointment> getAppointments();

}