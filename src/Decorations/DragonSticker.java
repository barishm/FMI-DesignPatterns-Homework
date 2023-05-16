package Decorations;

import Eggs.Egg;

public class DragonSticker extends EggDecorator{
    Egg egg;
    public DragonSticker(Egg egg){
        this.egg = egg;
    }
    @Override
    public String getDescription() {
        return  egg.getDescription() + " with dragon sticker on it";
    }
}
