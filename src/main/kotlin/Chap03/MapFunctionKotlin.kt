package Chap03

import io.reactivex.rxjava3.core.Observable

// 오류

//class MapFunctionKotlin {
//    fun mapFunction() {
//        val getDiamond = Function<String, String> { ball -> "$ball◇" }
//
//        val balls = arrayOf("1", "2", "3", "5")
//        val source = Observable.fromArray(*balls)
//            .map(getDiamond)
//        source.subscribe { data -> println(data) }
//    }
//}
//
//fun main() {
//    val demo = MapFunctionKotlin()
//    demo.mapFunction()
//
//}