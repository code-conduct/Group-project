package in.sp.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;

public class LoginAspect implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("---------loging service apply----------->");
		
		System.out.println("---------Securaty service apply----------->");
	}
	
	
	

}
