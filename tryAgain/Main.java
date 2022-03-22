package tryAgain;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	private JPanel panel;
	private JButton button;
	private MenuBar menubar;
	public Main(){
		super("Hello World!");
		panel=new JPanel();
		button=new JButton("Hello.");
		menubar=new MenuBar();
		panel.add(button);
		add(panel);
		setJMenuBar(menubar.bar);

	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new Main().setVisible(true);
			}
		});
	}
}
