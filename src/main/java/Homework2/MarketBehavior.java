package Homework2;

import java.util.List;

public interface MarketBehavior {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();

    void acceptToMarket (Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
