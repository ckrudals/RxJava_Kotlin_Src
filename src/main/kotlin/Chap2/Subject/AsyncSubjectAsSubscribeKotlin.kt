package Chap2.Subject

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.AsyncSubject

class AsyncSubjectAsSubscribeKotlin {

    fun emit() {
        val temperature = arrayOf(10.1f, 13.4f, 12.5f);
        val source = Observable.fromArray(*temperature)

        val subject = AsyncSubject.create<Float>()
        subject.subscribe { data -> println("Subscriber #1 => $data") }

        source.subscribe(subject)
    }
}

fun main() {
    val demo=AsyncSubjectAsSubscribeKotlin()
    demo.emit()
}