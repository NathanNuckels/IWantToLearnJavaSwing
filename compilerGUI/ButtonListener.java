package compilerGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.IOException;

public class ButtonListener implements ActionListener{
    private JTextField src,dest;
    private Compile compile;
    private ErrorDialog dialog;
    public ButtonListener(JTextField sourceBox, JTextField buildBox, Compile compile, ErrorDialog errordialog){
        this.src = sourceBox;
        this.dest = buildBox;
        this.compile = compile;
        this.dialog = errordialog;
    }
    //@Override
    public void actionPerformed(ActionEvent e){
		try{
        	String out = compile.build(src.getText(),dest.getText());
			if (out=="" || out==null){
            	dialog.setErrorText(out);
        	}
		} catch (IOException ex){
			ex.printStackTrace();
		}

    }
}
