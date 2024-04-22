package in.sp.maven.Simplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.maven.Simplespring.Resource.configar;
import in.sp.maven.Simplespring.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contex= new AnnotationConfigApplicationContext(configar.class);
         Student st= contex.getBean("SID",Student.class);
         st.Display();
    }
}
