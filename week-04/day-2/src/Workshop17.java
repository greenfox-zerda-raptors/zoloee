/**
 * File I/O: The copy command exercise
 *
 * This is just standard I/O and it's usually given as an early IT assignment.
 *
 * Given all that you've already seen and done, this should be fairly easy.
 *
 * This is how it should work, but NOTE ...
 * >>> means that what the computer does; and
 * <<< is what you the user does.
 *
 * >>> Enter the Source filename (assuming reading from C:\TEMP\) or give a different path name to?
 * <<< TestA.txt
 * >>> File does not exist, try again or blank to exit
 * <<< Test.txt
 * >>> Enter the Target filename (assuming writing to C:\TEMP\) or give a different path name?
 * <<< NewTest.txt
 * >>> Writing from C:\TEMP\Test.txt to C:\TEMP\NewTest.txt.  Press Y to confirm, N to abort.
 * <<< Y
 * >>> Done, wrote 102 Characters to C:\TEMP\NewTest.txt.
 *
 * Note that you should compute the working directory (e.g. C:\TEMP\).
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javax.imageio.IIOException;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class Workshop17 {
    static File myFile;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        File fileSource;
        File fileDest;
        fileSource =getSource();
        fileDest = getDest();
        copyFile(fileSource,fileDest);
    }

    public static void copyFile(File fileSource, File fileDest){
        String yesno="";
        int counter=0;
        while (!((Objects.equals(yesno, "y") || Objects.equals(yesno, "n")))){
            System.out.println("Writing from " + fileSource.getPath() + " to " + fileDest.getPath() + ". Press Y to confirm, N to abort.");
            yesno = userInput.nextLine();
        }
        if (Objects.equals(yesno, "y")){
            counter=actualCopy(fileSource, fileDest);
            System.out.println("Done, wrote " + counter + " chars" + " to " + fileDest.getPath());
        }
        else{
            System.out.println("aborting");
        }
    }

    public static Integer actualCopy(File file1, File file2){

        FileReader fin = null;
        FileWriter fout = null;
        int counter = 0;

        try {
            fin = new FileReader(file1.getPath());
            fout = new FileWriter(file2.getPath());
            int c = fin.read();
            while(c!=-1) {
                fout.write(c);
                c = fin.read();
                counter ++;
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            close(fin);
            close(fout);
        }
        return counter;
    }
    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch(IOException e) {
            System.out.println("error - notcloseable");
        }
    }

    public static File getSource(){
        String strFileName = "";
        do{
            System.out.println("Enter filename (q to quit):");
            try {
                strFileName =  userInput.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (Objects.equals(strFileName, "q")) {
                System.out.println("Quittig");
                break;
            }
            myFile = new File(strFileName);

            try {
                System.out.println(myFile.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("no file");
            }
        } while(myFile.exists()==false);
    return myFile;
    }

    public static File getDest(){
        String strFileName = "";
        System.out.println("Enter the target filename:");
        try {
            strFileName = userInput.nextLine();
        }catch (Exception e) {
            System.out.println(e);
        }
        myFile = new File(strFileName);
        return myFile;
    }

    // get the directory
    // get the names & confirm the source is okay and if the target exists ignore error (if already exists)
    // get the filename directory
    // get the names & confirm the source is okay and if the target exists ignore error (if already exists)
    // confirm action
    // confirm
    // read/write and count
    // report
}
