package localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame {
	
	LoginFrame(String login_title, String email_title, String passwor_title , String button_title){
		JFrame jf=new JFrame();
		jf.setSize(600,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		JLabel jl_login_title=new JLabel(login_title);
		jl_login_title.setBounds(250, 50, 100, 30);
		jf.add(jl_login_title);
		 
		
		JLabel jl_email_title=new JLabel(email_title);
		jl_email_title.setBounds(80, 120, 100, 20);
		jf.add(jl_email_title);
		 
		JTextField jl_email=new JTextField();
		jl_email.setBounds(80, 148, 180, 20);
		jf.add(jl_email);
		
		JLabel jl_password_title=new JLabel(passwor_title);
		jl_password_title.setBounds(80, 220, 100, 20);
		jf.add(jl_password_title);
		 
		JTextField jl_password=new JTextField();
		jl_password.setBounds(80, 240, 180, 20);
		jf.add(jl_password);
		
		
		JButton button=new JButton(button_title);
		button.setBounds(200, 300, 100, 30);
		jf.add(button);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose any one option From Below :-");
		System.out.println("1. English-us");
		System.out.println("2. Bengali-India");
		System.out.println("----------------------------------");
		int number = sc.nextInt();
		
		switch(number)
		{
		case 1:
			Locale locale=new Locale("ben","IN");
			ResourceBundle resourcebundle= ResourceBundle.getBundle("in/sp/resources/MessageBundle", locale);
		String jl_login_title=	resourcebundle.getString("jl_login_title");
		String jl_email_title=	resourcebundle.getString("jl_email_title");
		String jl_password_title=	resourcebundle.getString("jl_password_title");
		String button=	resourcebundle.getString("button");
			
		new  LoginFrame(jl_login_title, jl_email_title, jl_password_title, button);
		}
	
		
	}

}
