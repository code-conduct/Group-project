package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import in.sp.studentbean.Students;
import in.sp.validator.validation;

public class MainClass {

	public static void main(String[] args) {
		String configpath="/in/sp/resource/applicationcontext.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(configpath);
		
	Students st= (Students)context.getBean("SD2");
	      DataBinder databind=new DataBinder(st);
	      databind.addValidators(new validation());
	      databind.validate();
	     
	      
	        List<ObjectError>list= databind.getBindingResult().getAllErrors();
	        System.out.println(list);
	        
		if(list.isEmpty()) {
			 st.display();
			
		}
		else {
			
			for(ObjectError error: list) {
				System.out.println(error.getDefaultMessage());
			}
		}
	}

}
