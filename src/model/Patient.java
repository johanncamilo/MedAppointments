package model;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private double height;
    private String birthday;
    private String blood;
    private double weight;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        // constructor clase padre
        super(name, email);
    }

    public String getWeight() {
        return this.weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + "mt";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String  toString() {
        return super.toString() + String.format("\nAge: %s, \nWeight: %s, \nHeight: %s, \nBlood: %s", getBirthday(), getWeight(), getHeight(), getBlood());
    }

    @Override
    public void showDataUser() {
        System.out.println("paciente \n bla bla bla");
    }
}
