public class Doctor  {

    int id;
    String name;
    String speciality;

    Doctor() {
        System.out.println("nuevo doctor sin nombre");
    }

    Doctor(String name) {
        System.out.printf("Hola doctor %s", name);
        System.out.println();
    }

    public void showName() {
        System.out.println(name);
    }


}
