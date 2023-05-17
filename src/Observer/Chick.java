package Observer;

public class Chick implements EggBasketObserver {
    @Override
    public void eggsReady(int eggCount) {
        System.out.println("Chick: Eggs are ready! Count: " + eggCount);
    }
}