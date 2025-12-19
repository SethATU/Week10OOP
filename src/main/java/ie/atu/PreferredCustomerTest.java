package ie.atu;

public class PreferredCustomerTest {
    public static void main(String[] args) {

        PrefferedCustomer pc = new PrefferedCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("087 111 2222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        System.out.println(pc);

        pc.addLoyaltyPoints(700);
        System.out.println(pc);

        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}
