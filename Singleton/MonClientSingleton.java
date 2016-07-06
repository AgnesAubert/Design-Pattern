public class MonClientSingleton {

	public static void main(String[] arguments) {
		
		// Impossible, le constructeur est privé
		// MonSingleton monSingleton = new MonSingleton();
		
		MonSingleton monSingleton = MonSingleton.getInstance();
		
	}


}