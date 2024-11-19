/**
 * MenuOption enum class to facilitate the reusability of the other code in the Main method.
 * @version 1.4
 * @since 11/16/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */
public enum MenuOption {
    ADD_DOCTOR(1, "Add a new Doctor"),
    ADD_PATIENT(2, "Add a new Patient"),
    ADD_RECEPTIONIST(3, "Add a new Receptionist"),
    DISPLAY_DOCTOR_INFO(4, "Display Doctor Information"),
    DISPLAY_PATIENT_INFO(5, "Display Patient Information"),
    DISPLAY_RECEPTIONIST_INFO(6, "Display Receptionist Information"),
    ADD_TREATMENT(7, "Add a Treatment"),
    VIEW_TREATMENT_DETAILS(8, "View Treatment Details"),
    EDIT_TREATMENT(9, "Edit Treatment"),
    ADD_APPOINTMENT(10, "Add a Appointment"),
    VIEW_APPOINTMENT(11, "View Appointments"),
    EDIT_APPOINTMENT(12, "Edit Appointment"),
    EXIT(13, "Exit");

    /// MenuOption data members
    private final int value;
    private final String description;

    private MenuOption(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

    public static MenuOption fromInt(int i) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == i) {
                return option;
            }
        }
        return null;
    }

}
