package Chap2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;

public class ObservableCreateExampleJava {
    private void emit() {
        Observable<Integer> source = Observable.create((ObservableEmitter<Integer> emitter) -> {

            emitter.onNext(100);
            emitter.onNext(200);
            emitter.onNext(300);
            emitter.onComplete();
        });
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        ObservableCreateExampleJava demo=new ObservableCreateExampleJava();
        demo.emit();
    }
}
