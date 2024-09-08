import model.Doctor;
import model.Patient;

import java.util.Date;

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

        Doctor myDoctor = new Doctor("Camilo Colmenares", "camilo@gmail.com", "Radiologo");
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "1pm");
        myDoctor.addAppointment(new Date(), "10am");

        System.out.println("😎");
        System.out.println(myDoctor);

//        model.Doctor drPaulVazo = new model.Doctor("Polvazo", "paulvazo@gmail.com", "Kinesiologo");

        // showMenu();
        Patient patient = new Patient("Anai", "anai@gmail.com");

//        Level mylevel = Level.HIGH;
//        System.out.println(mylevel);
//
//        System.out.println(Day.MONDAY.getSpanish());
//        System.out.println(Day.THURSDAY.getFrench());

        System.out.println(patient);

    }
}