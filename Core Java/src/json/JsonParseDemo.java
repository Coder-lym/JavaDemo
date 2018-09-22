package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParseDemo {
	static String data = "{\"score\":{\"yuwen\":100,\"shuxue\":150,\"lizong\":{\"huaxue\":99,\"wuli\":88}},\"phoneNumber\":[110,112],\"name\":\"����\",\"age\":\"20\"}";

	public static void main(String[] args) throws JSONException {

		JSONObject jObject = new JSONObject(data);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("������"+jObject.getString("name")+"\n");
		stringBuffer.append("���䣺"+jObject.getInt("age")+"\n");
		
		JSONArray jsonArray = jObject.getJSONArray("phoneNumber");
		for (int i = 0; i < jsonArray.length(); i++) {
			stringBuffer.append("�绰��"+jsonArray.getInt(i)+"\n");
		}
		
		JSONObject score = jObject.getJSONObject("score");
		stringBuffer.append("���ģ�"+score.getInt("yuwen")+"\n");
		stringBuffer.append("��ѧ��"+score.getInt("shuxue")+"\n");
		JSONObject lizong = score.getJSONObject("lizong");
		stringBuffer.append("����"+lizong.getInt("wuli")+"\n");
		stringBuffer.append("��ѧ��"+lizong.getInt("huaxue")+"\n");
		
		System.out.println(stringBuffer.toString());
		
	}

}
