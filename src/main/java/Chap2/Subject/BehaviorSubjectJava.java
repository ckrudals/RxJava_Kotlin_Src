package Chap2.Subject;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

public class BehaviorSubjectJava {

    private void emit() {
        BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();


    }


    public static void main(String[] args) {
        BehaviorSubjectJava demo=new BehaviorSubjectJava();
        demo.emit();

    }
}