import java.io.*;
import java.io.IOException;
public class CopyBytes {
		public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try {
		   inputStream = new BufferedReader(new FileReader("textfile.rtf"));
		   outputStream = new PrintWriter(new FileWriter("salidatexto.txt"));
		   
		 
		   String l;
		   while ((l = inputStream.readLine()) != null) {
			   outputStream.println(l);
			   System.out.println(l);
			   
		   }
		// -1 final del fichero
		} finally {
		    if (inputStream != null) {
		    inputStream.close();
		    }
		   if (outputStream != null) {
		   outputStream.close();
		   }
		}
		}
}
	 

