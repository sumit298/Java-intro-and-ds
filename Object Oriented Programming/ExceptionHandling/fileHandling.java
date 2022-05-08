import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileHandling {
 
    public static void main(String[] args)
    {	
    	FileInputStream instream = null;
	FileOutputStream outstream = null;
 
    	try{
    	    File infile =new File("C:\\MyInputFile.txt");
    	    File outfile =new File("C:\\MyOutputFile.txt");
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	   
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	   
    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }
}

