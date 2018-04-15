package mediator;

import mediator.officeMediator.Engineer;
import mediator.officeMediator.Manager;
import mediator.officeMediator.OfficeDirector;

public class MainMediator {

    public static void main(String[] args) {
        OfficeDirector officeDirector = new OfficeDirector();
        Manager manager = new Manager(officeDirector);
        Engineer engineer = new Engineer(officeDirector);
        officeDirector.addNewWorker(manager);
        officeDirector.addNewWorker(engineer);
        System.out.println(officeDirector.showWorkersInOffice());
        officeDirector.startWork();
        engineer.onWorkComplete();
        manager.onWorkComplete();
        engineer.setNewTask("new WORK");
        manager.setNewTask("new WORK");


    }
}
