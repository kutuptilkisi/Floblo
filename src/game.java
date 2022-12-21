import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class game {

	public static void main(String[] args) {
	//tasarım
	JFrame frame = new JFrame();
	//ayarlar
    frame.setTitle("Mines 0.1(alpha)");
    frame.setSize(580, 360);
    ImageIcon img = new ImageIcon(game.class.getResource("/assets/ikon.png"));
    frame.setIconImage(img.getImage());
    frame.getContentPane().setBackground(new Color(255, 255, 100));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
    //konsol
    System.out.println("Mines başlatıldı");
	}
}
