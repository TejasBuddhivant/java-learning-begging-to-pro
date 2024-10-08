package file_input;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_operation {

	public static void main(String[] args) throws IOException  
    {
     FileInputStream se= new FileInputStream("D:\\New Text Document.txt");
     System.out.println("file found");
    }
}
