//JDialog
//ErrorDialog

package compilerGUI;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class ErrorDialog extends JDialog{
    JButton close;
    JTextField text;
    public ErrorDialog(){
        text = new JTextField();
        close = new JButton("Close");
        close.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        };
        setLayout(new FLowLayout());
        add(text);
        add(close);
    }
    public void setErrorText(ArrayList<String> t){
        String displayString = "";
        for (String i:t){
            displayString+=i;
        }
        text.setText(displayString);
        setVisible(true);
    }
}
