package Chap2;

import io.reactivex.rxjava3.core.Single;

public class SingleExampleJust {

    private void emit() {
        Single<String> source = Single.just("Hello Single");
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        SingleExampleJust demo=new SingleExampleJust();
        demo.emit();
    }
}