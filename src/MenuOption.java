
/**
 *
 * @version 1.3
 * @since 11/16/2024
 * @author Louis Chartier, Rima Dagher and David Demers
 */
public enum MenuOption {
    ADD_DOCTOR(1, "Add a new Doctor"),
    ADD_PATIENT(2, "Add a new Patient"),
    DISPLAY_DOCTOR_INFO(3, "Display Doctor Information"),
    DISPLAY_PATIENT_INFO(4, "Display Patient Information"),
    ADD_TREATMENT(5, "Add a Treatment"),
    VIEW_TREATMENT_DETAILS(6, "View Treatment Details"),
    EDIT_TREATMENT(7, "Edit Treatment"),
    EXIT(8, "Exit");




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
