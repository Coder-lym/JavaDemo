package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo2 {
	// ��������ʵ�ʿ�������ô��Щ���ɸ�ѧ������ϢӦ�ö��Ǵ����ݿ��в鵽��
	// �鵽֮����Ӧ������Щѧ��������ӳ���Java�е�student����
	// Ϊ�˷��������һ�����ݣ��ҿ��Խ���Щstudent������������򼯺���
	public static void main(String[] args) throws JSONException {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("result_code", 200);
		jsonObject.put("result_msg", "�ɹ��ķ���");

		JSONArray  students=new JSONArray();
		for (int i = 0; i < 10; i++) {
			JSONObject jo = new JSONObject();
			jo.putOpt("name", "����");
			jo.putOpt("age", "20");

			JSONArray phoneNumbers = new JSONArray();
			phoneNumbers.put(110);
			phoneNumbers.put(112);
			jo.put("phoneNumber", phoneNumbers);
			
			JSONObject score = new JSONObject();
			score.put("yuwen", 100);
			score.put("shuxue", 150);
			
			JSONObject lizong = new JSONObject();
			lizong.put("wuli", 88);
			lizong.put("huaxue", 99);
			
			score.put("lizong", lizong);
			jo.put("score", score);
			
			//��ÿһ������Ž�����
			students.put(jo);
		}
		
		jsonObject.put("result", students);
		
		System.out.println(jsonObject.toString());
	}

}
