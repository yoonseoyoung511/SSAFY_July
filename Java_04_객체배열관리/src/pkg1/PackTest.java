package pkg1;

// *하면 아래가 더 명확해서 명확한게 쓰임
//import pkg1.pkg2.pkg3.*;
//import pkg1.pkg2.Pack;

// 두개 동시에 import는 불가능.
import pkg1.pkg2.pkg3.Pack;
//import pkg1.pkg2.Pack;

public class PackTest {
public static void main(String[] args) {
	pkg1.pkg2.Pack p = new pkg1.pkg2.Pack();
	System.out.println(p.pkg);
	
	Pack p2 = new Pack();
	System.out.println(p2.pkg); //import된 것 써짐
}
}
