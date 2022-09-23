package hospital;

//Java program to implement
//a Simple Registration Form
//using Java Swing

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.ArrayList;

class PatientFrame extends JFrame implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JLabel Age;
	private JTextField tAge;
	private JTextArea tadd;
	private JButton sub;
	private JButton reset;
	private JButton backButton;
	private JLabel res;
	private JLabel WBC,Neut,Lymph,RBC,HCT,Urea,HB,Krtian,Iron,HDL,Alkaline;
	private JTextField tWBC,tNeut,tLymph,tRBC,tHCT,tUrea,tHB,tKrtian,tIron,tHDL,tAlkaline;
	private ArrayList<Double> attachArrayList = new ArrayList<Double>(); 
	private JCheckBox q1,q2,q3,q4;
	private String Gender;

	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019","2020","2021" };

	// constructor, to initialize the components
	// with default values.
	public PatientFrame()
	{
		setTitle("Patient details");
		setBounds(300, 90, 900, 600);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(40,140,255));
		
		
		title = new JLabel("Patient details");
		title.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(200, 150);
		c.add(tmno);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setBackground(new Color(40,140,255));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setBackground(new Color(40,140,255));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		c.add(year);
		

		Age = new JLabel("Age");
		Age.setFont(new Font("Arial", Font.PLAIN, 20));
		Age.setSize(170, 25);
		Age.setLocation(100, 300);
		c.add(Age);
		
		tAge = new JTextField();
		tAge.setFont(new Font("Arial", Font.PLAIN, 15));
		tAge.setSize(150, 20);
		tAge.setLocation(200, 300);
		c.add(tAge);
		
		
		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 350);
		c.add(add);
		
		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 350);
		tadd.setLineWrap(true);
		c.add(tadd);
		

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);
		
		backButton = new JButton("Back");
		backButton.setFont(new Font("Arial", Font.PLAIN, 10));
		backButton.setSize(67,20);
		backButton.setLocation(820, 0);
		backButton.addActionListener(this);
		c.add(backButton);

		
		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);
		
		
		WBC = new JLabel("WBC");
		WBC.setFont(new Font("Arial", Font.PLAIN, 20));
		WBC.setSize(80, 20);
		WBC.setLocation(450, 100);
		c.add(WBC);

		tWBC = new JTextField();
		tWBC.setFont(new Font("Arial", Font.PLAIN, 15));
		tWBC.setSize(80, 20);
		tWBC.setLocation(510, 100);
		c.add(tWBC);
		
		
		Neut = new JLabel("Neut");
		Neut.setFont(new Font("Arial", Font.PLAIN, 20));
		Neut.setSize(80, 20);
		Neut.setLocation(450, 125);
		c.add(Neut);

		tNeut = new JTextField();
		tNeut.setFont(new Font("Arial", Font.PLAIN, 15));
		tNeut.setSize(80, 20);
		tNeut.setLocation(510, 125);
		c.add(tNeut);
		
		
		Lymph = new JLabel("Lymph");
		Lymph.setFont(new Font("Arial", Font.PLAIN, 20));
		Lymph.setSize(80, 20);
		Lymph.setLocation(450, 150);
		c.add(Lymph);

		tLymph = new JTextField();
		tLymph.setFont(new Font("Arial", Font.PLAIN, 15));
		tLymph.setSize(80, 20);
		tLymph.setLocation(510, 150);
		c.add(tLymph);
		
		
		RBC = new JLabel("RBC");
		RBC.setFont(new Font("Arial", Font.PLAIN, 20));
		RBC.setSize(80, 20);
		RBC.setLocation(450, 175);
		c.add(RBC);

		tRBC = new JTextField();
		tRBC.setFont(new Font("Arial", Font.PLAIN, 15));
		tRBC.setSize(80, 20);
		tRBC.setLocation(510, 175);
		c.add(tRBC);
		
		
		HCT = new JLabel("HCT");
		HCT.setFont(new Font("Arial", Font.PLAIN, 20));
		HCT.setSize(80, 20);
		HCT.setLocation(450, 200);
		c.add(HCT);

		tHCT = new JTextField();
		tHCT.setFont(new Font("Arial", Font.PLAIN, 15));
		tHCT.setSize(80, 20);
		tHCT.setLocation(510, 200);
		c.add(tHCT);
		
		
		Urea = new JLabel("Urea");
		Urea.setFont(new Font("Arial", Font.PLAIN, 20));
		Urea.setSize(80, 20);
		Urea.setLocation(450, 225);
		c.add(Urea);

		tUrea = new JTextField();
		tUrea.setFont(new Font("Arial", Font.PLAIN, 15));
		tUrea.setSize(80, 20);
		tUrea.setLocation(510, 225);
		c.add(tUrea);
		
		
		HB = new JLabel("HB");
		HB.setFont(new Font("Arial", Font.PLAIN, 20));
		HB.setSize(80, 20);
		HB.setLocation(450, 250);
		c.add(HB);

		tHB = new JTextField();
		tHB.setFont(new Font("Arial", Font.PLAIN, 15));
		tHB.setSize(80, 20);
		tHB.setLocation(510, 250);
		c.add(tHB);
		
		
		Krtian = new JLabel("Krtian");
		Krtian.setFont(new Font("Arial", Font.PLAIN, 20));
		Krtian.setSize(80, 20);
		Krtian.setLocation(450, 275);
		c.add(Krtian);

		tKrtian = new JTextField();
		tKrtian.setFont(new Font("Arial", Font.PLAIN, 15));
		tKrtian.setSize(80, 20);
		tKrtian.setLocation(510, 275);
		c.add(tKrtian);
		
		
		Iron = new JLabel("Iron");
		Iron.setFont(new Font("Arial", Font.PLAIN, 20));
		Iron.setSize(80, 20);
		Iron.setLocation(450, 300);
		c.add(Iron);

		tIron = new JTextField();
		tIron.setFont(new Font("Arial", Font.PLAIN, 15));
		tIron.setSize(80, 20);
		tIron.setLocation(510, 300);
		c.add(tIron);
		
		
		HDL = new JLabel("HDL");
		HDL.setFont(new Font("Arial", Font.PLAIN, 20));
		HDL.setSize(80, 20);
		HDL.setLocation(450, 325);
		c.add(HDL);

		tHDL = new JTextField();
		tHDL.setFont(new Font("Arial", Font.PLAIN, 15));
		tHDL.setSize(80, 20);
		tHDL.setLocation(510, 325);
		c.add(tHDL);
		
		
		Alkaline = new JLabel("Alkaline");
		Alkaline.setFont(new Font("Arial", Font.PLAIN, 20));
		Alkaline.setSize(80, 20);
		Alkaline.setLocation(450, 350);
		c.add(Alkaline);

		tAlkaline = new JTextField();
		tAlkaline.setFont(new Font("Arial", Font.PLAIN, 15));
		tAlkaline.setSize(80, 20);
		tAlkaline.setLocation(520, 350);
		c.add(tAlkaline);
		
		
		
		q1 = new JCheckBox("Are you smoking?");
        q1.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        q1.setBackground(new Color(40,140,255));
        q1.setSize(250, 20);
        q1.setLocation(650, 100);
        c.add(q1);
        
        
        q2 = new JCheckBox("Are you pregnant?");
        q2.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        q2.setBackground(new Color(40,140,255));
        q2.setSize(250, 20);
        q2.setLocation(650, 125);
        c.add(q2);
        
        
        q3 = new JCheckBox("Are you Ethiopian?");
        q3.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        q3.setBackground(new Color(40,140,255));
        q3.setSize(250, 20);
        q3.setLocation(650, 150);
        c.add(q3);
        
        
        q4 = new JCheckBox("Are you Easterners?");
        q4.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        q4.setBackground(new Color(40,140,255));
        q4.setSize(250, 20);
        q4.setLocation(650, 175);
        c.add(q4);
		
       
        
		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (true) {
				chek_the_age();
				print();
			}
		}

		else if (e.getSource() == reset) {
			
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			
		}
		else if (e.getSource() == backButton) {
			setVisible(false);
			mainFrame frame =new mainFrame();
			
		}
	}
	public void save_in_file(String name,String d,String d1,String d2,String d3, String d4) {
		 try {  
				 
			     FileWriter myWriter = new FileWriter("C:\\Users\\MOHAMMED\\Desktop\\Hospital\\Patient\\"+name+".txt");
			     myWriter.write(d+d1+d2+d3+d4);
			     myWriter.close();
			    }catch (IOException e) {
			     System.out.println("An error occurred.");
			     e.printStackTrace();
			    } 
		}

	public ArrayList<Double> getAttachArrayList() {
		return attachArrayList;
	}

	public void setAttachArrayList(ArrayList<Double> attachArrayList) {
		this.attachArrayList = attachArrayList;
	}

	public String getGender() {
		return Gender;
	}
	public boolean isEthiopian() {
		  if (q3.isSelected()) 
			  return true;
		  return false;
		  
	}
	public boolean isEasterners() {
		  if (q4.isSelected()) 
			  return true;
		  return false;
		  
	}
	public void adding_to_array() {
		attachArrayList.add(Double.valueOf(tAge.getText()));
		attachArrayList.add(Double.valueOf(tWBC.getText()));
		attachArrayList.add(Double.valueOf(tNeut.getText()));
		attachArrayList.add(Double.valueOf(tLymph.getText()));
		attachArrayList.add(Double.valueOf(tRBC.getText()));
		attachArrayList.add(Double.valueOf(tHCT.getText()));
		attachArrayList.add(Double.valueOf(tUrea.getText()));
		attachArrayList.add(Double.valueOf(tHB.getText()));
		attachArrayList.add(Double.valueOf(tKrtian.getText()));
		attachArrayList.add(Double.valueOf(tIron.getText()));
		attachArrayList.add(Double.valueOf(tHDL.getText()));
		attachArrayList.add(Double.valueOf(tAlkaline.getText()));
	}

	public void print() {
		String data1;
		String data
			= "Name : "
			+ tname.getText() + "\n"
			+ "Mobile : "
			+ tmno.getText() + "\n" + "Age : "+ tAge.getText() + "\n";
		if (male.isSelected()) {
			Gender="male";
			data1 = "Gender : Male"
				+ "\n";
		}
		else {
			Gender="female";
			data1 = "Gender : Female"
					+ "\n";
		}
		String data2
			= "DOB : "
			+ (String)date.getSelectedItem()
			+ "/" + (String)month.getSelectedItem()
			+ "/" + (String)year.getSelectedItem()
			+ "\n";

		String data3 = "Address : " + tadd.getText(); 
		
		if(tAge.getText().isEmpty()||tWBC.getText().isEmpty()||tNeut.getText().isEmpty()||tLymph.getText().isEmpty()||
				tRBC.getText().isEmpty()||tHCT.getText().isEmpty()||tUrea.getText().isEmpty()||tHB.getText().isEmpty()||tKrtian.getText().isEmpty()
				||tIron.getText().isEmpty()||tHDL.getText().isEmpty()||tAlkaline.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please fill all the text");
		}else {
			adding_to_array();
			JOptionPane.showMessageDialog(this, "Addtion Successful");
			InformationFrame hFrame = new InformationFrame(this);
			String data4="\n"+"Recommended treatment :"+"\n" + hFrame.Gettext();
			save_in_file(tname.getText(), data, data1, data2, data3,data4);
		}
	}
	public void chek_the_age() {
		int count1=0;
		if(tAge.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "plesae fill all the texts");
		}else{
			for(int j=0; j< tAge.getText().length(); j++) {
       		 if (Character.isAlphabetic(tAge.getText().charAt(j)))
         		   count1++;
			} 
			if(count1!=0) {
				JOptionPane.showMessageDialog(this, "age text must be have numbers value");
			}else if(Double.valueOf(tAge.getText()) < 0) {
				JOptionPane.showMessageDialog(this, "age text must be positive");
			}
		}
	
	}
	
}


