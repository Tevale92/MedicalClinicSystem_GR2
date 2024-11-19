import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        /// ArrayLists for the user to add to
        ArrayList<Person> mcsPeople = new ArrayList<>();
        ArrayList<Treatment> allTreatments = new ArrayList<>();
        ArrayList<Appointment> allAppointments = new ArrayList<>();

        /// Sample data to print to file for now and have some data for the user.
        Person firstDoc = new Doctor("John", "Doe", 55, "Male",
                LocalDate.parse("1969-01-01"), "1234", 40, 35, "Cardiologist");
        Person secondDoc = new Doctor("Blake", "Smith", 45, "Male",
                LocalDate.parse("1979-01-01"), "4321", 45, 35, "Emergency");
        Person firstPatient = new Patient("Anna", "Lavine", 35, "Female",
                LocalDate.parse("1989-01-01"), "9876", "Asthma", LocalDate.parse("2024-10-01"), LocalDate.parse("2024-10-05"));
        Person secondPatient = new Patient("Lea", "Salomon", 40, "Female",
                LocalDate.parse("1984-01-01"), "6789", "Sick", LocalDate.parse("2024-11-01"), LocalDate.parse("2024-11-05"));
        Treatment aTreatment = new Treatment("123", "Asthma pump twice a day",
                LocalDate.parse("2024-10-01"),"2 weeks", "1234", 60.5);
        Appointment appt1 = new Appointment(firstPatient, firstDoc, LocalDate.parse("2024-11-05"));
        Appointment appt2 = new Appointment(firstPatient, secondDoc, LocalDate.parse("2024-11-10"));
        /// adding to the ArrayList
        mcsPeople.add(firstPatient);
        mcsPeople.add(secondPatient);
        mcsPeople.add(firstDoc);
        mcsPeople.add(secondDoc);
        allTreatments.add(aTreatment);
        allAppointments.add(appt1);
        allAppointments.add(appt2);

        ClinicDataIO.savePersons(mcsPeople);


        System.out.print("Welcome to the Medical Clinic System!\n");

        while (true) {
            for (MenuOption option : MenuOption.values()) {
                System.out.print(option.getValue() + ". " + option.getDescription() + "\n");
            }

            ConsoleShortcuts.optionMsg();
            int choice = input.nextInt();

            MenuOption selectedOption = MenuOption.fromInt(choice);

            if (selectedOption == null) {
                ConsoleShortcuts.incorrectInput();
                continue;
            }

            switch (selectedOption) {
                case ADD_DOCTOR -> mcsPeople.add(ConsoleShortcuts.addDoctor(input));
                case ADD_PATIENT -> mcsPeople.add(ConsoleShortcuts.addPatient(input));
                case ADD_RECEPTIONIST -> mcsPeople.add(ConsoleShortcuts.addReceptionist(input));
                case DISPLAY_DOCTOR_INFO -> System.out.println(selectDoctor(mcsPeople).displayInfo());
                case DISPLAY_PATIENT_INFO -> System.out.println(selectPatient(mcsPeople).displayInfo());
                case DISPLAY_RECEPTIONIST_INFO -> System.out.println(selectReceptionist(mcsPeople).displayInfo());
                case ADD_TREATMENT -> selectPatient(mcsPeople).performTreatment(ConsoleShortcuts.addTreatment(input));
                case VIEW_TREATMENT_DETAILS -> System.out.println(selectPatient(mcsPeople).treatmentDescs());
                case EDIT_TREATMENT -> System.out.println(selectTreatment(selectPatient(mcsPeople).treatmentDescs()).editTreatment(ConsoleShortcuts.addTreatment(input)));
                case ADD_APPOINTMENT -> allAppointments.add(ConsoleShortcuts.addAppointment(selectPatient(mcsPeople), selectDoctor(mcsPeople), getDate()));
                case VIEW_APPOINTMENT -> System.out.println(allAppointments);
                case EDIT_APPOINTMENT -> System.out.println(selectAppointment(allAppointments).editAppointment(ConsoleShortcuts.addAppointment(selectPatient(mcsPeople), selectDoctor(mcsPeople), getDate())));
                case EXIT -> {
                    System.out.println("Exiting Medical Clinic System...");
                    input.close();
                    return;
                }
            }
            ConsoleShortcuts.lineMsg();
            ClinicDataIO.savePersons(mcsPeople);
        }
    }

    /// Scanner declaration
    static Scanner input = new Scanner(System.in);

    /// Getter method to return a selected Patient from a choice of patients.
    private static Person selectPatient(ArrayList<Person> personList) {
        int i = 0;
        int j = 0;
        /// ArrayList to hold which index in personList is a Patient
        ArrayList<Integer> index = new ArrayList<>();

        for (Person person: personList) {
            if (person instanceof Patient) {
                i++;
                System.out.println(i + ". " + person);
                index.add(j);
            }
            j++;
        }
        ConsoleShortcuts.optionMsg();
        int patientChoice = input.nextInt();

        return personList.get(index.get(patientChoice-1));
    }
    /// Getter method to return a selected Doctor from a choice of Doctors.
    private static Person selectDoctor(ArrayList<Person> personList) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> index = new ArrayList<>();
        /// ArrayList to hold which index in personList is a Doctor
        for (Person person: personList) {
            if (person instanceof Doctor) {
                i++;
                System.out.println(i + ". " + person);
                index.add(j);
            }
            j++;
        }
        ConsoleShortcuts.optionMsg();
        int doctorChoice = input.nextInt();

        return personList.get(index.get(doctorChoice-1));
    }
    /// Getter method to return a selected Doctor from a choice of Doctors.
    private static Person selectReceptionist(ArrayList<Person> personList) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> index = new ArrayList<>();
        /// ArrayList to hold which index in personList is a Receptionist
        for (Person person: personList) {
            if (person instanceof Receptionist) {
                i++;
                System.out.println(i + ". " + person);
                index.add(j);
            }
            j++;
        }
        ConsoleShortcuts.optionMsg();
        int receptionistChoice = input.nextInt();

        return personList.get(index.get(receptionistChoice-1));
    }
    /// Getter method to return a selected Treatment from a choice of Treatments.
    private static Treatment selectTreatment(ArrayList<Treatment> treatmentList) {
        int i = 0;

        for (Treatment treatment: treatmentList) {
            i++;
            System.out.println(i + ". " + treatment);
        }
        ConsoleShortcuts.optionMsg();
        int treatmentChoice = input.nextInt();

        return treatmentList.get(treatmentChoice-1);
    }
    /// Getter method to return a selected Appointment from a choice of Appointments.
    private static Appointment selectAppointment(ArrayList<Appointment> appointmentList) {
        int i = 0;

        for (Appointment appointment: appointmentList) {
            i++;
            System.out.println(i + ". " + appointment);
        }
        ConsoleShortcuts.optionMsg();
        int appointmentChoice = input.nextInt();

        return appointmentList.get(appointmentChoice-1);
    }
    /// Getter method to return a LocalDate object.
    private static LocalDate getDate() {
        ConsoleShortcuts.apptDateMsg();
        LocalDate date = LocalDate.parse(input.next());

        return date;
    }

}