//3

import java.time.LocalDate;


public class Personne {
	
	private String nom ;
	private LocalDate dateNaissance;
	public Personne (String nomP ){
		nom =nomP;
	}
	public Personne(String nomP , LocalDate dateP) throws PersonneException {
		if (dateP.isAfter(LocalDate.now())){
			throw new  PersonneException ();
		}else{
			nom =nomP;
			dateNaissance=dateP;
			
	}
	}
}
