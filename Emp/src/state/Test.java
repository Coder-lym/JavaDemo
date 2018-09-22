package state;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str1="%E6%A2%81%E7%8E%89%E6%B0%91";
		String str2=URLDecoder.decode(str1, "utf-8");
        System.out.println(str2);
       
        
	}

}
