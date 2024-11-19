package SoftUni;

public class EventListenerImpl implements EventListener {
    @Override
    public void handleEvent(Event event){
        System.out.printf("Dispatcher’s name changed to %s\n", event.getValue());
    }
}
