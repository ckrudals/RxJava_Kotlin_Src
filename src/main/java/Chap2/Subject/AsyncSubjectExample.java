package Chap2.Subject;

import Chap2.FirstExampleJavaJust;
import io.reactivex.rxjava3.subjects.AsyncSubject;

public class AsyncSubjectExample {

    private void emit() {
        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();


    }


    public static void main(String[] args) {

        AsyncSubjectExample demo = new AsyncSubjectExample();
        demo.emit();
    }
}