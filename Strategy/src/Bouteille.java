
public class Bouteille {
	
	private String marque;
	
	private IStrategieOuverture strategieOuverture;
	
	public void ouvrir() {
		
		// Je délègue à un composant extérieur la responsabilité
		// de l'ouverture de la bouteille.
		strategieOuverture.ouvrir();
	}

	public Bouteille(IStrategieOuverture strategieOuverture) {
		super();
		this.strategieOuverture = strategieOuverture;
	}

	public IStrategieOuverture getStrategieOuverture() {
		return strategieOuverture;
	}

	public void setStrategieOuverture(IStrategieOuverture strategieOuverture) {
		this.strategieOuverture = strategieOuverture;
	}
	
}
