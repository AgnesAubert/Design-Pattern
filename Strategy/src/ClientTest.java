
public class ClientTest {

	public static void main(String[] args) {

		Bouteille contrex = new Bouteille(new StrategieOuvertureSimple());
		Bouteille vittel = new Bouteille(new StrategieOuvertureCapsule());
		
		contrex.ouvrir();
		vittel.ouvrir();
		
		contrex.setStrategieOuverture(new StrategieOuvertureCapsule());
		
		contrex.ouvrir();
		
	}

}
