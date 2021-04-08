package Chap2

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.Callable

class ObservableFromCallable {
    fun emit() {
        val callable = Callable {
            Thread.sleep(1000)
            "Hello Callable"

        }
        val source= Observable.fromCallable(callable)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo=ObservableFromCallable()
    demo.emit()
}