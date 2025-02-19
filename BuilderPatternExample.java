// BuilderPatternExample.java

// Step 1: Define the House Class
class House {
    private int rooms;
    private String roofType;
    private boolean hasGarage;

    // Private constructor to enforce the use of the builder
    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.roofType = builder.roofType;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roofType='" + roofType + '\'' +
                ", hasGarage=" + hasGarage +
                '}';
    }

    // Static nested Builder class
    public static class HouseBuilder {
        private int rooms;
        private String roofType;
        private boolean hasGarage;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

// Step 2: Client Code
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Using the Builder to create a House object
        House house = new House.HouseBuilder()
                .setRooms(3)
                .setRoofType("Gable")
                .setHasGarage(true)
                .build();

        System.out.println(house); // Output: House{rooms=3, roofType='Gable', hasGarage=true}
        
        // Creating another House object with different attributes
        House anotherHouse = new House.HouseBuilder()
                .setRooms(5)
                .setRoofType("Flat")
                .setHasGarage(false)
                .build();

        System.out.println(anotherHouse); // Output: House{rooms=5, roofType='Flat', hasGarage=false}
    }
}