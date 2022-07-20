package it.euris.patterns.behavioral.observer.exercise;

public class OrderService implements IOrderObserver{

    OrderSubject ocjectInstance = OrderSubject.getInstance();

    private int money = 0;

    private boolean finish;

    public OrderService(){
        ocjectInstance.register(this);
    }

    @Override
    public void updateState() {
        finish = true;
    }

    // => Aggiorna fatturato ed esegue controllo su finish
    public void updateValue(Order order){
        if (finish) {
            // THROW
        }
        money += order.getPrice();
        if(money > 100){
            ocjectInstance.notifyObs();
        }
    }
}
