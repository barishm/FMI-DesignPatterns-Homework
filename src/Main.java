import Decorations.DragonSticker;
import Decorations.RedColor;
import Eggs.DinosaurEgg;
import Eggs.Egg;

public class Main {

    public static void main(String[] args) {


        EasterBunny easterBunny = EasterBunny.getInstance();
        Egg egg = easterBunny.createEgg("pud-pud");
        Egg egg1 = new DinosaurEgg();
        System.out.println(egg.getDescription());
        System.out.println();

        egg = new DragonSticker(egg);
        egg = new RedColor(egg);
        System.out.println(egg.getDescription());


        
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