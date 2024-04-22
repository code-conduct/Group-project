package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import sp.configFile.Springconfig;
import sp.in.Beans.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Springconfig.class);
		
		Student std=(Student) context.getBean(Student.class);
		std.display();

	}

}
