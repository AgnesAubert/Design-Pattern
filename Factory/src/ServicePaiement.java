
public class ServicePaiement {

	public void payerCommande(Commande commande, String choixClient) {
		
		MoyenPaiementFactory factory = new MoyenPaiementFactory(choixClient);

		IMoyenPaiement moyenPaiement = factory.getInstance();
		
		moyenPaiement.payer(commande.getPrixTTC());
	}
	
}
