package in.sp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.sp.studentbean.Students;

public class validation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		 Boolean b= Students.class.equals(clazz);
		 System.out.println("b====>"+b);
		 
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		   Students student =(Students)target;
		   
		   if(student.getName().equals("") || student.getName().equals("null")) {
			   
			   errors.rejectValue("name", "key_name", "name file not validate");
			   
			   
		   }
		       if(student.getPhone().length()!=10 ) {
		    	   errors.rejectValue("phone", "key_phone", "phone number must be 10 digit");
		    	   
		    	   
		       }
		       if(student.getRoll()==0 || student.getRoll()<0 ) {
		    	   errors.rejectValue("roll", "key_roll", "roll no. not validate");
		    	   
		       }
		   
	}

}
