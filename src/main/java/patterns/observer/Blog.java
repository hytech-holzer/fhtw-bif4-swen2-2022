package patterns.observer;

import lombok.Builder;
import lombok.Data;
import patterns.observer.Observable;

@Data
@Builder
public class Blog extends Observable {

    private String name;

}
