package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) throws JSONException {
		JSONObject jo = new JSONObject();
		jo.putOpt("name", "ÕÅÈý");
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
		
		System.out.println(jo.toString());
		
	}

}
