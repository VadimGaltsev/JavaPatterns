package composite;

import composite.Component.Kiborgs;
import composite.Component.RobotsArmy;
import composite.Component.Unity;

public class Start {

    public static void main(String[] args) {
        RobotsArmy army = new RobotsArmy("Mix robots army");
        army.addUnity(new Kiborgs("Kiborgs first squad"));
        army.addUnity(new Kiborgs("Kiborgs second squad"));
        army.Attack();
        Unity squad = army.getSquad(0);
        squad.Attack();
        Unity.UnitySquad<Kiborgs> kiborgsUnitySquad = army.getSquad(1);
        kiborgsUnitySquad.addUnity(new Kiborgs("Single kibborg"));
        kiborgsUnitySquad.Attack();
        Kiborgs kiborgs = kiborgsUnitySquad.getSquad(0);
        kiborgs.Attack();

    }
}
