package Chap2.ObservableKotlin

import io.reactivex.rxjava3.core.Observable

class ObservableFromIterableSetKotlin {

    fun emit(){
        val cities=HashSet<String>()
        cities.add("Seoul")
        cities.add("London")
        cities.add("Paris")

        val source= Observable.fromIterable(cities)
        source.subscribe(System.out::println)
    }
}

fun main(){
    val demo = ObservableFromIterableSetKotlin()
    demo.emit()
}