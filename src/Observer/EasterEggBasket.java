package Observer;

import Eggs.Egg;

import java.util.ArrayList;
import java.util.List;

public class EasterEggBasket {
    private List<Egg> eggs = new ArrayList<Egg>();
    private List<EggBasketObserver> observers = new ArrayList<EggBasketObserver>();
    private int eggCountThreshold = 5;

    public void addObserver(EggBasketObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(EggBasketObserver observer) {
        observers.remove(observer);
    }

    public void addEgg(Egg egg) {
        eggs.add(egg);
        System.out.println("Added " + egg.getClass().getSimpleName() + " egg to basket");
        if (eggs.size() >= eggCountThreshold) {
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (EggBasketObserver observer : observers) {
            observer.eggsReady(eggs.size());
        }
    }
}
