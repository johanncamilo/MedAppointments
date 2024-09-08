package old;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    static int id = 0;
    private String name;
    private String email;
    private String speciality;


    Doctor() {
        System.out.println("nuevo doctor sin nombre");
    }

    /**
     * Sobrecarga de método constructor
     * */
    Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        System.out.printf("Hola doctor %s %s %n", this.speciality, this.name);
        id++;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.printf("Id doctor %d%n", id);
    }

    /**
     * atributo ArrayList tipo <AvailableAppoinment>
     *     es un arreglo de tamaño dinamico
     * */
    ArrayList<AvailableAppointment> availableApointmens = new ArrayList<>();

    public void addAppointment(Date date, String time) {
        // instanciación de clase anidada dentro de clase externa
        availableApointmens.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableApointmens() {
        return availableApointmens;
    }

    /**
     * clase anidada: AvailableAppoinment dentro de la clase model.Doctor
     * */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
