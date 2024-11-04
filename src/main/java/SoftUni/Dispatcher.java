package SoftUni;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public String name;
    List<NameChangeListener> nameChangeListeners = new ArrayList<NameChangeListener>();

    public void addNameChangeListener (NameChangeListener Name){
        nameChangeListeners.add(Name);
    };

    public void removeNameChangeListener(NameChangeListener Name){nameChangeListeners.remove(Name);
    };

    public void fireNameChangeEvent(){
        for (NameChangeListener event : nameChangeListeners) {
            //event.handleChangedName();
            
            System.out.printf("");
        }
    };
}
