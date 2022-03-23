package compilerGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonListener extends ActionListener{
    private JTextField src,dest;
    private Compile compile;
    private ErrorDialog dialog;
    public ButtonListener(JTextField sourceBox, JTextField buildBox, Compile compile, ErrorDialog errordialog){
        this.src = sourceBox;
        this.dest = buildBox;
        this.compile = compile;
        this.dialog = errordialog;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        ArrayList<String> out = compile.build(src.getText(),dest.getText());
        if (out.size()>0){
            dialog.setErrorText(out);
        }
    }
}
