package Chap2.ObservableKotlin

import io.reactivex.rxjava3.core.Observable

class ObservableFromIterableKotlin {

    fun emit(){
        val names=ArrayList<String>()
        names.add("Jerry")
        names.add("William")
        names.add("Bob")

        val source= Observable.fromIterable(names)
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo=ObservableFromIterableKotlin()
 demo.emit()
}