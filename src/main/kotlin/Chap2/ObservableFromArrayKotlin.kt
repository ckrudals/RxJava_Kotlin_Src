package Chap2

import io.reactivex.rxjava3.core.Observable

class ObservableFromArrayKotlin {
    fun emit(){
    val arr= arrayOf(100,200,300);
        val source= Observable.fromArray(*arr);
        source.subscribe(System.out::println);
    }
}

fun main() {
    val demo=ObservableFromArrayKotlin()
    demo.emit()
}