package Chap2.Observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ObservableFrmFuture {

    private void emit() {
        Future<String> future = Executors.newSingleThreadExecutor().submit(() -> {
            Thread.sleep(1000);
            return "Hello Future";
        });
        Observable<String> source = Observable.fromFuture(future);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        ObservableFrmFuture demo = new ObservableFrmFuture();
        demo.emit();
        ;
    }
}
