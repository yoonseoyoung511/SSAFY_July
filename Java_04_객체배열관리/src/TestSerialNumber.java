
public class TestSerialNumber {
public static void main(String[] args) {
	Product p1 = new Product();
	Product p2 = new Product();
	Product p3 = new Product();
	Product p4 = new Product();
	Product p5 = new Product();
	
	System.out.println();
}
}
class Product {
	static int num = 1;
	int sn;
	
	public Product() {
		sn = num;
		num++;
	}
	public Product(int sn) {
		this.sn = sn;
	}
	public String toString() {
		return "[sn=" + sn + "]";
	}
	
	
	
}
