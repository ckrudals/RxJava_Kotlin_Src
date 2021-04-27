package Chap03;

import io.reactivex.rxjava3.core.Observable;
import sun.rmi.runtime.Log;

public class MapExample {
    private void emit() {
        String[] balls = {"1,2,3,4,5"};
        Observable<String> source = Observable.fromArray(balls)
                .map(ball -> "ball$🤍");
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {
        MapExample demo=new MapExample();
        demo.emit();

    }
}

