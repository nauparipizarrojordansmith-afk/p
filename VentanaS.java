import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
public class VentanaSimple {
 public static void main(String[] args) {
 JFrame frame = new JFrame("UPLA - Ingeniería de Sistemas");
 frame.setSize(500, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JLabel label = new JLabel("Bienvenidos a Programación I", SwingConstants.CENTER); 
 label.setFont(new Font("Arial", Font.BOLD, 24));
 frame.add(label);
 frame.setVisible(true);
 }
}