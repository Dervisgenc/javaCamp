package odev3;

public class UserManager {
	Logger logger;
	public UserManager(Logger logger) {
		this.logger=logger;
	}
	public void editProfile(User user) {
		System.out.println("Profile D�zenle");
		this.logger.log("Logland�");
	}
	public void signOut() {
		System.out.println("��k�� yap");
	}
}
