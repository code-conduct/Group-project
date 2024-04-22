package in.sp.maven.Simplespring.Resource;

import org.springframework.context.annotation.Bean;

import in.sp.maven.Simplespring.bean.Student;

public class configar {
	@Bean(name ="SID")
	public Student std() {
		Student student =new Student();
		student.setAddress("25/b padmapukur road ");
		student.setName("JAYANTA MAITY");
		student.setRoll(11);
		return student;
		
		
	}
	

}
