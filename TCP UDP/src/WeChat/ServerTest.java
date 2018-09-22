package WeChat;

import java.io.IOException;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		try {
			Server server = new Server();
			server.startServer();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}

	}

}
