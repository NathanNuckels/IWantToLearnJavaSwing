package tryAgain;
import java.awt.*;
import javax.swing.*;

public class MenuBar extends JMenu{
	protected JMenuBar bar;
	private JMenu menu, menu2;
	private JMenuItem item1;

	public MenuBar(){
		bar = new JMenuBar();
		menu = new JMenu("Menu1");
		menu2 = new JMenu("Menu2");
		bar.add(menu);
		bar.add(menu2);
		item1 = new JMenuItem("A text menu item.");
		menu.add(item1);
	}
}
