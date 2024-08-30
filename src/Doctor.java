public class Doctor  {

    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("nuevo doctor sin nombre");
    }

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


}
