package in.vj.main;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoggingFrameWithoutRB {
	
	public LoggingFrameWithoutRB() 
	{
		JFrame jf = new JFrame();
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel jl_login_title = new  JLabel("Login Here");
		jl_login_title.setBounds(250, 50, 100, 30);
		jf.add(jl_login_title);
		
		JLabel jl_email_title = new JLabel("Enter Email");
		jl_email_title.setBounds(100,150,100,30);
		jf.add(jl_email_title);
		
		JTextField jt_email = new JTextField();
		jt_email.setBounds(100,180,300,40);
		jf.add(jt_email);
		
		
		JLabel jl_pass_title = new JLabel("Enter Password");
		jl_pass_title.setBounds(100,270,130,30);
		jf.add(jl_pass_title);
		
		JTextField jt_pass = new JTextField();
		jt_pass.setBounds(100,300,300,40);
		jf.add(jt_pass);
		
		
		JButton jb_login = new JButton("Login");
		jb_login.setBounds(200, 400, 100, 40);
		jf.add(jb_login);
		
		jf.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new LoggingFrameWithoutRB();

	}

}
