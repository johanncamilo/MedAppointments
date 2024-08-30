public class Doctor  {

    static int id = 0;
    String name;
    String speciality;

    Doctor() {
        System.out.println("nuevo doctor sin nombre");
    }

    Doctor(String name) {
        System.out.printf("Hola doctor %s", name);
        System.out.println();
        id++;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.printf("Id doctor %d%n", id);
    }


}
