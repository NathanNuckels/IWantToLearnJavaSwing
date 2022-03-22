package compilerGUI;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Compile{
    public ArrayList<String> compile(String directory){
        ProcessBuilder compileBuilder = new ProcessBuilder("javac *.java").directory(new File(directory));
        Process p = compileBuilder.start();
        while (!p.isAlive()){
            System.out.println("Waiting for compiler...")
        }
        System.out.println("Done.\n");
        Scanner s = new Scanner(p.getOutputStream());
        ArrayList<String> output = new ArrayList<String>();
        while (s.hasNextLine()){
            output.add(s.nextLine());
        }
        return output;
    }
    public void printArray(ArrayList<String> data){
        while(String i:data){
            System.out.print(i);
        }
        return;
    }
    public ArrayList<String> build(String sourcePath, String outputPath) throws IOException{
        boolean windows = System.getProperty("os.name").toLowerCase().contains("windows");
        File source = new File(sourcePath);
        File output = new File(outputPath);
        if (!output.exists()){
            output.mkdir();
        }
        if (windows){
            Process p1 = new ProcessBuilder("xcopy "+source.getAbsolutePath()+" "+output.getbsolutePath()+" /s /e /y").start();
            while(p1.isAlive()){;}
            Process p2 = new ProcessBuilder("javac *.java").directory(output.getAbsolutePath()).start();
            while(p2.isAlive()){;}
            Process p3 = new ProcessBuilder("del /s *.java").directory(output.getAbsolutePath()).start();
            while(p3.isAlive()){;}
        } else {
            Process p1 = new ProcessBuilder("cp -r "+source.getAbsoluteDirectory()+" "+output.getAbsolutePath()).start();
            while(p1.isAlive()){;}
            Process p2 = new ProcessBuilder("javac *.java").directory(output.getAbsolutePath()).start();
            while(p2.isAlive()){;}
            Process p3 = new ProcessBuilder("rm -r *.java").directory(output.getAbsolutePath()).start();
            while(p3.isAlive()){;}
        }
        ArrayList<String> o = new ArrayList<String>();
        Scanner s = new Scanner(p2.getOutputStream());
        while(s.hasNextLine()){
            o.add(s.nextLine());
        }
    }
}
