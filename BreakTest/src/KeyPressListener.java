import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressListener extends JFrame implements KeyListener {

    public KeyPressListener() {
        setTitle("Key Press Listener");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        KeyPressListener frame = new KeyPressListener();
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            System.out.println("Цикълът е прекъснат.");
            System.exit(0);
        } else {
            System.out.println("Натиснат е клавиш: " + e.getKeyChar());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }
}
