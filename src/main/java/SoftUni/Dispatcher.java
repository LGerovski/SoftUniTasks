package SoftUni;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public String name;
    List<NameChangeListener> nameChangeListeners = new ArrayList<NameChangeListener>();

    public void addNameChangeListener (NameChangeListener addName){
        nameChangeListeners.add(addName);
    };

    public void removeNameChangeListener(NameChangeListener removeName){
        nameChangeListeners.remove(removeName);
    };

    public void fireNameChangeEvent(){};
}
