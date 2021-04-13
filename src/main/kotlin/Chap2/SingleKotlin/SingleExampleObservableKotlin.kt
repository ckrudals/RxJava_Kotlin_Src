package Chap2.SingleKotlin

import Chap2.Observable.Order
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

class SingleExampleObservableKotlin {
    fun emit() {
        val source = Observable.just("Hello Single")
        Single.fromObservable(source)
            .subscribe { x -> println(x) }
    }

    fun single() {
        Observable.just("Hello Single")
            .single("default item")
            .subscribe { x -> println(x) }
    }

    fun first() {
        val colors = arrayOf("Red", "Blue", "Gold")
        Observable.fromArray(*colors).first("default value").subscribe { x -> println(x) }
    }

    fun empty() {
        Observable.empty<String>().single("default value")
            .subscribe{x -> println(x) }
    }

    fun take(){
        Observable.just(Order("ORD-1"),Order("ORD-2"))
            .take(1)
            .single(Order("default order"))
            .subscribe { x -> println(x)}
    }
}

fun main() {
    val demo=SingleExampleObservableKotlin()
    demo.emit()
    demo.single()
    demo.first()
    demo.empty()
    demo.take()
}