package in.sp.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sp.in.Beans.Student;

public class Studentvalidate  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
	boolean B=	Student.class.equals(clazz);
	System.out.println("B===>"+B);
		return B;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student std=(Student)target;
		if(std.getAddress().equals(" ")||std.getAddress()==null)
		{
			errors.rejectValue("address", "key_address", "address requried and not be null");
		}
		if(std.getName().equals(" ") || std.getName().equals("null")) {
			
			errors.rejectValue("name", "key_name", "name is not valid");
		}
		if(std.getRoll()==0 || std.getRoll()<0) {
			errors.rejectValue("roll", "key_roll", "roll no cannot be 0");
			
		}
		if(std.getSubject().equals("")) {
			errors.rejectValue("subject", "key_subject", "sbject Filed not vaild requried data");
			
			
		}
	}

}
