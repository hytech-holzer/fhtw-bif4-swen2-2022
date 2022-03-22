package patterns.observer;

import lombok.Builder;
import lombok.Data;
import patterns.observer.Observable;
import patterns.observer.Observer;

@Data
@Builder
public class User implements Observer {

    private String name;

    @Override
    public void update(Observable observable, Object object) {
        System.out.println(this.toString() + ": update from " + observable + ": " + object);
    }
}
