package international;

import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		  String contry[]=  Locale.getISOCountries();
		  
		  for(String concode:contry) {
			  
			  Locale locale=new Locale("", concode);
			  System.out.println(concode+"--->"+locale.getDisplayCountry());
		  }
	}

}
