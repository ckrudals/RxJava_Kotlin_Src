package Chap2;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ObservableFromIterableJa {
    private void emit() {
        BlockingQueue<Order> orderQueue = new ArrayBlockingQueue<Order>(100);
        orderQueue.add(new Order("ORD-1"));
        orderQueue.add(new Order("ORD-2"));
        orderQueue.add(new Order("ORD-3"));

        Observable<Order> source = Observable.fromIterable(orderQueue);
        source.subscribe(order -> System.out.println(order.getId()));
    }


    public static void main(String[] args) {

        ObservableFromIterableJa demo = new ObservableFromIterableJa();
        demo.emit();
    }
}
