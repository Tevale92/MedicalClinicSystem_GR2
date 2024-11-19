import java.io.*;
import java.util.ArrayList;

public class ClinicDataIO {

    // File path for saving and reading data
    private static final String PERSONS_FILE = "data/persons.txt";

    /**
     * Saves the list of persons to the persons.txt file.
     * Each doctor is written as a single line in a structured format.
     *
     * @param persons List of doctors to save
     */
    public static void savePersons(ArrayList<Person> persons) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PERSONS_FILE))) {
            // Iterate through the list of doctors
            for (Person person : persons) {
                // Save the doctor's attributes in a structured format
                writer.printf(
                        "First Name: %s, Last Name: %s, Age: %s, Gender: %s, DOB: %s%n",
                        person.getFName(),
                        person.getLName(),
                        person.getAge(),
                        person.getGender(),
                        person.getDob()
                );
            }
            System.out.println("Persons saved successfully.");
        } catch (IOException e) {
            // Handle exception during file writing
            System.err.println("Error saving persons: " + e.getMessage());
        }
    }
}