package DecoratorPattern.Pizza;

public class ChickenFiesta extends BasePizza{
    String description = "Your Chicken Fiesta Pizza";
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return this.description;
    }

}
