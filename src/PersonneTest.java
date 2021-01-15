//4

import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDate;

public class PersonneTest {
	public static void main (String[] argd ) {
		Personne a = new Personne("Ahmed");
		try{
			Personne b = new Personne ("imane" , LocalDate.of(2020, Month.APRIL , 10));
		}catch (PersonneException e) {
			System.out.println(e.toString());
		}
	}
}
