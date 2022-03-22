package patterns.observer;

import patterns.observer.Observable;

public interface Observer {

    void update(Observable observable, Object object);

}
