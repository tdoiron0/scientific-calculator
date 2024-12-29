import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow implements ActionListener {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;

    private final List<KeyListener> listeners = new ArrayList<>();

    MainWindow() {
        AtomicBoolean expand = new AtomicBoolean(); 

        listeners.add(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    expand.set(true);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == ' ') {
                    expand.set(false);
                }
            }
        });

        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setLayout(null);

        JButton button = new JButton("Button1");
        button.setBounds(10, 10, 100, 50);
        button.setBackground(Color.GREEN);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Button1".equals(e.getActionCommand())) {
            System.out.println("Hellow World!");
        }
    }
}
