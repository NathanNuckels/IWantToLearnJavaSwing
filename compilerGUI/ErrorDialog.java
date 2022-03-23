package compilerGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ErrorDialog extends JDialog{
    JButton close;
    JTextField text;
    public ErrorDialog(){
        text = new JTextField();
        close = new JButton("Close");
        close.addActionListener(new ActionListener(){
            //@Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
        setLayout(new FlowLayout());
        add(text);
        add(close);
    }
    public void setErrorText(String t){
        text.setText(t);
        setVisible(true);
    }
}
