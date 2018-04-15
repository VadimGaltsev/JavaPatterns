package mediator.officeMediator;

import java.util.ArrayList;

public class Engineer extends Worker {

    public Engineer(Director _director) {
        super(_director);
        _Tasks = new ArrayList<>();
    }

    @Override
    public void onWorkComplete() {
        _Tasks.clear();
        _director.onWorkerChanged(this);
    }

    @Override
    public void setNewTask(String s) {
        System.out.println("Engineer has a new WORK now");
        onWorkComplete();
        _Tasks.add(s);
    }
}
