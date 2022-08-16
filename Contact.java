package PracticeProb;


public class Contacts {
    String name;
    int age;
    long phoneNo;
    String city;
    String state;

    public Contacts(String name, int age, long phoneNo, String city, String state) {
        super();
        this.name = name;
        this.age = age;
        this.phoneNo=phoneNo;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}