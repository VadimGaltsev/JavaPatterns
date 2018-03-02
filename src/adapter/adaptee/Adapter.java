package adapter.adaptee;

import javax.swing.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Adapter {

    private Window mJFrame;

    public Adapter() {
        startJFrameWindow();
    }

    public void startJFrameWindow() {
        SwingUtilities.invokeLater(() -> {
            mJFrame = new Window();
            mJFrame.setVisible(false);
        });

    }

    public void setJFrameBounds(int x, int y) {
        Executor executor = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> {
            synchronized (executor) {
                while (mJFrame == null) {
                    try {
                        executor.wait(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        executor.notify();
                    }
                }
            }

            mJFrame.setNewBounds(x, y);
            mJFrame.setVisible(true);
        };
        executor.execute(runnable);
    }

}
