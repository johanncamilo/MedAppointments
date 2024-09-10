package model;

public class Nurse extends User {

    private String specialty;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Enf. Empleado del Hospital: De los Muñecos \nDepartamento: Cancerología");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
