package Chap2;

import io.reactivex.rxjava3.core.Observable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class ObservableFromPublisherJava {
    private void emit() {
        Publisher<String> publisher = (Subscriber<? super String> s) -> {
            s.onNext("Hello Observable.fromPublisher()");
            s.onComplete();

        };
        Observable<String> source = Observable.fromPublisher(publisher);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {
        ObservableFromPublisherJava demo=new ObservableFromPublisherJava();
        demo.emit();
    }
}
