package Java_10_파일입출력;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId("user1");
		user1.setPassword("user1");
		user1.setName("김싸피");
		user1.setEmail("ssafy1@ssafy.com");
		user1.setAge(27);

		User user2 = new User("user2", "user2", "박싸피", "ssafy2@ssafy.com", 28);
		VipUser vuser = new VipUser("vip1", "vip1", "김싸피", "ssafy3@ssafy.com", 29, "Gold", 300);
		
	
		IUserManager um = UserManagerImpl.getInstance();
		
		
		um.add(user1);
		um.add(user2);
		um.add(vuser);
		um.saveData();
		 
		
		
		um.loadData();
		
		try {
			System.out.println(Arrays.toString(um.searchByName("황")));
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(um.getUsers()));
		System.out.println(um.getAgeAvg());


	}

}
