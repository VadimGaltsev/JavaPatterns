package command.commands;

import java.util.concurrent.LinkedBlockingQueue;

public class Commander<T extends Receiver> extends Command {

    private T _Receiver;

    public Commander(T _Receiver) {
        this._Receiver = _Receiver;
        _Commands = new LinkedBlockingQueue<>();
    }

    @Override
    public void execute() {
        _Commands.add(new Commander<T>((T)_Receiver.startThread()));
    }

    @Override
    public void unExecute() {
        Command _command = _Commands.poll();
        if (_command != null) {
            _Receiver.stopThread();
        }
    }
    public int getActiveCount() {
        return _Commands.size();
    }
}
