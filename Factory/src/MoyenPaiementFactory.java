
public class MoyenPaiementFactory {

	private String choixClient;
	
	public MoyenPaiementFactory(String choixClient) {
		super();
		this.choixClient = choixClient;
	}
	
	public IMoyenPaiement getInstance() {

		IMoyenPaiement moyenPaiement = null;
		
		if (choixClient.equals("CB"))
			moyenPaiement = new MoyenPaiementParCb();
		else if (choixClient.equals("PAYPAL"))
			moyenPaiement = new MoyenPaiementParPaypal();
		
		return moyenPaiement;
	}
	
}
