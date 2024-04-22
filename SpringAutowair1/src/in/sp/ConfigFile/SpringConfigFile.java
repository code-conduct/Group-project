package in.sp.ConfigFile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Students;
import in.sp.beans.Subject;

@Configuration
public class SpringConfigFile {
	@Bean
public Students stu1()
{
	Students student=new Students();
	student.setAddress("25/b pp road");
	student.setName("jayanta");
	student.setRoll(111);
	student.setSubject(sub());
	return student;
	
}

	
	@Bean
	public Subject sub() {
		Subject su=new Subject();
		su.setSubname("JAVA");
		su.setSubNo(18);
		return su;
		
		
	}
	
	
	@Bean
	public Subject sub2() {
		Subject su=new Subject();
		su.setSubname("C++");
		su.setSubNo(17);
		return su;
		
		
	}
	

	
	
}
