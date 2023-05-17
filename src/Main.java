import Decorations.DragonSticker;
import Decorations.RedColor;
import Eggs.Egg;
import Observer.Chick;
import Observer.EasterEggBasket;

public class Main {

    public static void main(String[] args) {


        EasterBunny easterBunny = EasterBunny.getInstance();
        Egg egg = easterBunny.createEgg("pud-pud");
        System.out.println(egg.getDescription());
        Egg egg2 = easterBunny.createEgg("dinosaur");
        Egg egg3 = easterBunny.createEgg("chicken");
        Egg egg4 = easterBunny.createEgg("chicken");
        Egg egg5 = easterBunny.createEgg("chicken");


        egg = new DragonSticker(egg);
        egg = new RedColor(egg);
        System.out.println(egg.getDescription());

        Chick chick = new Chick();
        EasterEggBasket easterEggBasket = new EasterEggBasket();
        easterEggBasket.addObserver(chick);
        easterEggBasket.addEgg(egg);
        easterEggBasket.addEgg(egg2);
        easterEggBasket.addEgg(egg3);
        easterEggBasket.addEgg(egg4);
        easterEggBasket.addEgg(egg5);

        
        /*

        Великденският заек имал достъп до вълшебна торба, която можела да
        създава три вида яйца: пъдпъдъчи, кокоши и динозавърски. Когато дадено
        яйце било създадено, той го взимал и оцветявал или облепял със стикери на произволен принцип.
        Украсените яйца поставял в кошница. Имало 3 малки пиленца, които наблюдавали кошницата и когато
        яйцата в нея станели повече от 5 броя, те в един глас съобщавали: “Яйцата са готови”.

        Опишете програмно процесът на приготвяне на великденски яйца.
        За целта използвайте шаблоните: Singleton, Factory, Decorator, Observer

        Великденският заек може да бъде само един. Factory може по избор да е Factory method или Abstract Factory.

         */

    }
}