package SoftUni;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public String value;
    List<EventListener> listeners = new ArrayList<>();

    public void addEventListener(EventListener name){
        listeners.add(name);
    };

    public void removeEventListener(EventListener name){
        listeners.remove(name);
    };

    public void fireEvent(){
        Event event = new Event(this, value);
        for (EventListener listener : listeners) {
            listener.handleEvent(event);
        }
    };
}
