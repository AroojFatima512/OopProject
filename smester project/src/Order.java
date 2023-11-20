
    import java.util.Date;
import java.util.List;

    public class Order {
        private int orderId;
        private Date orderDate;
        private User user;
        private List<Medicine> medicines;
        private double totalPrice;
        private String status;

        public Order(List<Medicine> medicines) {
            this.medicines = medicines;
        }

        public List<Medicine> getMedicines() {
            return medicines;
        }

        public int getOrderId() {
            return orderId;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public User getUser() {
            return user;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public String getStatus() {
            return status;
        }
    }

