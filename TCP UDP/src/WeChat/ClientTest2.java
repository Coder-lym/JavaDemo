package WeChat;

public class ClientTest2 {

	public static void main(String[] args) throws Exception {
		try {
			Client client = new Client();
			client.startClient();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}

	}

}
