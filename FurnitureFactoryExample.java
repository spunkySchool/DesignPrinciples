// FurnitureFactoryExample.java
//abstract factory desiggn
// Step 1: Define the Abstract Product Interfaces
interface Chair {
    void sitOn(); // Method to use the chair
}

interface Table {
    void use(); // Method to use the table
}

// Step 2: Create Concrete Products for Victorian Style
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair!");
    }
}

class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a Victorian table!");
    }
}

// Step 3: Create Concrete Products for Modern Style
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair!");
    }
}

class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a modern table!");
    }
}

// Step 4: Define the Abstract Factory Interface
interface FurnitureFactory {
    Chair createChair(); // Method to create a chair
    Table createTable(); // Method to create a table
}

// Step 5: Create Concrete Factories for Victorian and Modern Furniture
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair(); // Create a Victorian chair
    }

    @Override
    public Table createTable() {
        return new VictorianTable(); // Create a Victorian table
    }
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair(); // Create a modern chair
    }

    @Override
    public Table createTable() {
        return new ModernTable(); // Create a modern table
    }
}

// Step 6: Client Code
public class FurnitureFactoryExample {
    public static void main(String[] args) {
        // Create Victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.sitOn(); // Output: Sitting on a Victorian chair!
        victorianTable.use();    // Output: Using a Victorian table!

        // Create Modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();     // Output: Sitting on a modern chair!
        modernTable.use();       // Output: Using a modern table!
    }
}