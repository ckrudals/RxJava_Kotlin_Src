package Chap2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleExampleErrorCase {
    private void emit() {
        Single<String> source = Observable.just("Hello Single", "Error").single("default item");
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {
        SingleExampleErrorCase demo = new SingleExampleErrorCase();
        demo.emit();

    }
}