package Homework2;

import java.util.ArrayList;
import java.util.List;

public class Market implements OueueBehavior, MarketBehavior {
    ArrayList <Actor> queue = new ArrayList<>();

    @Override
    public void setMakeOrder(boolean makeOrder) {

    }

    @Override
    public void setTakeOrder(boolean takeOrder) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }

    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInOueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor1 : queue) {
            if (actor1.isMakeOrder()) {

            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromOueue() {
        System.out.println();
    }
}
