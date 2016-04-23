import javax.swing.*;
import java.awt.*;
public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("star war");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,700);

		frame.setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.add(panel);

}
}