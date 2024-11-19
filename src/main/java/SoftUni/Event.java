package SoftUni;

import java.util.EventObject;

public class Event extends EventObject {

    private String value;
    public Event(Object source, String value){
        super(source);
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
