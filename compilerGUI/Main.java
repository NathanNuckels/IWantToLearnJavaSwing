package compilerGUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//TODO
// ButtonListener extends ActionListener
// ErrorDialog extends JDialog
public class Main extends JFrame implements ActionListener{
    private JButton comp;
    private ErrorBox errorbox;
    private Compile compile;
    private JTextField src,dest;
    private ErrorDialog dialog;
    public Main(){
        compile = new Compile();
        dialog = new ErrorDialog();
        setTitle("Java Compiler");
        buttonPanel = new JPanel();
        ImageIcon compileImage = new ImageIcon("Compile.png");
        src = new JTextField("Source path");
        dest = new JTextFeild("Build path");
        //cp = new JTextFeild("Class Path (optional)");
        comp = new JButton("Compile",compileImage);
        comp.addActionListener(new ButtonListener(src,dest));
        buttonPanel.add(comp);
        setLayout(new FlowLayout());
        add(buttonPanel);
        
        pack();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Main main = new Main();
                main.setVisible(true);
            }
        });
    }
}
