public class Patient {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String blood;
    private double height;
    private double weight;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
