package DecoratorPattern.Pizza;

public class VegPizza extends BasePizza{

    String description = "Your Veg Pizza";

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return this.description;
    }

}
