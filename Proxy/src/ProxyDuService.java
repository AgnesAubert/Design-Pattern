import sun.net.www.http.HttpClient;

public class ProxyDuService implements MonInterfaceDeService {

	@Override
	public void creerBouteille() {
		
		// Appeler le MonService distant.
		HttpClient.New(new Url("http://monServiceDistant/creerBouteille"));
	}

}
