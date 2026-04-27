import javax.swing.*;
import java.awt.*;

public class TextoParpadeante {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("UPLA - Texto Parpadeante");
            frame.setSize(400, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("INGENIERÍA DE SISTEMAS", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 28));
            frame.add(label);

            // Timer para el parpadeo (cada 500ms)
            Timer timer = new Timer(500, e -> {
                label.setVisible(!label.isVisible());
            });
            
            timer.start();
            frame.setVisible(true);
        });
    }
}