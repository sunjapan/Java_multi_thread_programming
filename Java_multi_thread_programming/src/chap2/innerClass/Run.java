package chap2.innerClass;

import chap2.innerClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAddress("addressValue");
		privateClass.setAge("ageValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());
	}

}
