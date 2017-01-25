package chap2.innerStaticClass;

import chap2.innerStaticClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAddress("addressValue");
		privateClass.setAge("ageValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());
	}

}
