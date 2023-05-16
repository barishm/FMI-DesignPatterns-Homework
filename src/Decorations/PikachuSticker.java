package Decorations;

import Eggs.Egg;

public class PikachuSticker extends EggDecorator{

    Egg egg;
    public PikachuSticker(Egg egg){
        this.egg = egg;
    }
    @Override
    public String getDescription() {
        return egg.getDescription() + " with pikachu sticker on it";
    }
}
