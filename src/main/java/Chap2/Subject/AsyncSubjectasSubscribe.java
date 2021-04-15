package Chap2.Subject;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.AsyncSubject;

public class AsyncSubjectasSubscribe {
    private void emit(){
        Float[] tempature={10.1f,13.4f,12.5f};
        Observable<Float> source=Observable.fromArray(tempature);

        AsyncSubject<Float> subject=AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => "+data));

        source.subscribe(subject);
    }


    public static void main(String[] args) {

        AsyncSubjectasSubscribe demo = new AsyncSubjectasSubscribe();
        demo.emit();
    }
}