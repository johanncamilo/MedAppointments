import static  ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Camilo Colmenares", "Radiologo");
        myDoctor.name = "Pinguino Rodriguez";
        myDoctor.showName();
        myDoctor.showId();

        Doctor drPaulVazo = new Doctor("Polvazo", "Kinesiologo");
        drPaulVazo.showName();
        drPaulVazo.showId();

        showMenu();

    }
}