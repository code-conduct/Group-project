package in.sp.maven.aop.aopPrograme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.services.BankTransaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/ApplicationContex.xml");
      
      BankTransaction bt=(BankTransaction) context.getBean("proxyId");
      
      bt.banktransctionUPI();
      System.out.println("     ");
      bt.banktransctionGooglePay();
      
    }
    
    
}
