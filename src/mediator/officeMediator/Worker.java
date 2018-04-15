package mediator.officeMediator;

import java.util.ArrayList;

public abstract class Worker {
    Director _director;
    ArrayList<String> _Tasks;

    Worker(Director _director) {
        this._director = _director;
    }

    public abstract void onWorkComplete();
    public abstract void setNewTask(String s);
}
