package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParseDemo {
	static String data = "{\"score\":{\"yuwen\":100,\"shuxue\":150,\"lizong\":{\"huaxue\":99,\"wuli\":88}},\"phoneNumber\":[110,112],\"name\":\"张三\",\"age\":\"20\"}";

	public static void main(String[] args) throws JSONException {

		JSONObject jObject = new JSONObject(data);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("姓名："+jObject.getString("name")+"\n");
		stringBuffer.append("年龄："+jObject.getInt("age")+"\n");
		
		JSONArray jsonArray = jObject.getJSONArray("phoneNumber");
		for (int i = 0; i < jsonArray.length(); i++) {
			stringBuffer.append("电话："+jsonArray.getInt(i)+"\n");
		}
		
		JSONObject score = jObject.getJSONObject("score");
		stringBuffer.append("语文："+score.getInt("yuwen")+"\n");
		stringBuffer.append("数学："+score.getInt("shuxue")+"\n");
		JSONObject lizong = score.getJSONObject("lizong");
		stringBuffer.append("物理："+lizong.getInt("wuli")+"\n");
		stringBuffer.append("化学："+lizong.getInt("huaxue")+"\n");
		
		System.out.println(stringBuffer.toString());
		
	}

}
