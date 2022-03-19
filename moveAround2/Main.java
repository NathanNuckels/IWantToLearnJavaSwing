package moveAround2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements KeyListener{
    Container contentPane;
    public Main(){
        setTitle("Hello");
        setLayout(null);
        Player player = new Player();
        this.contentPane = getContentPane();
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.add(player);
        panel.setLayout(null);
        contentPane.setLayout(null);
        contentPane.add(panel);
        add(panel);
        panel.setVisible(true);
        panel.setBorder(BorderFactory.createBevelBorder(10));
        setDefaultCloseOperation(3);
        pack();
    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main frame = new Main();
                frame.setSize(1000,750);
                frame.setVisible(true);
            }
        });
    }

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();
        if (key==KeyEvent.VK_RIGHT){
            setBounds(50,50,50,50);
        }
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
