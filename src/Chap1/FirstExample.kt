import io.reactivex.rxjava3.core.Observable

class FirstExample {
    fun emit(){
        Observable.just("Hello","RxJava 2!!")
            .subscribe(System.out::println)
    }
}

fun main(){
    val demo=FirstExample()
    demo.emit()
}