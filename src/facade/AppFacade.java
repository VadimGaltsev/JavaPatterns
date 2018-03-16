package facade;

import facade.facadeImp.Crab;
import facade.facadeImp.CrabsFacade;

public class AppFacade {

    public static void main(String[] args) {
        CrabsFacade crabsFacade = new CrabsFacade();
        crabsFacade.getCrabs();
        crabsFacade.addCrab("loly");
        crabsFacade.getCrabs().crabEating();
        Crab crab =  crabsFacade.getCrabs().getCurrentCrab(0);
        System.out.println(crab.getName());
        crab.crabEating();
    }
}
