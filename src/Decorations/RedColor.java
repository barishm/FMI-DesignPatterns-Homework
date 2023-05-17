package Decorations;

import Eggs.Egg;

public class RedColor extends EggDecorator {
    Egg egg;
    public RedColor(Egg egg){
        this.egg = egg;
    }
    @Override
    public String getDescription() {
        return "Red colored " + egg.getDescription();
    }
}
