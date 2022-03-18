package moveArround;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Player{
  private int x;
  private int y;
  private final int speed;
  private final Dimension size;
  private final Dimension windowSize;
  private final JLabel parent;
  public Player(JLabel parent, Dimension window){
    this.parent=parent;
    size=parent.getPreferredSize();
    windowSize=window;
    x=0;
    y=0;
    speed=5;
  }
  
  public void keyboardEvent(int key){
    if (key==KeyEvent.VK_LEFT){
      if (x>0){
        x-=speed;
      }else{
        x=0;
      }
    }
    if (key==KeyEvent.VK_RIGHT){
      if (x<windowSize.width){
        x+=speed;
      }else{
        x=windowSize.width-size.width;
      }
    }
    if (key==KeyEvent.VK_UP){
      if (y>0){
        y-=speed;
      }else{
        y=0;
      }
    }
    if (key==KeyEvent.VK_DOWN){
      if (y<windowSize.height){
        y+=speed;
      }else{
        y=windowSize.height-size.height;
      }
    }
    setPos();
  }
  public void setPos(){
    parent.setBounds(x,y,size.width,size.height);
  }
}
//Thank Kyuu >w<
    
