package Chap2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import org.omg.PortableInterceptor.DISCARDING;

public class ObservableNotifications {

   private void emit(){
       Observable<String> source=Observable.just("RED","GREEN","YELLOW");

       Disposable d=source.subscribe(
               v-> System.out.println("onNext() : value : "+ v),
               err->System.err.println("onError() : err : " + err.getMessage()),
               () -> System.out.println("onComplete()")

       );

}

    public static void main(String[] args) {
        ObservableNotifications noti = new ObservableNotifications();
        noti.emit();
    }
}
