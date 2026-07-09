package in.vj.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoggingFrame {
	
	public LoggingFrame(String main_title, String email_title, String pass_title,String btn_title) 
	{
		JFrame jf = new JFrame();
		jf.setSize(600,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel jl_login_title = new  JLabel(main_title);
		jl_login_title.setBounds(250, 50, 100, 30);
		jf.add(jl_login_title);
		
		JLabel jl_email_title = new JLabel(email_title);
		jl_email_title.setBounds(100,150,100,30);
		jf.add(jl_email_title);
		
		JTextField jt_email = new JTextField();
		jt_email.setBounds(100,180,300,40);
		jf.add(jt_email);
		
		
		JLabel jl_pass_title = new JLabel(pass_title);
		jl_pass_title.setBounds(100,270,130,30);
		jf.add(jl_pass_title);
		
		JTextField jt_pass = new JTextField();
		jt_pass.setBounds(100,300,300,40);
		jf.add(jt_pass);
		
		
		JButton jb_login = new JButton(btn_title);
		jb_login.setBounds(200, 400, 100, 40);
		jf.add(jb_login);
		
		jf.setVisible(true);
	}

}
