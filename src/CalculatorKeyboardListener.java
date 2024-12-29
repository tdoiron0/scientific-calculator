import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CalculatorKeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == ' ') {
            System.out.println("Pressed");
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == ' ') {
            System.out.println("Released");
        }
    }
}
