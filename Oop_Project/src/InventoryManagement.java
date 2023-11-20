import java.util.List;

public class InventoryManagement {

    public void addMedicineToInventory(List<Medicine> inventory, Medicine medicine) {
        inventory.add(medicine);
    }

    public void removeMedicineFromInventoryByName(List<Medicine> inventory, String name) {
        Medicine medicineToRemove = Pharmacy.searchMedicineByName(inventory, name);
        if (medicineToRemove != null) {
            inventory.remove(medicineToRemove);
        } else {
            System.out.println("Medicine not found in the inventory.");
        }
    }

    public void removeMedicineFromInventoryById(List<Medicine> inventory, int id) {
        Medicine medicineToRemove = Pharmacy.searchMedicineById(inventory, id);
        if (medicineToRemove != null) {
            inventory.remove(medicineToRemove);
        } else {
            System.out.println("Medicine not found in the inventory.");
        }
    }

    public void updateMedicineInInventoryById(List<Medicine> inventory, int id, Medicine updatedMedicine) {
        Pharmacy.updateMedicineById(inventory, id, updatedMedicine);
    }

    public void displayInventory(List<Medicine> inventory) {
        System.out.println("Inventory:");
        for (Medicine medicine : inventory) {
            System.out.println("Medicine Name: " + medicine.getName() +
                    ", ID: " + medicine.getId() +
                    ", Quantity: " + medicine.getQuantity());

        }
    }


    public void generateInventoryReport(List<Medicine> inventory) {
        System.out.println("Inventory Report:");
        for (Medicine medicine : inventory) {
            System.out.println("Medicine Name: " + medicine.getName() +
                    ", ID: " + medicine.getId() +
                    ", Description: " + medicine.getDescription() +
                    ", Price: " + medicine.getPrice() +
                    ", Quantity: " + medicine.getQuantity());

        }
    }
}