package old;

import model.Patient;
import model.User;

import java.util.Date;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

enum Day {
    MONDAY("Lunes", "Lundi"),
    TUESDAY("Martes", "Mardi"),
    WEDNESDAY("Miercoles", "Mercredi"),
    THURSDAY("Jueves", "Jeudi"),
    FRIDAY("Viernes", "Vendredi"),
    SATURDAY("Sábado", "Samedi"),
    SUNDAY("Domingo", "Dimanche");

    private String spanish;
    private String french; 

    /**
     * Constructor del enum
     * */
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

        Doctor myDoctor = new Doctor("Camilo Colmenares", "Radiologo");
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "1pm");
        myDoctor.addAppointment(new Date(), "10am");

        // foreach usa la estructra elemento: colección
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableApointmens()) {
            System.out.printf("%tT %s\n", aA.getDate(), aA.getTime());
        }

        myDoctor.showName();
        myDoctor.showId();

        Doctor drPaulVazo = new Doctor("Polvazo", "Kinesiologo");
        drPaulVazo.showName();
        drPaulVazo.showId();

        // showMenu();
        //model.Patient patient = new model.Patient("Anai", "anai@gmail.com");

        System.out.println();

        Level mylevel = Level.HIGH;
        System.out.println(mylevel);

        System.out.println();

        System.out.println(Day.MONDAY.getSpanish());
        System.out.println(Day.THURSDAY.getFrench());

        User docM = new model.Doctor("Dr. Mario", "drmario@gmail.com", "prescribing");
        User patL = new Patient("Luigi", "luigi@gmail.com");

//        docM.showDataUser();
//        patL.showDataUser();

//        hack para instanciar una clase abstracta
        User anonymous = new User("anonym", "anonym@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("anonymous soy tu papi");
            }
        };

    }
}