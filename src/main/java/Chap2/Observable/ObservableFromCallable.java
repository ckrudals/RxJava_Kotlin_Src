package Chap2.Observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Callable;

public class ObservableFromCallable {
    private void emit() {
        Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "Hello Callable";
        };
        Observable<String> source = Observable.fromCallable(callable);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {
        ObservableFromCallable demo=new ObservableFromCallable();
        demo.emit();
    }
}