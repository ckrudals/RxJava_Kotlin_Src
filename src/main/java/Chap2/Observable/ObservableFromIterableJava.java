package Chap2.Observable;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableFromIterableJava {
    private void emit() {
        List<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("William");
        names.add("Bob");

        Observable<String> source = Observable.fromIterable(names);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        ObservableFromIterableJava demo = new ObservableFromIterableJava();
        demo.emit();
    }
}
