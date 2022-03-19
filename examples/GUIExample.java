package examples;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GUIExample extends JFrame{
    JButton ok, cancel;
    Container contentPane;
    JPanel panel;
    Font fontTitle;
    public GUIExample(){
        super("Border Examples");

        panel=new JPanel();
        ok=new JButton("Ok");
        cancel=new JButton("Cancel");
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        fontTitle=new Font("Comic Sans Ms", Font.BOLD + Font.ITALIC, 12);
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        panel.add(ok);
        panel.add(cancel);
        contentPane.add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIExample example = new GUIExample();
                example.setSize(400,100);
                example.setVisible(true);
            }
        });
    }
}
