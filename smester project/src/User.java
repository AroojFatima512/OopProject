
    import java.util.ArrayList;
import java.util.List;

    public class User {
        private String name;
        private String address;
        private String contactInfo;
        private List<Medicine> cart;
        private List<Order> orderHistory;

        public User(String name, String address, String contactInfo) {
            this.name = name;
            this.address = address;
            this.contactInfo = contactInfo;
            this.cart = new ArrayList<>(); // Initialize the cart list
            this.orderHistory = new ArrayList<>();
        }

        public void addToCart(Medicine medicine) {
            cart.add(medicine);
        }

        public void removeFromCart(Medicine medicine) {
            cart.remove(medicine);
        }

        public void clearCart() {
            cart.clear();
        }

        public List<Medicine> getCart() {
            return cart;
        }


        public void placeOrder() {
            if (!cart.isEmpty()) {
                Order newOrder = new Order(cart);
                orderHistory.add(newOrder);
                cart.clear();
            } else {
                System.out.println("Cart is empty. Add items to the cart before placing an order.");
            }
        }


        public List<Order> getOrderHistory() {
            return orderHistory;
        }


    }

