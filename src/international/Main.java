package international;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
        Locale local= Locale.getDefault();
          System.out.println(local);
          System.out.println("Country Name"+local.getDisplayCountry());
          System.out.println("Country langauge "+local.getDisplayLanguage(local));
	
	System.out.println("----------------------------------------------------------");
	
	Locale loc2= new Locale("fr", "FR");
	   
	System.out.println(loc2);
    System.out.println("Country Name"+loc2.getDisplayCountry());
    System.out.println("Country langauge "+loc2.getDisplayLanguage(local));
	System.out.println("hello Jayanta -------------->");
	
	}

	
}
