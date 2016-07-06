
public class Bouteille {
	
	private String marque;

	public void ouvrir(ICommandeOuverture commandeOuverture) {
		
		commandeOuverture.executer();
		
	}
	
}
