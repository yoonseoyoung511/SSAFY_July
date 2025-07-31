package Java_09_예외처리_2071_Lv2;

public interface IUserManager {
	
	void add(User user);
	
	User[] getList();
	
	User[] getUsers();
	
	VipUser[] getVipUsers();
	
	// 예외를 던진다고 선언
	User[] searchByName(String name) throws Exception;
	
	double getAgeAvg();
	
}
