package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLDemo {
	static String BASE_URL_PATH = "http://v.juhe.cn/toutiao/index";

	public static void main(String[] args) throws Exception {
		System.out.println(doPost());
	}

	public static String doPost() {
		StringBuffer sb = null;
		try {
			URL url = new URL(BASE_URL_PATH);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();
			uc.setReadTimeout(8000);
			uc.setConnectTimeout(8000);
			uc.setDoInput(true);
			uc.setDoOutput(true);
			uc.setRequestMethod("POST");
			uc.connect();
			OutputStream os = uc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.write("type=top&key=4c466deea24045a297e27ff0e623acda");
			pw.close();
			if (uc.getResponseCode() == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream(), "UTF-8"));
				String s = "";
				sb = new StringBuffer();
				while ((s = br.readLine()) != null) {
					sb.append(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
