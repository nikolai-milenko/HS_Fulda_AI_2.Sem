import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class JumpButtonMouseListener implements MouseMotionListener {
    private final JButton button;
    private boolean left = true;

    public JumpButtonMouseListener(JButton button) {
        this.button = button;
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {
        button.setLocation(left ? button.getX() - 50 : button.getX() + 50, button.getY());
        left = !left;
    }
}
