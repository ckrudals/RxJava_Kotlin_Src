package Chap2

import io.reactivex.rxjava3.core.Observable

class FirstExampleKotlinJust {
    fun emit() {
        // 하나씩 찍어준다.
        Observable.just(1, 2, 3, 4, 5, 6).subscribe(System.out::print)
    }
}

fun main() {
    val demo = FirstExampleKotlinJust()
    demo.emit()

}
