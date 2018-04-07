package command.commands;

interface Receiver {
    Receiver startThread();
    void stopThread();
}
