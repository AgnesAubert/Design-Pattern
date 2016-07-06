public class FacadeHumaine {

	private CorpsHumain corpsHumain;
	
	public void respirer(int quantite) {
		corpsHumain.respirer(quantite);
	}
	
	public void alimenter(String aliment) {
		
		corpsHumain.deglutir(aliment);
		corpsHumain.digerer(aliment);
		corpsHumain.defequer();
		
	}
	
}
