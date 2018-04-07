package command.commands;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadReceiver extends Thread implements Receiver {

    private static Queue<ThreadReceiver> _ThreadQueue = new LinkedBlockingQueue<>();

    @Override
    public void run() {
        try {
            while (isAlive() && !isInterrupted()) {
                sleep(500);
                System.out.println("thread work");
            }
        } catch (InterruptedException e) {
            this.interrupt();
        }
    }

    @Override
    public Receiver startThread() {
        ThreadReceiver _Receiver = new ThreadReceiver();
        _ThreadQueue.add(_Receiver);
        _Receiver.start();
        return _Receiver;
    }

    @Override
    public void stopThread() {
        ThreadReceiver _thread = _ThreadQueue.peek();
        if (_thread != null)
        _thread.interrupt();

        _ThreadQueue.poll();
    }
}
