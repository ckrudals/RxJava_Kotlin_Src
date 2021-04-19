package Chap2.ConnectableObservable

import io.reactivex.rxjava3.core.Observable
import sun.security.krb5.Confounder.intValue
import java.util.concurrent.TimeUnit

class ConnectableObservableKotlin {
    fun emit() {
        val dt = arrayOf("1", "3", "5")
        val balls = Observable.interval(100L, TimeUnit.MILLISECONDS)
            .map { data -> data.toInt() }
            .map { i -> dt[i] }
            .take(dt.size.toLong())

        val source = balls.publish()
        source.subscribe { data -> println("Subscriber #1 => $data") }
        source.subscribe { data -> println("Subscriber #2 => $data") }
        source.connect()
        Thread.sleep(250)
        source.subscribe { data -> println("Subscriber #3 => $data") }
        Thread.sleep(100)
    }

}

fun main() {
    val demo=ConnectableObservableKotlin()
    demo.emit()

}