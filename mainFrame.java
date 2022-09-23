package hospital;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mainFrame extends JFrame implements ActionListener{
	private Container c;
	private JLabel title;
	JPanel jPanel = new JPanel();
	JLabel jLabel = new JLabel();
	JPanel panel = new JPanel();
	JButton addpatientButton,treatmentsButton; 
	
	
	
	public mainFrame()  {
		setTitle("Hospital");
		setBounds(300, 90, 900, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		title = new JLabel("Hospital");
		title.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		title.setSize(300, 30);
		title.setLocation(380, 30);
		c.add(title);
		
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 600);
		c.add(panel);
		panel.setLayout(null);
		
		
		ImageIcon LoginIcon = new ImageIcon("C:\\Users\\MOHAMMED\\Desktop\\Hospital\\2.jpg");
		JLabel lbIcon = new JLabel(LoginIcon);
		lbIcon.setBounds(0, 0, 450, 550);
		panel.add(lbIcon);
	   
		addpatientButton = new JButton("Add Patient");
		addpatientButton.setForeground(Color.WHITE);
		addpatientButton.setFont(new Font("Calibri", Font.BOLD, 30));
		addpatientButton.setBorder(null);
		addpatientButton.setBackground(new Color(40,140,255));
		addpatientButton.setSize(300,100);
		addpatientButton.setLocation(500, 100);
		addpatientButton.addActionListener(this);
		c.add(addpatientButton);
		
		
		treatmentsButton = new JButton("Treatments List");
		treatmentsButton.setForeground(Color.WHITE);
		treatmentsButton.setFont(new Font("Calibri", Font.BOLD, 30));
		treatmentsButton.setBorder(null);
		treatmentsButton.setBackground(new Color(40,140,255));
		treatmentsButton.setSize(300,100);
		treatmentsButton.setLocation(500, 250);
		treatmentsButton.addActionListener(this);
		c.add(treatmentsButton);
		
		
		
		
		
		setVisible(true);

	}
	
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addpatientButton) {
			PatientFrame patientFrame = new PatientFrame();
		}else if(e.getSource() == treatmentsButton) {
			treatmentTable treatmentTable = new treatmentTable();
		}
		
	}
}
