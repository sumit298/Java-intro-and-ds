import java.io.*;

public class FileCopyingInOutStream {
    public static void main(String[] args) {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try {
            File inputFile = new File(
                    "D:\\Java\\New - Intoduction to Java\\Object Oriented Programming\\FileHandling\\input.txt");
            File outputFile = new File(
                    "D:\\Java\\New - Intoduction to Java\\Object Oriented Programming\\FileHandling\\output.txt");

            // For writing in the file.
            FileWriter writer = new FileWriter(
                    "D:\\Java\\New - Intoduction to Java\\Object Oriented Programming\\FileHandling\\input.txt");
            writer.write("Goo too Helllllllllllllll");
            writer.close();
            System.out.println("File Written Successfully");

            // For checking file created or not.
            if (inputFile.createNewFile()) {
                System.out.println("File Created Successfully" + inputFile.getName());
            } else {
                System.out.println("File already exists");
            }
            inStream = new FileInputStream(inputFile);
            outStream = new FileOutputStream(outputFile);
            // For copy logic
            byte buffer[] = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            inStream.close();
            outStream.close();
            System.out.println("File Copied");
        } catch (Exception e) {
            System.out.println("Exception Occured :" + e);
            e.printStackTrace();

        }
    }
}
