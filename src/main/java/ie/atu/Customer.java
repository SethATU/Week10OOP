package ie.atu;

public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    //constructor
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    //constructor parametrised
    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;

    }

    //getters
    public int getCustomerNumber() {return customerNumber;}
    public boolean getMailingList() {return mailingList;}

    //setters
    public void setCustomerNumber(int customerNumber) {this.customerNumber = customerNumber;}
    public void setMailingList(boolean mailingList) {this.mailingList = mailingList;}

    @Override
    public String toString() { return "Customer{" + "person=" + super.toString() + ", CustomerNumber=" + customerNumber +", mailingList=" + mailingList + '}';}
}
