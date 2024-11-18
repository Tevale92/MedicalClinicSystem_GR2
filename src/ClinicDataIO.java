import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClinicDataIO {
    // File path for saving and reading data
    private static final String DOCTORS_FILE = "data/doctors.txt";
    private static final String PATIENTS_FILE = "data/patients.txt";
    private static final String TREATMENTS_FILE = "data/treatments.txt";

    /**
     * Saves the list of doctors to the doctors.txt file.
     * Each doctor is written as a single line in a structured format.
     *
     * @param doctors List of doctors to save
     */
    public static void saveDoctors(List<Doctor> doctors) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(DOCTORS_FILE))) {
            // Iterate through the list of doctors
            for (Doctor doctor : doctors) {
                // Save the doctor's attributes in a structured format
                writer.printf(
                        "Staff ID: %s, First Name: %s, Last Name: %s, Description: %s, Weekly Salary: %.2f%n",
                        doctor.getStaffID(),
                        doctor.getFName(),
                        doctor.getLName(),
                        doctor.getDrDesc(),
                        doctor.getWeeklySalary()
                );
            }
            System.out.println("Doctors saved successfully.");
        } catch (IOException e) {
            // Handle exception during file writing
            System.err.println("Error saving doctors: " + e.getMessage());
        }
    }

    /**
     *
     * @param patients List of patients to save
     */
    public static void savePatient(List<Patient> patients) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PATIENTS_FILE))) {
            for (Patient patient : patients) {
                // Save the patient's attributes in a structured format
                writer.printf(
                        "Patient ID: %s, First Name: %s, Last Name: %s, Age: %d, Gender: %s, Diagnosis: %s%n",
                        patient.getPatientId(),
                        patient.getFName(),
                        patient.getLName(),
                        patient.getAge(),
                        patient.getGender(),
                        patient.getDiagnostic()
                );
            }
            System.out.println("Patients saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving patients: " + e.getMessage());
        }
    }

    /**
     * Reads doctors from the doctors.txt file.
     * Parses each line of the file and reconstructs the list of Doctor objects.
     *
     * @return List of doctor objects read from the file
     */
    public static List<Doctor> readDoctors() {
            List<Doctor> doctors = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(DOCTORS_FILE))) {
                String line;
                // Read the file line by line
                while ((line = reader.readLine()) != null) {
                    // Splits the line into key-value pairs
                    String[] parts = line.split(", ");

                    // Extract and parse the values from each key value pair
                    String staffID = parts[0].split(": ")[1];
                    String fName = parts[1].split(": ")[1];
                    String lName = parts[2].split(": ")[1];
                    String drDesc = parts[3].split(": ")[1];
                    double weeklySalary = Double.parseDouble(parts[4].split(": ")[1]);

                    // Reconstruct the Doctor object using the extracted values
                    Doctor doctor = new Doctor(fName, lName, 45, "N/A", null, staffID, weeklySalary, drDesc);
                    doctors.add(doctor);

                }
                System.out.println("Doctors loaded successfully.");
            } catch (IOException | ArrayIndexOutOfBoundsException e) {
                // Handle errors during file reading or parsing
                System.err.println("Error reading doctors: " + e.getMessage());
            }
            return doctors;
        }
    }




