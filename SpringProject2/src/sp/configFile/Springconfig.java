package sp.configFile;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp.in.Beans.Student;

@Configuration
public class Springconfig {
	@Bean(name="su")
	public Student std() {
		Student st=new Student();
		st.setName("jatanta");
		st.setAddress("25/b pp road");
		st.setRoll(101);
		
		return st;
		
	}
	
	

}
