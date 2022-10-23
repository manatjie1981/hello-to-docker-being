package main.poc;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestLongHyphen {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// â€
		String h = "Hello â€";
		System.out.println("—");
		System.out.println(h);
		String subject = new String(h.getBytes("UTF-8"), "UTF-8");
		System.out.println(subject);
		String subject2 = new String(h.getBytes(), "UTF-8");
		System.out.println(subject2);
		System.out.println("\\u2019");
		
		byte[] windows1252 = { (byte) 0xA2 };
		String utf16 = new String(windows1252, Charset.forName("windows-1252"));
		byte[] utf8 = utf16.getBytes(StandardCharsets.UTF_8);
		System.out.println(utf8);
	}
}
