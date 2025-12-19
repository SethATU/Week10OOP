package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {

        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "085 123 4567",
                1001,
                true
        );

        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("086 765 4321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println(part1Customer);
        System.out.println(part2Customer);
    }
}
