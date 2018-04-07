package command;

import command.commands.Commander;
import command.commands.ThreadReceiver;

public class CommandMain {
    public static void main(String[] args) {
        Commander<ThreadReceiver> _commander = new Commander<>(new ThreadReceiver());
        _commander.execute();
        _commander.execute();
        System.out.println(_commander.getActiveCount());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _commander.unExecute();
        System.out.println(_commander.getActiveCount());
        _commander.unExecute();
        System.out.println(_commander.getActiveCount());
    }
}
