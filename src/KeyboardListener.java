import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JFrame;

public class KeyboardListener extends JFrame implements KeyListener {
    private static final AtomicBoolean expand = new AtomicBoolean(); 

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
}
