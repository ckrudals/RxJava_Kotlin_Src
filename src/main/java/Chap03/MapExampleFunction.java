package Chap03;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;


public class MapExampleFunction {
    private void emit() {
        Function<String, String> getDiamond = ball -> ball + "";

        String[] balls = {"1", "2", "3", "5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(getDiamond);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {
        MapExampleFunction demo=new MapExampleFunction();
        demo.emit();

    }
}
