package moveArround;
import java.awt.*;
import javaz.swing.*;

public class Main extends JFrame implements KeyListener, FocusListener{
  Dimention size = new Dimention(1000,750);
  
  public Main(){
    setSize(size.width,size.height);
    setResizable(false);
    setTitle("Move Arround");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel playerContainer = new JLabel(new ImageIcon("player.png"));
    Player player = new Player(playerContainer);
    JPanel focusBox = new JPanel();
    focusBox.setBounds(100,100,size.width-100,size.height-100);
    focusBox.setBackground(Color.Grey);
    JLabel focusLabel = new JLabel("Click to gain focus.");
    focusLabel.setBounds(20,20,size.width-120,size.height-120);
    focusLabel.setVerticalTextPosition(JLabel.CENTER);
    focusLabel.setHorazontalTextPosition(JLabel.CENTER);
    focusBox.add(focusLabel);
    addFocusListener(this);
    addKeyListener(this);
    add(playerContainer);
    add(focusBox);
    focusBox.setVisible(false);
    pack();
  }
  public void FocusLost(FocusEvent e){
    focusBox.setVisible(true);
  } 
  public void FocusGained(FocusEvent e){
    focusBox.setVisible(false);
  }  
  public void keyPressed(KeyEvent e){
    player.keyboardEvent(e.getKeyCode());
  }

  
  public static void main(String[] args){
    System.out.println("Loading...");
    SwingUtilities.invokeLater(new Runnable(){
      @Override
      public void run(){
        new Main().setVisible(true);
      }
    });
    System.out.println("Done!");
  }
}
//Thank Kyuu >w<
