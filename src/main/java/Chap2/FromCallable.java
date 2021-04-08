package Chap2;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.Callable;

public class FromCallable {
    private void emit() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello Callable";
            }
        };
        Observable<String> source = Observable.fromCallable(callable);
        source.subscribe(System.out::println);
    }

    public static void main(String[] args) {
        FromCallable demo = new FromCallable();
        demo.emit();
    }
}
