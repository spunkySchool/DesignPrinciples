// Base component interface
 interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete component
 class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Base Pizza";
    }

    @Override
    public double getCost() {
        return 5.0; // Base cost of the pizza
    }
}

// Base decorator class
 abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete decorator for Cheese
 class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5; // Additional cost for cheese
    }
}

// Concrete decorator for Pepperoni
 class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0; // Additional cost for pepperoni
    }
}

// Client code
public class PizzaShop {
    public static void main(String[] args) {
        // Create a base pizza
        Pizza pizza = new BasePizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese topping
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add pepperoni topping
        pizza = new Pepperoni(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add another cheese topping
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
    }
}