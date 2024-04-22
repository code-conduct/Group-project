package logingProject;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class log {

	public static void main(String[] args) {
		try {
			System.out.println("hello world");
			FileHandler handler=new FileHandler("D:\\Error.log");
			SimpleFormatter formatter=new  SimpleFormatter();
			handler.setFormatter(formatter);
			//loger obeject creating here
			Logger logger=Logger.getLogger("log");
			logger.addHandler(handler);
			logger.log(Level.SEVERE, "this is very very importent message");
			logger.log(Level.WARNING, "Server will be shutdown now");
		
			logger.log(Level.INFO, "Please wait For some time");
			
			System.out.println("Hello Bantu");
			
		} catch (Exception e) {
			System.out.println("Error Print");
		}
	}

}
