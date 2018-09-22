package WeChat;

public class ClientTest {

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
