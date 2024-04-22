package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import in.sp.validate.Studentvalidate;
import sp.in.Beans.Student;

public class MainClass {

	public static void main(String[] args) {
		String configLocation="/sp/in/config/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(configLocation);
		
		  // Student st=(Student) context.getBean();
		     Student st=context.getBean(Student.class);
		   
		   DataBinder databinder=new DataBinder(st);
		   databinder.addValidators(new Studentvalidate());
		   databinder.validate();
		   
		List<ObjectError> list=  databinder.getBindingResult().getAllErrors();
		  if(list.isEmpty()) {
			  st.display();
			  
			  
		  }
		  else {
			  for(ObjectError er:list)
			  
			  System.err.println(er.getDefaultMessage());
		  }
		   

	}

}
