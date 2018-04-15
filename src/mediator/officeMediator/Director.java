package mediator.officeMediator;

import java.util.ArrayList;
import java.util.List;

public interface Director {
    static List<Worker> WORKER_LIST = new ArrayList<>();
    void onWorkerChanged(Worker worker);
    List<Worker> showWorkersInOffice();
    void addNewWorker(Worker worker);
    void startWork();
}
