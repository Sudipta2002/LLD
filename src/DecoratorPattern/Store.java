package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.ChickenFiesta;
import DecoratorPattern.Pizza.Margheritta;
import DecoratorPattern.Pizza.VegPizza;
import DecoratorPattern.ToppingDecorator.ExtraCheeseTopping;
import DecoratorPattern.ToppingDecorator.MushroomTopping;
import DecoratorPattern.ToppingDecorator.ToppingDecorator;

public class Store {
    public static void main(String[] args) {
        BasePizza chickenFiesta = new ChickenFiesta();
        BasePizza vegPizza = new VegPizza();
        BasePizza margheritta = new Margheritta();
        ToppingDecorator obj1 = new ExtraCheeseTopping(chickenFiesta);
        ToppingDecorator obj2 = new MushroomTopping(chickenFiesta);
        ToppingDecorator obj3 = new ExtraCheeseTopping(vegPizza);
        ToppingDecorator obj4 = new MushroomTopping(margheritta);

        ToppingDecorator obj5 = new MushroomTopping(new ExtraCheeseTopping(chickenFiesta));

        System.out.println(obj1.cost());
        System.out.println(obj1.description());
        System.out.println(obj2.cost());
        System.out.println(obj2.description());
        System.out.println(obj3.cost());
        System.out.println(obj3.description());
        System.out.println(obj4.cost());
        System.out.println(obj4.description());

        System.out.println(obj5.description());
        System.out.println(obj5.cost());

    }
}
