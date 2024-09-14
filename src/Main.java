import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.showMenu;

enum Level {
    LOW, MEDIUM, HIGH
}

enum Day {
    MONDAY("Lunes", "Lundi"), TUESDAY("Martes", "Mardi"), WEDNESDAY("Miercoles", "Mercredi"), THURSDAY("Jueves", "Jeudi"), FRIDAY("Viernes", "Vendredi"), SATURDAY("Sábado", "Samedi"), SUNDAY("Domingo", "Dimanche");

    private String spanish;
    private String french;

    /**
     * Constructor del enum
     */
    private Day(String s, String f) {
        spanish = s;
        french = f;
    }

    public String getSpanish() {
        return spanish;
    }

    public String getFrench() {
        return french;
    }
}

public class Main {
    public static void main(String[] args) {
        showMenu();
    }
}