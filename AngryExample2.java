import javax.swing.*;
import java.awt.*;

public class AngryExample2 extends JFrame {
    JButton ok,cancel;
    Container pane;
    JPanel panel;
    public AngryExample2(){
        //super("Example");
        setTitle("hh");
        panel= new JPanel();
        ok=new JButton("ok");
        panel.add(ok);
        JLabel lab = new JLabel(new ImageIcon("moveArround/player.png"));
        add(lab);
        setDefaultCloseOperation(3);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AngryExample2 frame = new AngryExample2();
                frame.setSize(400,100);
                frame.setVisible(true);
            }
        });
    }
}
