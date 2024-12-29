import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainWindow implements ActionListener {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;

    public MainWindow() {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Press the buttons to resize the window.", SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton increaseButton = new JButton("Increase Size");
        JButton decreaseButton = new JButton("Decrease Size");

        buttonPanel.add(increaseButton);
        buttonPanel.add(decreaseButton);

        frame.add(buttonPanel);

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setSize(frame.getWidth() + 10, frame.getHeight() + 10);
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setSize(frame.getWidth() - 10, frame.getHeight() - 10);
            }
        });

        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {}
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    frame.setSize(frame.getWidth() + 10, frame.getHeight() + 10);
                }
            }
            public void keyReleased(KeyEvent e) {}
        });

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Button1".equals(e.getActionCommand())) {
            System.out.println("Hellow World!");
        }
    }
}
