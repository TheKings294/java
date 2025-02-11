package Method;

public class Persons {
    private String name;
    private int age;
    private String address;

    public Persons(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    protected int getAge() {
        return age;
    }
    String afficherAddress() {
        return address;
    }
}
