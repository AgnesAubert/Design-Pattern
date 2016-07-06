import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Date;

public class PersonneBuilder {
	
	private String nom;
	
	private String prenom;
	
	private Date date;
	
	public PersonneBuilder() {
		super();
	}
	
	public PersonneBuilder parametrerNom(String nom) {
		this.nom = nom;
		return this;
	}
	
	public PersonneBuilder parametrerPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	
	public PersonneBuilder parametrerAge(Date date) {
		this.date = date;
		return this;
	}
	
	public Personne build() {
		
		Personne personne = new Personne();
		
		personne.setNom(nom);
		personne.setPrenom(prenom);
		
		// Algorithme complexe de calcul de l'age.
		int age = Instant.now().get(ChronoField.YEAR) -
				date.toInstant().get(ChronoField.YEAR);
		
		personne.setAge(age);
		
		return personne;
	}

}
