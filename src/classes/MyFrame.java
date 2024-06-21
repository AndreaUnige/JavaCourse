package classes;
import javax.swing.*;

import interfaces.ILogin;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class MyFrame extends JFrame {

  private JButton loginBtt  = new JButton("Login");
  private JButton exitBtt = new JButton("Exit");

  private JTextField inputTextUser = new JTextField(30);
  private JPasswordField inputPassword = new JPasswordField();
 
  private JLabel lblUser = new JLabel("User :");
  private JLabel lblPass = new JLabel("Pass :");
  
  private JLabel lblLoginOutcome = new JLabel("");

 
  private ILogin loginOutcome = null;

  public MyFrame(ILogin loginOutcome){
    this.loginOutcome = loginOutcome;
	  
	setTitle("Login GUI");
    setSize(800,400);
    setLocation(new Point(300,200));
    setLayout(null);    
    setResizable(false);

    initComponent();
    initEvent();    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public void close() {
	  System.exit(ABORT);
  }

  private void initComponent(){
    loginBtt.setBounds(500,130, 150,50);
    loginBtt.setFont(new Font("arial", Font.BOLD, 34));
//    loginBtt.setForeground(Color.blue);
//    loginBtt.setBackground(Color.red);
    
    exitBtt.setBounds(500,200, 150, 50);
    exitBtt.setFont(new Font("arial", Font.BOLD, 34));
//    exitBtt.setForeground(Color.blue);
//    exitBtt.setBackground(Color.red);
    
    
    lblUser.setBounds(20,10,130,40);
    lblUser.setFont(new Font("Serif", Font.BOLD, 34));
    
    inputTextUser.setBounds(150,10,150,40);
    inputTextUser.setFont(new Font("Serif", Font.BOLD, 34));
    
    lblPass.setBounds(20,70,130,40);
    lblPass.setFont(new Font("Serif", Font.BOLD, 34));
    inputPassword.setBounds(150,70,150,40);    
    inputPassword.setFont(new Font("Serif", Font.BOLD, 34));
    
    lblLoginOutcome.setBounds(20,150,400,30);
    lblLoginOutcome.setFont(new Font("Serif", Font.BOLD, 34));

    add(loginBtt);
    add(exitBtt);

    add(lblUser);
    add(lblPass);
    add(lblLoginOutcome);
    
   
    add(inputTextUser);
    add(inputPassword);
    
  }

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
    	  System.out.println("\n *** windowClosing *** \n");
    	  System.exit(1);
      }
    });

    exitBtt.addActionListener( (e) -> { System.exit(ABORT); });
    
    loginBtt.addActionListener( (e) -> {
    	String user = inputTextUser.getText().toString();
    	String pass = String.valueOf(inputPassword.getPassword());
    	
    	
    	if (isAuthorized(user, pass)) {
    		lblLoginOutcome.setForeground(Color.green);
    		lblLoginOutcome.setText("AUTHORIZED!");
    		this.loginOutcome.onLoginSuccesfull(true);
    	}
    	
    	else {
    		lblLoginOutcome.setForeground(Color.RED);
    		lblLoginOutcome.setText("NOT AUTHORIZED!");
    	}
    		
    });
  }

  
  private boolean isAuthorized(String user, String pass) {
	  boolean res = false;
	  try {
		res = Files.lines(Paths.get("users/users_passws.txt"))
			.map( singleUser -> singleUser.split(","))
			 .anyMatch(singleUserPassArray -> checkThisUser(singleUserPassArray, user, pass) );
	  } catch (IOException e) { e.printStackTrace();	}
	  return res;
  }
  
  
  private boolean checkThisUser(String[] user_pass, String user, String pass) {
	  String checkedUser = user_pass[0];
	  String checkedPass = user_pass[1];
	  
	  return (checkField(checkedUser, user) && checkField(checkedPass, pass));  
  }
  
  private boolean checkField(String fieldToCheck, String currentField) {
	  return fieldToCheck.equals(currentField);
  }
  

}
