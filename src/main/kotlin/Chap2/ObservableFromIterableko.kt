package Chap2

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue


class ObservableFromIterable {
    fun blockingQueueExample() {
        val orderQueue : BlockingQueue<Order> = ArrayBlockingQueue(100)
        orderQueue.add(Order("ORD-1"))
        orderQueue.add(Order("ORD-2"))
        orderQueue.add(Order("ORD-3"))

        val source = Observable.fromIterable(orderQueue)
        source.subscribe { order -> println(order.id)}
    }
}

fun main() {
    val demo = ObservableFromIterable()
    demo.blockingQueueExample()
}
