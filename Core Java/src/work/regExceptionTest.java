package work;

public class regExceptionTest {

	static String[] dbStrings = {"John","Andy","Tom"};
	
	public static void regName(String name) throws regException {
		for (String dbName : dbStrings) {
			if (name.equals(dbName)) {
				throw new regException(name+"�û����Ѵ��ڣ�");
			}
		}
		System.out.println("ע��ɹ���");
	}
	
	public static void main(String[] args) {
		try {
			regName("Tom");
		} catch (regException e) {
			// TODO �Զ����ɵ� catch ��
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