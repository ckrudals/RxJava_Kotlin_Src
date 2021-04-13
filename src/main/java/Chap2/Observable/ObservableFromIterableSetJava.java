package Chap2.Observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.HashSet;
import java.util.Set;

public class ObservableFromIterableSetJava {
    private void emit() {
        Set<String> cities = new HashSet<>();
        cities.add("Seoul");
        cities.add("London");
        cities.add("Paris");

        Observable<String> source = Observable.fromIterable(cities);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        ObservableFromIterableSetJava demo = new ObservableFromIterableSetJava();
        demo.emit();
    }
}