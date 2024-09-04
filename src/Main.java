import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Camilo Colmenares", "Radiologo");
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "1pm");
        myDoctor.addAppointment(new Date(), "10am");

        // foreach usa la estructra elemento: colección
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableApointmens()) {
            System.out.printf("%tT %s\n", aA.getDate(), aA.getTime());
        }

        myDoctor.showName();
        myDoctor.showId();

        Doctor drPaulVazo = new Doctor("Polvazo", "Kinesiologo");
        drPaulVazo.showName();
        drPaulVazo.showId();

        showMenu();
        Patient patient = new Patient("Anai", "anai@gmail.com");

    }
}