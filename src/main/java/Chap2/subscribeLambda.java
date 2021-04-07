package Chap2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;

public class subscribeLambda {
    private void emit() {
        Observable<Integer> source = Observable.create((ObservableEmitter<Integer> emitter) -> {

            emitter.onNext(100);
            emitter.onNext(200);
            emitter.onNext(300);
            emitter.onComplete();
        });
        source.subscribe(data->System.out.println("Result : " + data));
    }


    public static void main(String[] args) {

        subscribeLambda demo=new subscribeLambda();
        demo.emit();
    }
}