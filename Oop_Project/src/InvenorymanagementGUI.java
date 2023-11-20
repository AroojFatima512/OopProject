
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PharmacyAppGUI extends Application {
//
//        private User user;
//        private List<Medicine> pharmacyInventory;
//
//        @Override
//        public void start(Stage primaryStage) {
//                // Create sample medicines
//                Medicine medicine1 = new Medicine("Medicine1", 1, "Description 1", 10.5, 50);
//                Medicine medicine2 = new Medicine("Medicine2", 2, "Description 2", 15.2, 30);
//
//                // Create a pharmacy and add medicines to its inventory
//                pharmacyInventory = new ArrayList<>();
//                Pharmacy pharmacy = new Pharmacy("Pharmacy A", 101, "123 Main St", pharmacyInventory);
//                Pharmacy.addMedicine(pharmacyInventory, medicine1);
//                Pharmacy.addMedicine(pharmacyInventory, medicine2);
//
//                // Create a user
//                user = new User("John", "Address 1", "1234567890");
//
//                // GUI components
//                Button addToCartButton = new Button("Add to Cart");
//                Button placeOrderButton = new Button("Place Order");
//                Button viewInventoryButton = new Button("View Inventory");
//
//                // Add functionality to buttons
//                addToCartButton.setOnAction(e -> {
//                        // Add medicines to the user's cart
//                        user.addToCart(pharmacyInventory.get(0)); // Adding the first medicine to the cart for demonstration
//                        System.out.println("Added to cart: " + pharmacyInventory.get(0).getName());
//                });
//
//                placeOrderButton.setOnAction(e -> {
//                        // Place order
//                        user.placeOrder();
//                        System.out.println("Order placed!");
//                });
//
//                viewInventoryButton.setOnAction(e -> {
//                        // Display inventory report
//                        InventoryManager inventoryManager = new InventoryManager();
//                        inventoryManager.generateInventoryReport(pharmacyInventory);
//                });
//
//                // Create a vertical layout for buttons
//                VBox vbox = new VBox(10, addToCartButton, placeOrderButton, viewInventoryButton);
//
//                // Create a scene and set it on the stage
//                Scene scene = new Scene(vbox, 300, 200);
//                primaryStage.setScene(scene);
//                primaryStage.setTitle("Pharmacy App");
//                primaryStage.show();
//        }
//
//
//}
//