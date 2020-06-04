package JavaCode;


import java.io.File;
import java.io.IOException;

public class ReadOnlyFile
{

    public void createFile() throws IOException
    {
        File myfile = new File("D://thao1.docx");
        //making the file read only
        if (myfile.exists()) {
           // myfile.setReadOnly();
            //myfile.setWritable(false);
            Runtime.getRuntime().exec("attrib " + "" + myfile.getAbsolutePath() + "" + " +R");
        } else {
            System.out.println("File does not exists.");
        }
    }
}