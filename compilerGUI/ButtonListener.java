package compilerGUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonListener extends ActionListener{
    private JTextField src,dest;
    private Compile compile;
    public ButtonListener(JTextField sourceBox, JTextField buildBox, Compile compile){
        this.src = sourceBox;
        this.dest = buildBox;
        this.compile = compile;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        compile.build(src.getText(),dest.getText());
    }
}
