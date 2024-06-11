package DecoratorPattern.ToppingDecorator;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{

    BasePizza basePizza;
    private int cheeseCost=20;

    private String desc ="";
    public ExtraCheeseTopping(BasePizza pizza){
        this.basePizza=pizza;
        this.desc= "Your "+this.basePizza.description()+" with extra cheese";
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+this.cheeseCost;
    }

    @Override
    public String description() {
        return this.desc;
    }
}
