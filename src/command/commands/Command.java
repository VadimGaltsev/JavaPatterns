package command.commands;

import java.util.Queue;

abstract class Command {
    Queue<Command> _Commands;
    abstract void execute();
    abstract void unExecute();
}
