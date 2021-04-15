package Chap2.Subject;

import io.reactivex.rxjava3.subjects.ReplaySubject;

public class ReplaySubjectJava {
    private void emit() {
        ReplaySubject<String> subject = ReplaySubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();


    }


    public static void main(String[] args) {
        ReplaySubjectJava demo=new ReplaySubjectJava();
        demo.emit();
    }
}