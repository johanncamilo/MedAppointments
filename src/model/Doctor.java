package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    /**
     * Sobrecarga de método constructor
     * */
    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
        System.out.printf("Hola doctor %s %s %n", this.speciality, super.getName());
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(super.getName());
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
     * Con este Override se está reutilizando el comportamiento del Override en el padre
     * Y con la clase inner le está añadiendo otro comportamiento
     * */
    @Override
    public String toString() {
        return super.toString() + String.format("\nSpeciality: %s, \nAvailable: %s", getSpeciality(), getAvailableApointmens().toString());
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

        @Override
        public String toString() {
             return String.format("Available appointments \nDate: %s, \n Time: %s", getDate(), getTime());
        }
    }
}
