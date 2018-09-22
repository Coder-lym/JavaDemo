package work;

public class regExceptionTest {

	static String[] dbStrings = {"John","Andy","Tom"};
	
	public static void regName(String name) throws regException {
		for (String dbName : dbStrings) {
			if (name.equals(dbName)) {
				throw new regException(name+"用户名已存在！");
			}
		}
		System.out.println("注册成功！");
	}
	
	public static void main(String[] args) {
		try {
			regName("Tom");
		} catch (regException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
}

class regException extends Exception{
	private static final long serialVersionUID = 1L;

	public regException() {
		super();
	}

	public regException(String e) {
		super(e);
	}
	
}