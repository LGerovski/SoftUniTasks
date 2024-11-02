package SoftUni;

import java.util.List;

public class Dispatcher {
    public String name;
    List<NameChangeListener> NameChangeListeners;

    public void addNameChangeListener (){};

    public void removeNameChangeListener(){};

    public void fireNameChangeEvent(){};
}
