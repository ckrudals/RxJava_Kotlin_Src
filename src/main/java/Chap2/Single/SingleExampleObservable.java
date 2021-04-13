package Chap2.Single;

import Chap2.Observable.Order;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleExampleObservable {

    private void emit() {
        Observable<String> source = Observable.just("Hello Single");
        Single.fromObservable(source).subscribe(System.out::println);
    }

    private void single() {
        Observable.just("Hello Single").single("Default item").subscribe(System.out::println);
    }

    private void first() {
        String[] colors = {"Red", "Blue", "Gold"};
        Observable.fromArray(colors).first("default value").subscribe(System.out::println);
    }

    private void empty() {
        Observable.empty().single("default value").subscribe(System.out::println);

    }

    private void take() {
        Observable.just(new Order("ORD-1"), new Order("ORD-2")).take(1).single(new Order("default order")).subscribe(System.out::println);
    }


    public static void main(String[] args) {
        SingleExampleObservable demo=new SingleExampleObservable();
        demo.emit();
        demo.single();
        demo.first();
        demo.empty();
        demo.take();
    }
}