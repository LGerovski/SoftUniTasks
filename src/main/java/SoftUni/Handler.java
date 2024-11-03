package SoftUni;

public class Handler implements NameChangeListener {
    public void handleChangedName (NameChange event){
        System.out.printf("Dispatcher’s name changed to %s\n", event.changed_name);
    }
}
