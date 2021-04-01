import io.reactivex.rxjava3.core.Observable;

public class FirstExampleJava {
    public void emit(){
        Observable.just("Hello","RxJava 2!!").subscribe(System.out::println);

    }

    public static void main(String[] args) {

        FirstExampleJava demo=new FirstExampleJava();
        demo.emit();
    }
}
