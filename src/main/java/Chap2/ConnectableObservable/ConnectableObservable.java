package Chap2.ConnectableObservable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ConnectableObservable {

    private void emit() throws InterruptedException {

        String[] dt = {"1", "3", "5"};
        Observable<String> balls = Observable.interval(100L, TimeUnit.MILLISECONDS).
                map(Long::intValue)
                .map(i -> dt[i])
                .take(dt.length);
        io.reactivex.rxjava3.observables.@NonNull ConnectableObservable<String> source = balls.publish();
        source.subscribe(data -> System.out.println("Subscriber #1 " + data));
        source.subscribe(data -> System.out.println("Subscriber #2 " + data));
        source.connect();


            Thread.sleep(250);

        source.subscribe(data -> System.out.println("Subscriber #3 => " + data));
        Thread.sleep(100);
    }

    public static void main(String[] args) throws InterruptedException {
        ConnectableObservable  demo=new ConnectableObservable();
        demo.emit();
    }
}
