package DecoratorPattern.ToppingDecorator;

import DecoratorPattern.Pizza.BasePizza;

public class MushroomTopping extends ToppingDecorator{

    BasePizza basePizza;
    private int mushroomCost=50;
    private String desc = "";

    public MushroomTopping(BasePizza basePizza){
        this.basePizza=basePizza;
        this.desc="Your "+this.basePizza.description()+" with extra mushroom";
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+mushroomCost;
    }

    @Override
    public String description() {
        return this.desc;
    }
}
