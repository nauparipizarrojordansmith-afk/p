import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.Container;
public class TextoMovimiento {
 public static void main(String[] args) {
 EventQueue.invokeLater(() -> {
     JFrame frame = new JFrame("UPLA - Texto en Movimiento");
 frame.setSize(600, 200);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLayout(null); 
  JLabel label = new JLabel("UPLA - Ingeniería de Sistemas");
 label.setFont(new Font("Arial", Font.BOLD, 24));
 int y = 80;
 label.setBounds(10, y, 400, 40);
 Container content = frame.getContentPane();
 content.add(label);
 frame.setVisible(true);
 final int[] x = {10};
 Timer timer = new Timer(30, e -> {
 x[0] += 3;
 if (x[0] > frame.getWidth()) {
 x[0] = -400;
 }
 label.setLocation(x[0], y);
 });
 timer.start();
 });
 }
}
