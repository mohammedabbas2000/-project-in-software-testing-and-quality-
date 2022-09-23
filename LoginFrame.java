package hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    LoginFrame() {
    	setTitle("Login Form");
        setVisible(true);
        setBounds(500,200, 370, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
        container.setBackground(new Color(40,140,255));
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 50, 100, 30);
        passwordLabel.setBounds(50, 120, 100, 30);
        userTextField.setBounds(150, 50, 150, 30);
        passwordField.setBounds(150, 120, 150, 30);
        showPassword.setBounds(150, 150, 150, 30);
        showPassword.setBackground(new Color(40,140,255));
        loginButton.setBounds(50, 200, 100, 30);
        resetButton.setBounds(200, 200, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            int count=0,count1=0;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if((userText.length()>=6 && userText.length()<=8) && (pwdText.length()>=8 && pwdText.length()<=10)) {
            	for(int j=0; j< pwdText.length(); j++) {
            		 if (Character.isAlphabetic(pwdText.charAt(j)))
              		   count1++;
            	}
            	for (int i = 0; i < userText.length(); i++) {
            		   if (Character.isDigit(userText.charAt(i)))
            		   count++;
            		}
            	
            	if(count>=3 || count1>=2) {
            		JOptionPane.showMessageDialog(this, "username have number bigger than 2 or password have letter bigger than 1");
            	}else {
            		if ((userText.equalsIgnoreCase("mohammed") && pwdText.equalsIgnoreCase("123456m!")) || (userText.equalsIgnoreCase("bhaa12") && pwdText.equalsIgnoreCase("654321a@"))) {
            			mainFrame mainFrame = new mainFrame();
            		}
            		else 
            			JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            	}
            	
            }else {
            	JOptionPane.showMessageDialog(this, "username must have 6-8 letter or password must have 8-10 letter ");
            }

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }
    public static void main(String[] a) throws Exception {
        LoginFrame frame = new LoginFrame();
     }

}

