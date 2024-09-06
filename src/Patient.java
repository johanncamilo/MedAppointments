public class Patient extends User {

    private double height;
    private String birthday;
    private String blood;
    private double weight;

    Patient(String name, String email) {
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
}
