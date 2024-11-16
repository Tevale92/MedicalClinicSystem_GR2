import java.util.ArrayList;

interface Schedulable {

    public void scheduleAppointment(Appointment appointment);

    public ArrayList<Appointment> getAppointments();

}