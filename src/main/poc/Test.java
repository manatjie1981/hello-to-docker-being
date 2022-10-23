package main.poc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class Test {

	  public static void main(String[] args) throws Exception
	  {
	    // List all supported encodings
	    for (String cs : Charset.availableCharsets().keySet())
	      System.out.println(cs);

	    File file = new File("SomeWindowsFile.txt");
	    StringBuilder builder = new StringBuilder();

	    // Construct a reader for a specific encoding
	    Reader reader = new InputStreamReader(new FileInputStream(file), "windows-1252");
	    while (reader.ready())
	    {
	      builder.append(reader.read());
	    }
	    reader.close();

	    String string = builder.toString();

	    // Construct a writer for a specific encoding
	    Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF8");
	    writer.write(string);
	    writer.flush();
	    writer.close();
	  }

}
