package DecoratorPattern.Pizza;

public class Margheritta extends BasePizza{
    String description = "Your MArgheritta Pizza";
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return this.description;
    }
}
