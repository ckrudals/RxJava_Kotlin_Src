package Chap2.Subject

import io.reactivex.rxjava3.subjects.AsyncSubject

class AsyncSubjectExampleKotlin {

    fun emit(){
        val subject=AsyncSubject.create<String>()

        subject.subscribe { data -> println("Subscriber #1 => $data") }
        subject.onNext("1")
        subject.onNext("3")
        subject.subscribe { data -> println("Subscriber #2 => $data") }
        subject.onNext("5")
        subject.onComplete()
    }
}

fun main() {
    val demo = AsyncSubjectExampleKotlin()
    demo.emit()
}