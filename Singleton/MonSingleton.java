public class MonSingleton {
	
	private static MonSingleton monInstanceUnique;
	
	private MonSingleton() {
		super();
	}
	
	public static MonSingleton getInstance() {
		
		if (monInstanceUnique == null)
			monInstanceUnique = new MonSingleton();
		
		return monInstanceUnique;
	}
	
}