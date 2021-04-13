package Chap2.Observable;

import io.reactivex.rxjava3.core.Observable;

public class ObservableFromArray {

    private void emit(){
        Integer[] arr={100,200,300};
        Observable<Integer> source= Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }


    public static void main(String[] args) {

        ObservableFromArray demo=new ObservableFromArray();
        demo.emit();
    }
}
