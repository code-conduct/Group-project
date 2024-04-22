package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.ConfigFile.SpringConfigFile;
import in.sp.beans.Students;


public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		 Students std=  context.getBean(Students.class);
		 std.display();
		
	}

}
