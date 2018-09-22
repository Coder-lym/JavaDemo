package work;

import java.util.Comparator;
import java.util.TreeSet;

public class ExamTest1 {

	public static void main(String[] args) {

//		TreeSet<goods> treeSet = new TreeSet<>();
//		treeSet.add(new goods("D001", "X1", "a", 1, 3));
//		treeSet.add(new goods("D002", "X2", "b", 2, 4));
//		treeSet.add(new goods("D003", "X3", "c", 3, 5));
//		treeSet.add(new goods("D004", "X4", "c", 4, 5));
//		treeSet.add(new goods("D005", "X5", "c", 5, 6));
//		treeSet.add(new goods("D006", "X5", "c", 5, 6));
//		treeSet.add(new goods("D007", "X7", "d", 5, 7));
//		treeSet.add(new goods("D008", "X8", "e", 6, 8));
//		treeSet.add(new goods("D009", "X9", "e", 6, 8));
//
//		System.out.println("第一个集合内容：\n"+treeSet);
		
		TreeSet<goods> treeSet = new TreeSet<goods>(new Comparator<goods>() {
			@Override
			public int compare(goods o1, goods o2) {
				int result = 0;
				if (o1.getCount() == o2.getCount()) {
					result = 1;
				} else {
                    result = -(o1.getCount()-o2.getCount());
				}
				return result;
			}
		});
		treeSet.add(new goods("D001", "X1", "a", 1, 3));
		treeSet.add(new goods("D002", "X2", "b", 2, 4));
		treeSet.add(new goods("D003", "X3", "c", 3, 5));
		treeSet.add(new goods("D004", "X4", "c", 4, 5));
		treeSet.add(new goods("D005", "X5", "c", 5, 6));
		treeSet.add(new goods("D006", "X5", "c", 5, 6));
		treeSet.add(new goods("D007", "X7", "d", 5, 7));
		treeSet.add(new goods("D008", "X8", "e", 6, 8));
		treeSet.add(new goods("D009", "X9", "e", 6, 8));
		
		System.out.println("第二个集合内容：\n"+treeSet);
	}

}

class goods implements Comparable<goods>{

	private String id;
	private String name;
	private String type;
	private int price;
	private int count;

	/**
	 * @param id 商品编号
	 * @param name 商品名
	 * @param type 商品类型
	 * @param price 商品价格
	 * @param count 商品销量
	 */
	public goods(String id, String name, String type, int price, int count) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", count=" + count+ "]\n";
	}

	@Override
	public int compareTo(goods o) {
		int result = 0;
		if (this.type.equals(o.type)) {
			if (this.count == o.count) {
				if (this.price == o.price) {
					result = 1;
				} else {
					result = this.price - o.price;
				}
			} else {
				result = -(this.count - o.count);
			}
		} else {
			result = -this.type.compareTo(o.type);
		}
		return result;
	}

}