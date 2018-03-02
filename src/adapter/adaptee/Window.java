package adapter.adaptee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    JButton mJButton;

    protected Window() throws HeadlessException {
        super("RobotWindowControl");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = dimension.width;
        int y = dimension.height;
        this.setBounds(0,0, x/2, y/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,3));

        mJButton = new JButton("StartRobot");
        mJButton.addActionListener(new buttonClick());
        container.add(mJButton);

    }

    protected class buttonClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mJButton.setText("Robot Started");
        }
    }

    public void setNewBounds(int x, int y) {
        this.setBounds(0,0, x, y);
    }
}
