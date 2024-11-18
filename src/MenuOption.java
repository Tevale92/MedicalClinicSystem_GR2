/**
 * MenuOption enum class to facilitate the reusability of the other code in the Main method.
 * @version 1.4
 * @since 11/16/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */
public enum MenuOption {
    ADD_DOCTOR(1, "Add a Doctor user"),
    ADD_PATIENT(2, "Add a Patient"),
    ADD_RECEPTIONIST(3, "Add a Receptionist user"),
    DISPLAY_DOCTOR_INFO(4, "Display Doctor Information"),
    DISPLAY_PATIENT_INFO(5, "Display Patient Information"),
    ADD_TREATMENT(6, "Add a Treatment"),
    VIEW_TREATMENT_DETAILS(7, "View Treatment Details"),
    EDIT_TREATMENT(8, "Edit Treatment"),
    EXIT(9, "Exit"),
    DOCTOR(10, "Login as Doctor"),
    PATIENT(20, "Login as Patient"),
    RECEPTIONIST(30, "Login as Receptionist");

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
