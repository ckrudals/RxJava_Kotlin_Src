package Chap2.Subject;

import io.reactivex.rxjava3.subjects.PublishSubject;

public class PublishSubjectJava {
    private void emit() {
        PublishSubject<String> subject = PublishSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }


    public static void main(String[] args) {
        PublishSubjectJava demo = new PublishSubjectJava();
        demo.emit();
    }
}