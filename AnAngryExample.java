import javax.swing.*;
import javax.swing.border.BevelBorder;

public class AnAngryExample {
    JFrame frame;
    JPanel panel;
    JButton b1,b2;
    public AnAngryExample(){
        System.out.println("I'm getting angery....");
        frame = new JFrame();
        frame.setTitle("Title");
        panel=new JPanel();
        b1=new JButton("Yes");
        b2=new JButton("No");
        panel.add(b1);
        panel.add(b2);
        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnAngryExample();
            }
        });
    }
}
