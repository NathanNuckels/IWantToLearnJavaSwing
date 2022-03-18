package moveArround;
import java.awt.*;
import javaz.swing.*;

public class Main extends JFrame{
  Dimention size = new Dimention(1000,750);
  
  public Main(){
    setSize(size.width,size.height);
    setResizable(false);
    setTitle("Move Arround");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel playerContainer = new JLabel(new ImageIcon("player.png"));
    Player player = new Player(playerContainer);
    pack();
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
//Thank Kyuu >w<
