
public class MonClientDistant {

	private static MonInterfaceDeService monComposantQuiSeComporteComme;
	
	public static void main(String[] arguments) {
		
		/*
		 * Je ne peux pas faire cela,
		 * car mon service est situé dans une autre application 
		 */
		// MonService monService = new MonService();
		// monService.creerBouteille();
		
		monComposantQuiSeComporteComme.creerBouteille();
	}

}
