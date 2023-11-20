// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some sample medicines
        Medicine medicine1 = new Medicine("Medicine1", 1, "Description 1", 10.5, 50);
        Medicine medicine2 = new Medicine("Medicine2", 2, "Description 2", 15.2, 30);

        // Create a pharmacy and add medicines to its inventory
        List<Medicine> pharmacyInventory = new ArrayList<>();
        Pharmacy pharmacy = new Pharmacy("Pharmacy A", 101, "123 Main St", pharmacyInventory);
        Pharmacy.addMedicine(pharmacyInventory, medicine1);
        Pharmacy.addMedicine(pharmacyInventory, medicine2);

        // Create a user
        User user = new User("John", "Address 1", "1234567890");

        // Add medicines to the user's cart
        user.addToCart(medicine1);
        user.addToCart(medicine2);

        // Display user's cart
        System.out.println("User's Cart:");
        List<Medicine> userCart = user.getCart();
        for (Medicine medicine : userCart) {
            System.out.println("Medicine Name: " + medicine.getName() +
                    ", ID: " + medicine.getId() +
                    ", Quantity: " + medicine.getQuantity());
        }

        // Place order
        user.placeOrder();
        List<Order> userOrderHistory = user.getOrderHistory();

        // Display user's order history
        System.out.println("\nUser's Order History:");
        for (Order order : userOrderHistory) {
            List<Medicine> orderMedicines = order.getMedicines();
            System.out.println("Order ID: " + order.getOrderId() +
                    ", Order Date: " + order.getOrderDate() +
                    ", Total Price: " + order.getTotalPrice());
            System.out.println("Medicines in this order:");
            for (Medicine medicine : orderMedicines) {
                System.out.println("Medicine Name: " + medicine.getName() +
                        ", ID: " + medicine.getId() +
                        ", Quantity: " + medicine.getQuantity());
            }
        }

        // Create an inventory manager and display the inventory report
        InventoryManagement inventoryManager = new InventoryManagement();
        inventoryManager.generateInventoryReport(pharmacyInventory);
    }

}