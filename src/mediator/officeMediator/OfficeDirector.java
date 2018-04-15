package mediator.officeMediator;

import java.util.List;

public class OfficeDirector implements Director {

    @Override
    public void onWorkerChanged(Worker worker) {
        if (worker instanceof Manager) {
            System.out.println("OfficeDirector: Manager last task complete");
        }
        if (worker instanceof Engineer) {
            System.out.println("OfficeDirector: Engineer last task complete");
        }
    }

    @Override
    public List<Worker> showWorkersInOffice() {
        return WORKER_LIST;
    }

    @Override
    public void addNewWorker(Worker worker) {
        WORKER_LIST.add(worker);
    }

    @Override
    public void startWork() {
        for (Worker worker : WORKER_LIST) {
            worker.setNewTask("WORK");
        }
    }
}
