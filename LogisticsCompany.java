// LogisticsCompany.java
public class LogisticsCompany {

    // Transport interface
    interface Transport {
        void deliver(); // Method to deliver the product
    }

    // Concrete class for Truck
    static class Truck implements Transport {
        @Override
        public void deliver() {
            System.out.println("Delivering by Truck");
        }
    }

    // Concrete class for Boat
    static class Boat implements Transport {
        @Override
        public void deliver() {
            System.out.println("Delivering by Boat");
        }
    }

    // Abstract factory class
    abstract static class DeliveryService {
        public abstract Transport createTransport(); // Abstract method to create transport
    }

    // Concrete factory class for Truck delivery
    static class DeliverByTruck extends DeliveryService {
        @Override
        public Transport createTransport() {
            return new Truck(); // Create and return a Truck
        }
    }

    // Concrete factory class for Boat delivery
    static class DeliverByShip extends DeliveryService {
        @Override
        public Transport createTransport() {
            return new Boat(); // Create and return a Boat
        }
    }

    // Main method to demonstrate the Factory Pattern
    public static void main(String[] args) {
        // Create a delivery service for trucks
        DeliveryService truckDelivery = new DeliverByTruck();
        Transport truck = truckDelivery.createTransport();
        truck.deliver(); // Output: Delivering by Truck

        // Create a delivery service for boats
        DeliveryService shipDelivery = new DeliverByShip();
        Transport boat = shipDelivery.createTransport();
        boat.deliver(); // Output: Delivering by Boat
    }
}