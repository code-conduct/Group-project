package in.sp.maven.auto.autobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configarationFile.configar;
import in.sp.maven.auto.autobean.Bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contex=new AnnotationConfigApplicationContext(configar.class);
           Employee emp= contex.getBean("EMP101",Employee.class);
           emp.Display();
    }
}
