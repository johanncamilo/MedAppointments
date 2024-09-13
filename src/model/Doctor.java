package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User implements IHumanable {
    private String speciality;

    /**
     * Sobrecarga de método constructor
     */
    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
        saludar();
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
     * es un arreglo de tamaño dinamico
     */
    ArrayList<AvailableAppointment> availableApointmens = new ArrayList<>();

    public void addAppointment(String date, String time) {
        // instanciación de clase anidada dentro de clase externa
        availableApointmens.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableApointmens() {
        return availableApointmens;
    }

    /**
     * Con este Override se está reutilizando el comportamiento del Override en el padre
     * Y con la clase inner le está añadiendo otro comportamiento
     */
    @Override
    public String toString() {
        return super.toString() + String.format("\nSpeciality: %s, \nAvailable: %s", getSpeciality(), getAvailableApointmens().toString());
    }

    @Override
    public void showDataUser() {
        System.out.println("Dr. Empleado del Hospital: De los Muñecos \nDepartamento: Cancerología");
    }

    /**
     * clase anidada: AvailableAppoinment dentro de la clase model.Doctor
     */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String date) {
            return format.format(date);
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
