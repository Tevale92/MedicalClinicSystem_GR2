import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleShortcuts {

    /// Print messages for Person data members.
    public static void firstNameMsg() {
        System.out.print("\nEnter the first name: ");
    }
    public static void lastNameMsg() {
        System.out.print("\nEnter the last name: ");
    }
    public static void ageMsg() {
        System.out.print("\nEnter the age: ");
    }
    public static void genderMsg() {
        System.out.print("\nEnter the gender: ");
    }
    public static void dobMsg() {
        System.out.print("\nEnter the date of birth [yyyy-MM-dd]: ");
    }
    /// Print message for patient id or staff id.
    public static void idMsg() {
        System.out.print("\nEnter the person's id (no spaces): ");
    }
    /// Print messages for Patient data members.
    public static void diagnosticMsg() {
        System.out.print("\nEnter their diagnosis (no spaces, _ seperated): ");
    }
    public static void admitMsg() {
        System.out.print("\nEnter their admission date: ");
    }
    public static void dismissMsg() {
        System.out.print("\nEnter their dismissal date: ");
    }
    /// Print messages for Doctor or Receptionist data members.
    public static void hoursMsg() {
        System.out.print("\nEnter their hours worked this week: ");
    }
    public static void rateMsg() {
        System.out.print("\nEnter their salary rate: ");
    }
    public static void descripMsg() {
        System.out.print("\nEnter their description: ");
    }
    /// Print messages for Treatment data members.
    public static void treatIdMsg() {
        System.out.print("\nEnter the treatment id: ");
    }
    public static void treatDesMsg() {
        System.out.print("\nEnter the treatment description: ");
    }
    public static void treatDateMsg() {
        System.out.print("\nEnter the treatment date: ");
    }
    public static void treatDurationMsg() {
        System.out.print("\nEnter the treatment duration: ");
    }
    public static void treatDoctorIdMsg() {
        System.out.print("\nEnter the doctor id: ");
    }
    public static void treatCostMsg() {
        System.out.print("\nEnter the cost: ");
    }
    /// Print messages for Appointment data members.
    public static void apptPatientMsg() {
        System.out.print("\nChoose the patient: ");
    }
    public static void apptDoctorMsg() {
        System.out.print("\nChoose the doctor: ");
    }
    public static void apptDateMsg() {
        System.out.print("\nEnter the appointment date: ");
    }
    /// Generic console print messages.
    public static void optionMsg() {
        System.out.print("\nEnter an option: ");
    }
    public static void incorrectInput() {
        System.out.print("\nIncorrect input, please try again: ");
    }
    public static void lineMsg() {
        System.out.print("\n----------------------------------------------\n");
    }

    /// Method to prompt the user to create a Doctor object.
    public static Doctor addDoctor(Scanner input) {
        firstNameMsg();
        String fName = input.next();
        lastNameMsg();
        String lName = input.next();
        ageMsg();
        int age = input.nextInt();
        genderMsg();
        String gender = input.next();
        dobMsg();
        LocalDate dob = LocalDate.parse(input.next());
        idMsg();
        String id = input.next();
        descripMsg();
        String description = input.next();
        hoursMsg();
        double hours = input.nextDouble();
        rateMsg();
        double rate = input.nextDouble();
        /// Instantiating object and returning it.
        Doctor newDoc = new Doctor(fName, lName, age, gender, dob, id, hours, rate, description);
        return newDoc;
    }
    /// Method to prompt the user to create a Patient object.
    public static Patient addPatient(Scanner input) {
        firstNameMsg();
        String fName = input.next();
        lastNameMsg();
        String lName = input.next();
        ageMsg();
        int age = input.nextInt();
        genderMsg();
        String gender = input.next();
        dobMsg();
        LocalDate dob = LocalDate.parse(input.next());
        idMsg();
        String id = input.next();
        diagnosticMsg();
        String description = input.next();
        admitMsg();
        LocalDate admitDate = LocalDate.parse(input.next());
        dismissMsg();
        LocalDate dismissDate = LocalDate.parse(input.next());
        /// Instantiating object and returning it
        Patient newPatient = new Patient(fName, lName, age, gender, dob, id, description, admitDate, dismissDate);
        return newPatient;
    }
    /// Method to prompt the user to create a Receptionist object.
    public static Receptionist addReceptionist(Scanner input) {
        firstNameMsg();
        String fName = input.next();
        lastNameMsg();
        String lName = input.next();
        ageMsg();
        int age = input.nextInt();
        genderMsg();
        String gender = input.next();
        dobMsg();
        LocalDate dob = LocalDate.parse(input.next());
        idMsg();
        String id = input.next();
        hoursMsg();
        double hours = input.nextDouble();
        rateMsg();
        double rate = input.nextDouble();
        /// Instantiating object and returning it
        Receptionist newReceptionist = new Receptionist(fName, lName, age, gender, dob, id, hours, rate);
        return newReceptionist;
    }
    public static Treatment addTreatment(Scanner input) {
        treatIdMsg();
        String id = input.next();
        treatDesMsg();
        String desc = input.next();
        treatDateMsg();
        LocalDate date = LocalDate.parse(input.next());
        treatDurationMsg();
        String duration = input.next();
        treatDoctorIdMsg();
        String doctorId = input.next();
        treatCostMsg();
        double cost = input.nextDouble();
        /// Instantiating object and returning it
        Treatment newTreatment = new Treatment(id, desc, date, duration, doctorId, cost);
        return newTreatment;
    }
    public static Appointment addAppointment(Person patient, Person doctor, LocalDate date) {
        /// Instantiating object and returning it
        Appointment newAppointment = new Appointment(patient, doctor, date);
        return newAppointment;
    }
}
