package Chap2;

import io.reactivex.rxjava3.core.Observable;

public class FirstExampleJavaJust {
    public void emit() {
        Observable.just(1, 2, 3, 4, 5, 6).subscribe(System.out::println);

    }

    public static void main(String[] args) {

        FirstExampleJavaJust demo = new FirstExampleJavaJust();
        demo.emit();
    }
}
