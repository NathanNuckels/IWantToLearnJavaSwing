package compilerGUI;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Compile{
    public String compile(String directory) throws IOException{
        ProcessBuilder compileBuilder = new ProcessBuilder("javac *.java").directory(new File(directory));
        Process p = compileBuilder.start();
        while (!p.isAlive()){
            System.out.println("Waiting for compiler...");
        }
        System.out.println("Done.\n");
        return Converter.convert(p);
    }
    public void printArray(ArrayList<String> data){
        for(String i:data){
            System.out.print(i);
        }
        return;
    }
    public String build(String sourcePath, String outputPath) throws IOException{
        boolean windows = System.getProperty("os.name").toLowerCase().contains("windows");
        File source = new File(sourcePath);
        File output = new File(outputPath);
        if (!output.exists()){
            output.mkdir();
        }
        File finalsrc = new File(source.getAbsolutePath());
        File finaldest = new File(output.getAbsolutePath());
        if (windows){
            Process p1 = new ProcessBuilder("xcopy "+source.getAbsolutePath()+" "+output.getAbsolutePath()+" /s /e /y").start();
            while(p1.isAlive()){;}
            Process p2 = new ProcessBuilder("javac *.java").directory(finaldest).start(); //To be fixed later.
            while(p2.isAlive()){;}
            Process p3 = new ProcessBuilder("del /s *.java").directory(finaldest).start(); //To be fixed later
            while(p3.isAlive()){;}
            return Converter.convert(p2);
        } else {
            Process p1 = new ProcessBuilder("cp -r "+source.getAbsolutePath()+" "+output.getAbsolutePath()).start();
            while(p1.isAlive()){;}
            Process p2 = new ProcessBuilder("javac *.java").directory(finaldest).start();//To be fixed later
            while(p2.isAlive()){;}
            Process p3 = new ProcessBuilder("rm -r *.java").directory(finaldest).start();//To be fixed later
            while(p3.isAlive()){;}
            return Converter.convert(p2);
        }
        
    }
}
