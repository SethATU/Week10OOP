package ie.atu;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    //constructor
    public Person() {
        this.name = " ";
        this.address = " ";
        this.phoneNumber = " ";
    }

    //constructor parametrised
    public Person(String name, String address, String phoneNumber) {
        this.name = "Seth";
        this.address = "ATU Galway";
        this.phoneNumber = "0838940848";
    }

    //getters
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhoneNumber() { return phoneNumber;}

    //setters
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    //to string
    @Override
    public String toString(){return "Person {" + "name=" + name + "\\" + "address=" + address + "\\" + "phoneNumber=" + phoneNumber + "\\" + '}';}
}
