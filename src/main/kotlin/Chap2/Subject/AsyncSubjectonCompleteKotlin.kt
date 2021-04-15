package Chap2.Subject

import io.reactivex.rxjava3.subjects.AsyncSubject

class AsyncSubjectonCompleteKotlin {
    fun emit() {
        val subject = AsyncSubject.create<Int>()
        subject.onNext(10)
        subject.onNext(11)
        subject.subscribe { data -> println("Subscriber #1 => $data") }
        subject.onNext(12)
        subject.onComplete()
        subject.onNext(13)
        subject.subscribe { data -> println("Subscriber #2 => $data") }
        subject.subscribe { data -> println("Subscriber #3 => $data") }

    }
}

fun main() {
    val demo=AsyncSubjectonCompleteKotlin()
    demo.emit()
}