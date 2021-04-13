package Chap2.ObservableKotlin

import io.reactivex.rxjava3.core.Observable
import org.reactivestreams.Subscriber

class ObservableFromPublisher {
    fun emit() {
        val publisher = { s: Subscriber<in String?> ->
            s.onNext("Hello Observable.fromPublisher()")
            s.onComplete()
        }
        val source = Observable.fromPublisher(publisher)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo = ObservableFromPublisher()
    demo.emit()
}