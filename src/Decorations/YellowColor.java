package Decorations;

import Eggs.Egg;

public class YellowColor extends EggDecorator{

    Egg egg;
    public YellowColor(Egg egg){
        this.egg = egg;
    }
    @Override
    public String getDescription() {
        return "Yellow colored " + egg.getDescription();
    }
}
