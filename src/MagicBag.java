import Decorations.EggDecorator;
import Eggs.ChickenEgg;
import Eggs.DinosaurEgg;
import Eggs.Egg;
import Eggs.PudPudEgg;

public class MagicBag {
    public Egg createEgg(String type) {
        switch (type) {
            case "pud-pud":
                return new PudPudEgg();
            case "chicken":
                return new ChickenEgg();
            case "dinosaur":
                return new DinosaurEgg();
            default:
                throw new IllegalArgumentException("Invalid egg type: " + type);
        }
    }
}
