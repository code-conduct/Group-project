package configarationFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.maven.auto.autobean.Bean.Address;
import in.sp.maven.auto.autobean.Bean.Employee;
@Configuration
public class configar {
	@Bean(name="EMP101")
	public Employee emp() {
		Employee employee=new Employee();
		employee.setEmpid(101);
		employee.setEmpname("Jayanta");
		employee.setAddress(adder());
		
		return employee;
		
		
	}
	
	
	@Bean
	public Address adder() {
		Address add=new Address();
		add.setLocation("Indo-japan house");
		add.setStreet("Sector-V");
		add.setPin(70048);
		return add;
		
	}

}
