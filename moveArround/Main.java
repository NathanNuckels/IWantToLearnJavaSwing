package moveArround;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main
        extends JFrame
        implements KeyListener, FocusListener {
  private final JPanel focusBox;
  private final Player player;

  public Main(){
    Dimension size = new Dimension(1000, 750);
    setSize(1000,750);
    //setResizable(false);
    setTitle("Move Around");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel playerContainer = new JLabel(new ImageIcon("player.png"));
    player = new Player(playerContainer, size);
    focusBox = new JPanel();
    focusBox.setBounds(100,100, size.width-100, size.height-100);
    focusBox.setBackground(Color.blue);
    JLabel focusLabel = new JLabel("Click to gain focus.");
    focusLabel.setBounds(20,20, size.width-120, size.height-120);
    focusLabel.setVerticalTextPosition(JLabel.CENTER);
    focusLabel.setHorizontalTextPosition(JLabel.CENTER);
    focusBox.add(focusLabel);
    addFocusListener(this);
    addKeyListener(this);
    add(playerContainer);
    add(focusBox);
    focusBox.setVisible(false);
    pack();
  }

  @Override
  public void focusLost(FocusEvent e){
    focusBox.setVisible(true);
  }

  @Override
  public void focusGained(FocusEvent e){
    focusBox.setVisible(false);
  }

  @Override
  public void keyPressed(@NotNull KeyEvent e){
    player.keyboardEvent(e.getKeyCode());
  }

  @Override
  public void keyReleased(KeyEvent e) {}

  @Override
  public void keyTyped(KeyEvent e) {}


  public static void main(String[] args){
    System.out.println("Loading...");
    SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    System.out.println("Done!");
  }
}
//Thank Kyuu >w<
