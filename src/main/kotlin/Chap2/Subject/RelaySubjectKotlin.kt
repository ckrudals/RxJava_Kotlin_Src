package Chap2.Subject

import io.reactivex.rxjava3.subjects.ReplaySubject

class RelaySubjectKotlin {
    fun emit() {
        val subject = ReplaySubject.create<String>()
        subject.subscribe { data: String -> println("Subscriber #1 => $data") }
        subject.onNext("1")
        subject.onNext("3")
        subject.subscribe { data: String -> println("Subscriber #2 => $data") }
        subject.onNext("5")
        subject.onComplete()

    }
}


    fun main() {
        val demo = RelaySubjectKotlin()
        demo.emit()
    }
