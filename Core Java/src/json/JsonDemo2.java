package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo2 {
	// 如果真的是实际开发，那么这些若干个学生的信息应该都是从数据库中查到的
	// 查到之后我应该那那些学生的数据映射成Java中的student对象
	// 为了方便管理这一组数据，我可以将这些student对象存放在数组或集合中
	public static void main(String[] args) throws JSONException {
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("result_code", 200);
		jsonObject.put("result_msg", "成功的返回");

		JSONArray  students=new JSONArray();
		for (int i = 0; i < 10; i++) {
			JSONObject jo = new JSONObject();
			jo.putOpt("name", "张三");
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
			
			//将每一个对象放进数组
			students.put(jo);
		}
		
		jsonObject.put("result", students);
		
		System.out.println(jsonObject.toString());
	}

}
