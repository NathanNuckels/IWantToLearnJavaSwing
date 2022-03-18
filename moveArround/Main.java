package moveArround;
import javax.swing.*;

public class Main extends JFrame{
  public Main(){
    setSize(1000,750);
    setResizeable(false);
    setDefaultCloseOpperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Move Arround");
    ImageIcon image=new ImageIcon("character.png");
    Player player=new Player(image);
    pack();
  }
  public void keyPressed(KeyEvent evt){
    int key=evt.getKeyCode();
    if (key==KeyEvent.VK_LEFT){
      if (player.x>0){
        player.setX(player.x-player.speed);
      }else{
        player.setX(0);
      }
    }
    if (key==KeyEvent.VK_RIGHT){
      if (player.x<(1000-player.size.width)){ //TODO: Create:  Dimention Player.size
        player.setX(player.x+player.speed);  //TODO: Player.setX
      }else{
        player.setX(1000-player.size.width);
      }
    }
    if (key==KeyEvent.VK_UP){
      if (player.y>0){
        player.setY(player.y-player.speed);
      }else{
        player.setY(0);
      }
    }
    if (key==KeyEvent.VK_DOWN){
      if (player.y<750){
        player.setY(player.y+player.speed);
      }else{
        player.setY(750-player.size.height);
      }
    }
  }
  public static void main(String[] args){
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      @Override
      public void run(){
        new Main().setVisible(true);
      }
    });
  }
}

//Thank kyuu >w<
