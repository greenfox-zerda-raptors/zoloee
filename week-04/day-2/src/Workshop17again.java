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
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.imageio.IIOException;
import java.io.*;
// import java.io.File;
// import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by zoloe on 2016. 11. 11..
 */
public class Workshop17again {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {

        String fileSource;
        String fileDest;
        boolean mustExist=true;

        fileSource=getFileName("source", mustExist);
        fileDest=getFileName("target", !mustExist);
//
//        System.out.println("so= " + fileSource);
//        System.out.println("sd= " + fileDest);

        int counter = 0;
        String yesno = "";

        while (!((Objects.equals(yesno, "y") || Objects.equals(yesno, "n")))){
            System.out.println("Writing from " + fileSource + " to " + fileDest);
            System.out.println("Press y to confirm, n to abort.");
            yesno = userInput.nextLine();
        }
        if (Objects.equals(yesno, "y")){
            counter=fileCopy(fileSource, fileDest);
            System.out.println("Done, wrote " + counter + " chars" + " to " + fileDest);
        }
        else{
            System.out.println("aborting");
        }
    }

    public static Integer fileCopy(String Source, String Dest){
        FileReader fileIn=null;
        FileWriter fileOut=null;
        int counter = 0;

        try{
            fileIn = new FileReader(Source);
            fileOut = new FileWriter(Dest);
            int c = fileIn.read();
            while(c!=-1) {
                fileOut.write(c);
                c = fileIn.read();
                counter ++;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                fileIn.close();
            }catch (IOException e){
                System.out.println("Source file IO error - can not close file" + e);
            }
            try{
                fileOut.close();
            }catch (IOException e){
                System.out.println("Dest File IO error - can not close file" + e);
            }
        }
        return counter;
    }

    public static String getFileName(String sourceOrdest, boolean mustexist){
        String strFileName="";
        File myFile;

        do {
            System.out.println("Enter " + sourceOrdest + " filename (blank to quit):");
            try {
                strFileName =  userInput.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (Objects.equals(strFileName, "")) {
                System.out.println("Quittig");
                System.exit(0);
            }
            myFile = new File(strFileName);
            if (myFile.isDirectory()){
                System.out.println("This is a directory. Pls enter a filename for " + sourceOrdest);
            }else if (mustexist && (myFile.exists()==false)){
                try {
                    System.out.println(myFile.getCanonicalPath());
                    System.out.println("The file does not exist. Pls enter an existing one.");
                }catch (Exception e){
                    System.out.println("io kaboom");
                }
            }else{
                break;
            }
        } while(myFile.exists()==false || myFile.isDirectory());
        return myFile.getAbsolutePath();
    }
}

























