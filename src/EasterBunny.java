import Eggs.*;


public class EasterBunny implements MagicBag {
    private static EasterBunny instance;
    private static Egg egg;



    private EasterBunny() {
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }


    @Override
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
