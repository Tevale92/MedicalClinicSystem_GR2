import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestDataIO {
    public static void main(String[] args) {
        // Create a list of doctors
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("John", "Doe", 45, "Male", LocalDate.of(1979, 4, 15), "D123", 2000.0, "Cardiologist"));
        doctors.add(new Doctor("Jane", "Smith", 38, "Female", LocalDate.of(1985, 6, 23), "D456", 2500.0, "Neurologist"));

        // Save the doctors to a file
        ClinicDataIO.saveDoctors(doctors);

        // Create a list of patients
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Mickey", "Mouse", 30, "Male", LocalDate.of(2000, 4, 12), "P234", "Flu", null, null));

        // Save the patients to a file
        ClinicDataIO.savePatient(patients);

        // Read the doctors back from the file
        List<Doctor> loadedDoctors = ClinicDataIO.readDoctors();

        // Print the loaded doctors
        System.out.println("\nLoaded Doctors:");
        for (Doctor doctor : loadedDoctors) {
            System.out.println(doctor.toString());
        }
    }
}
