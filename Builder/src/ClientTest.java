import java.util.Date;

public class ClientTest {

	public static void main(String[] args) {
		
		Personne personne = new PersonneBuilder()
			.parametrerAge(new Date("15/11/86"))
			.parametrerNom("CoinCoin")
			.parametrerPrenom("Robert")
			.build();
		
	}

}
