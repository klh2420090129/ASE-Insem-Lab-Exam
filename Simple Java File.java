
public class FoodOrder {

    public static void main(String[] args) {
        String customer = "Student";
        int price = 100;
        int quantity = 0;
        int total = price / quantity;

        String unused = "Food Delivery";

        if (customer == "Student") {
            System.out.println("Welcome " + customer);
        }

        System.out.println("Total: " + total);
    }
}
