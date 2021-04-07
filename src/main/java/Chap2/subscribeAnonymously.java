package Chap2;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Consumer;

public class subscribeAnonymously {
    private void emit() {
        Observable<Integer> source = Observable.create((ObservableEmitter<Integer> emitter) -> {

            emitter.onNext(100);
            emitter.onNext(200);
            emitter.onNext(300);
            emitter.onComplete();
        });

        source.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer data) throws Throwable {
                System.out.println("Result : " + data);
            }
        });
    }



    public static void main(String[] args) {

        subscribeAnonymously demo=new subscribeAnonymously();
        demo.emit();
    }
}