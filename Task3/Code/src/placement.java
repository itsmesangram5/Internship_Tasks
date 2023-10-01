import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class placement extends JFrame implements ActionListener {
	static JFrame login,f,f1,f2,f3,f4,f5,f6,  f7;
    static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,  s13,s14,s16;
    static int a1,a2,a3,a4,a5;
    static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,  t16,t17,t18;
    static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28  ,l29,l30,l31,l32,l33;
    static JTextArea p1,p2,p3  ,p4;
    static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29  ,b30,b31,b32,b33,b34;
	@SuppressWarnings("deprecation")
	static int ssn=1;
	placement(){
		
		/*_____________________________Login Frame__________________________*/
		login=new JFrame();
		login.setLayout(null);
		//login.setForeground(Color.black);
		//login.setUndecorated(true);
	    Container c=login.getContentPane();
		c.setBackground(Color.gray);
		login.setVisible(true);
		//login.setVisible(false);
		login.setBounds(0, 0,1920, 1080);
		
		l1=new JLabel("Welcome to DYPIEMR ");
		l1.setFont(l1.getFont().deriveFont(50.85632412f));
		l1.setBounds(650, 200, 700, 60);
		login.add(l1);
		
		l2=new JLabel("Login To Continue");
		l2.setFont(l2.getFont().deriveFont(30.85632412f));
		l2.setBounds(780, 350, 350, 40);
		login.add(l2);
		
		l3=new JLabel("Admin ID");
		l3.setFont(l3.getFont().deriveFont(20.85632412f));
		l3.setBounds(700, 420, 150, 30);
		login.add(l3);
		
		l4=new JLabel("Password");
		l4.setFont(l3.getFont().deriveFont(20.85632412f));
		l4.setBounds(700, 470, 150, 30);
		login.add(l4);
		
		l5=new JLabel("Wrong Id or Password");
		l5.setFont(l5.getFont().deriveFont(15.85632412f));
		l5.setBounds(1130, 470, 200, 20);
		l5.setForeground(Color.RED);
		l5.setVisible(false);
		login.add(l5);
		
		Border border = BorderFactory.createLineBorder(Color.darkGray, 2);
		t1=new JTextField();
		t1.setBounds(860,420,250,30);
		t1.setFont(t1.getFont().deriveFont(15.85632412f));
		t1.setVisible(true);
		t1.setBorder(border);
		login.add(t1);
		
		t2=new JTextField();
		t2.setBounds(860,470,250,30);
		t2.setFont(t2.getFont().deriveFont(15.85632412f));
		t2.setVisible(true);
		t2.setBorder(border);
		login.add(t2);
		
		Border border1 = BorderFactory.createLineBorder(Color.white, 2);
		b1=new JButton("Login");
		b1.setBounds(860,520,100,40);
		b1.enable();
		b1.addActionListener(this);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.white);
		b1.setBorder(border1);
		b1.setVisible(true);
		login.add(b1);
		
		b2=new JButton("Exit");
		b2.setBounds(970,520,100,40);
		b2.enable();
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBorder(border1);
		b2.setVisible(true);
		login.add(b2);
		
		/*Image imgs=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Pictures\\New folder\\h.png");
  	    ImageIcon is=new ImageIcon(imgs);
  	    JLabel i=new JLabel(is);
  	    //i.setBackground(Color.blue);
  	    i.setBounds(10,10, 200, 200);
  	    login.add(i);*/
		
		
		/*_____________________________Frame f__________________________*/
		f=new JFrame();
		f.setLayout(null);
		//f.setForeground(Color.black);
		//f.setUndecorated(true);
	    Container c1=f.getContentPane();
		c1.setBackground(Color.gray);
		//f.setVisible(true);
		f.setVisible(false);
		f.setBounds(0, 0,1920, 1080);
		
		l6=new JLabel("DYPIEMR Student Database");
		l6.setFont(l6.getFont().deriveFont(60.85632412f));
		l6.setBounds(150, 150, 1000, 60);
		f.add(l6);
		
		
		b3=new JButton("Add Student");
		b3.setFont(b3.getFont().deriveFont(30.85632412f));
		b3.setBounds(150, 250, 300, 50);
		b3.enable();
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		b3.setBorder(border1);
		b3.setVisible(true);
		f.add(b3);
		
		b4=new JButton("Remove Record");
		b4.setFont(b4.getFont().deriveFont(30.85632412f));
		b4.setBounds(150, 350, 300, 50);
		b4.enable();
		b4.addActionListener(this);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b4.setBorder(border1);
		b4.setVisible(true);
		f.add(b4);
		
		b5=new JButton("Update Record");
		b5.setFont(b5.getFont().deriveFont(30.85632412f));
		b5.setBounds(150, 450, 300, 50);
		b5.enable();
		b5.addActionListener(this);
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.white);
		b5.setBorder(border1);
		b5.setVisible(true);
		f.add(b5);
		
		b6=new JButton("Display Records");
		b6.setFont(b6.getFont().deriveFont(30.85632412f));
		b6.setBounds(150, 550, 300, 50);
		b6.enable();
		b6.addActionListener(this);
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.white);
		b6.setBorder(border1);
		b6.setVisible(true);
		f.add(b6);
		
		b7=new JButton("About Us");
		b7.setFont(b6.getFont().deriveFont(30.85632412f));
		b7.setBounds(150, 740, 300, 50);
		b7.enable();
		b7.addActionListener(this);
		b7.setBackground(Color.DARK_GRAY);
		b7.setForeground(Color.white);
		b7.setBorder(border1);
		b7.setVisible(true);      
		f.add(b7);
		
		b33=new JButton("See Records");
		b33.setFont(b33.getFont().deriveFont(30.85632412f));
		b33.setBounds( 150, 650, 300, 50);
		b33.enable();
		b33.addActionListener(this);
		b33.setBackground(Color.DARK_GRAY);
		b33.setForeground(Color.white);
		b33.setBorder(border1);
		b33.setVisible(true);
		f.add(b33);
		
		
		/*Image imgs1=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Pictures\\New folder\\facebook1.png");
  	    ImageIcon is1=new ImageIcon(imgs1);
  	    JLabel i1=new JLabel(is1);
  	    i1.setForeground(Color.white);
  	    i1.setBounds(920,950, 50, 50);
  	    f.add(i1);
  	    
  	    l26=new JLabel("Follow us on");
		l26.setFont(l26.getFont().deriveFont(20.85632412f));
		l26.setBounds(750,950, 150, 30);
		f.add(l26);
		
		Image imgs2=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Pictures\\New folder\\instagram.jpg");
  	    ImageIcon is2=new ImageIcon(imgs2);
  	    JLabel i2=new JLabel(is2);
  	    i2.setForeground(Color.white);
  	    i2.setBounds(990,950, 50, 51);
  	    f.add(i2);*/
		
  	   
		/*____________________________Frame f1__________________________*/
  	    f1=new JFrame();
		f1.setLayout(null);
		//f1.setForeground(Color.black);
		//f1.setUndecorated(true);
	    Container c2=f1.getContentPane();
		c2.setBackground(Color.gray);
		//f1.setVisible(true);
		f1.setVisible(false);
		f1.setBounds(0, 0,1920, 1080);
		
		l7=new JLabel("Student Details");
		l7.setFont(l7.getFont().deriveFont(55.85632412f));
		l7.setBounds(300, 200, 700, 60);
		f1.add(l7);
		
		l8=new JLabel("Enter ID");
		l8.setFont(l8.getFont().deriveFont(30.85632412f));
		l8.setBounds(300, 300, 250, 30);
		f1.add(l8);
		
		l9=new JLabel("Name");
		l9.setFont(l9.getFont().deriveFont(30.85632412f));
		l9.setBounds(300, 360, 250, 30);
		f1.add(l9);
		
		l10=new JLabel("Aggregate CGPA");
		l10.setFont(l10.getFont().deriveFont(30.85632412f));
		l10.setBounds(300, 420, 700, 30);
		f1.add(l10);
		
		l11=new JLabel("Mobile NO.");
		l11.setFont(l11.getFont().deriveFont(30.85632412f));
		l11.setBounds(300, 480, 700, 30);
		f1.add(l11);
		
		l12=new JLabel("Branch");
		l12.setFont(l12.getFont().deriveFont(30.85632412f));
		l12.setBounds(300, 540, 700, 60);
		f1.add(l12);
		
		t3=new JTextField();
		t3.setBounds(560, 300, 250, 30);
		t3.setFont(t3.getFont().deriveFont(15.85632412f));
		t3.setVisible(true);
		t3.setBorder(border);
		f1.add(t3);
		
		t4=new JTextField();
		t4.setBounds(560, 360, 250, 30);
		t4.setFont(t4.getFont().deriveFont(15.85632412f));
		t4.setVisible(true);
		t4.setBorder(border);
		f1.add(t4);
		
		t5=new JTextField();
		t5.setBounds(560,420,250,30);
		t5.setFont(t5.getFont().deriveFont(15.85632412f));
		t5.setVisible(true);
		t5.setBorder(border);
		f1.add(t5);
		
		t6=new JTextField();
		t6.setBounds(560,480,250,30);
		t6.setFont(t6.getFont().deriveFont(15.85632412f));
		t6.setVisible(true);
		t6.setBorder(border);
		f1.add(t6);
		
		t7=new JTextField();
		t7.setBounds(560,550,250,30);
		t7.setFont(t7.getFont().deriveFont(15.85632412f));
		t7.setVisible(true);
		t7.setBorder(border);
		f1.add(t7);
		
		l13=new JLabel("This Id has already Entered");
		l13.setFont(l13.getFont().deriveFont(15.85632412f));
		l13.setForeground(Color.RED);
		l13.setVisible(false);
		l13.setBounds(820, 300, 250, 30);
		f1.add(l13);
		
		b8=new JButton("Submit");
		b8.setFont(b8.getFont().deriveFont(20.85632412f));
		b8.setBounds(300, 650, 150, 40);
		b8.enable();
		b8.addActionListener(this);
		b8.setBackground(Color.DARK_GRAY);
		b8.setForeground(Color.white);
		b8.setBorder(border1);
		b8.setVisible(true);
		f1.add(b8);
		
		b9=new JButton("Cancel");
		b9.setFont(b6.getFont().deriveFont(20.85632412f));
		b9.setBounds(460, 650, 150, 40);
		b9.enable();
		b9.addActionListener(this);
		b9.setBackground(Color.DARK_GRAY);
		b9.setForeground(Color.white);
		b9.setBorder(border1);
		b9.setVisible(true);
		f1.add(b9);
		
		Image imgs3=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Pictures\\New folder\\g.jpg");
  	    ImageIcon is3=new ImageIcon(imgs3);
  	    /*JLabel i3=new JLabel(is3);
  	    i3.setForeground(Color.white);
  	    i3.setBounds(20,20, 50, 50);
  	    f1.add(i3);*/
  	    
  	    b10=new JButton();
		b10.setIcon(is3);
		b10.setBounds(20, 20, 50, 50);
		b10.enable();
		b10.addActionListener(this);
		b10.setBorder(border1);
		b10.setVisible(true);
		f1.add(b10);
		
		/*_____________________________Frame f2__________________________*/
		f2=new JFrame();
		f2.setLayout(null);
		//f2.setForeground(Color.black);
		//f2.setUndecorated(true);
	    Container c3=f2.getContentPane();
		c3.setBackground(Color.gray);
		//f2.setVisible(true);
		f2.setVisible(false);
		f2.setBounds(0, 0,1920, 1080);
		
		l14=new JLabel("Remove Record");
		l14.setFont(l14.getFont().deriveFont(55.85632412f));
		l14.setBounds(300, 200, 700, 60);
		f2.add(l14);
		
		l15=new JLabel("Enter Student ID you want to Remove");
		l15.setFont(l15.getFont().deriveFont(30.85632412f));
		l15.setBounds(300, 300, 550, 30);
		f2.add(l15);
		
		t8=new JTextField();
		t8.setBounds(300,350,300,30);
		t8.setFont(t8.getFont().deriveFont(15.85632412f));
		t8.setVisible(true);
		t8.setBorder(border);
		f2.add(t8);
		
		l16=new JLabel("Student ID NOT Found !!");
		l16.setFont(l16.getFont().deriveFont(15.85632412f));
		l16.setForeground(Color.RED);
		l16.setVisible(false);
		l16.setBounds(620, 350, 250, 30);
		f2.add(l16);
		
		b11=new JButton();
		b11.setIcon(is3);
		b11.setBounds(20, 20, 50, 50);
		b11.enable();
		b11.addActionListener(this);
		b11.setBorder(border1);
		b11.setVisible(true);
		f2.add(b11);
		
		b12=new JButton("Remove ");
		b12.setFont(b12.getFont().deriveFont(20.85632412f));
		b12.setBounds(300, 400, 150, 40);
		b12.enable();
		b12.addActionListener(this);
		b12.setBackground(Color.DARK_GRAY);
		b12.setForeground(Color.white);
		b12.setBorder(border1);
		b12.setVisible(true);
		f2.add(b12);
		
		b13=new JButton("Cancel");
		b13.setFont(b13.getFont().deriveFont(20.85632412f));
		b13.setBounds(460, 400, 150, 40);
		b13.enable();
		b13.addActionListener(this);
		b13.setBackground(Color.DARK_GRAY);
		b13.setForeground(Color.white);
		b13.setBorder(border1);
		b13.setVisible(true);
		f2.add(b13);
		
		/*_____________________________Frame f3__________________________*/
		f3=new JFrame();
		f3.setLayout(null);
		//f1.setForeground(Color.black);
		//f1.setUndecorated(true);
	    Container c4=f3.getContentPane();
		c4.setBackground(Color.gray);
		//f3.setVisible(true);
		f3.setVisible(false);
		f3.setBounds(0, 0,1920, 1080);
		
		l17=new JLabel("Update Details");
		l17.setFont(l17.getFont().deriveFont(55.85632412f));
		l17.setBounds(300, 200, 700, 60);
		f3.add(l17);
		
		l18=new JLabel("Student ID");
		l18.setFont(l18.getFont().deriveFont(30.85632412f));
		l18.setBounds(300, 300, 250, 30);
		f3.add(l18);
		
		l19=new JLabel("Name");
		l19.setFont(l19.getFont().deriveFont(30.85632412f));
		l19.setBounds(300, 360, 250, 30);
		f3.add(l19);
		
		l20=new JLabel("Aggregate %");
		l20.setFont(l20.getFont().deriveFont(30.85632412f));
		l20.setBounds(300, 420, 700, 30);
		f3.add(l20);
		
		l21=new JLabel("Mobile");
		l21.setFont(l21.getFont().deriveFont(30.85632412f));
		l21.setBounds(300, 480, 700, 30);
		f3.add(l21);
		
		l22=new JLabel("Branch");
		l22.setFont(l12.getFont().deriveFont(30.85632412f));
		l22.setBounds(300, 540, 700, 60);
		f3.add(l22);
		
		t9=new JTextField();
		t9.setBounds(560, 300, 250, 30);
		t9.setFont(t9.getFont().deriveFont(15.85632412f));
		t9.setVisible(true);
		t9.setBorder(border);
		f3.add(t9);
		
		t10=new JTextField();
		t10.setBounds(560, 360, 250, 30);
		t10.setFont(t10.getFont().deriveFont(15.85632412f));
		t10.setVisible(true);
		t10.setBorder(border);
		f3.add(t10);
		
		t11=new JTextField();
		t11.setBounds(560,420,250,30);
		t11.setFont(t11.getFont().deriveFont(15.85632412f));
		t11.setVisible(true);
		t11.setBorder(border);
		f3.add(t11);
		
		t12=new JTextField();
		t12.setBounds(560,480,250,30);
		t12.setFont(t12.getFont().deriveFont(15.85632412f));
		t12.setVisible(true);
		t12.setBorder(border);
		f3.add(t12);
		
		t15=new JTextField();
		t15.setBounds(560,550,250,30);
		t15.setFont(t15.getFont().deriveFont(15.85632412f));
		t15.setVisible(true);
		t15.setBorder(border);
		f3.add(t15);
		
		l23=new JLabel("ID Not Found !!");
		l23.setFont(l13.getFont().deriveFont(15.85632412f));
		l23.setForeground(Color.RED);
		l23.setVisible(false);
		l23.setBounds(820, 300, 250, 30);
		f3.add(l23);
		
		b14=new JButton("Update");
		b14.setFont(b14.getFont().deriveFont(20.85632412f));
		b14.setBounds(300, 650, 150, 40);
		b14.enable();
		b14.addActionListener(this);
		b14.setBackground(Color.DARK_GRAY);
		b14.setForeground(Color.white);
		b14.setBorder(border1);
		b14.setVisible(true);
		f3.add(b14);
		
		b15=new JButton("Cancel");
		b15.setFont(b15.getFont().deriveFont(20.85632412f));
		b15.setBounds(460, 650, 150, 40);
		b15.enable();
		b15.addActionListener(this);
		b15.setBackground(Color.DARK_GRAY);
		b15.setForeground(Color.white);
		b15.setBorder(border1);
		b15.setVisible(true);
		f3.add(b15);
		
		b16=new JButton();
		b16.setIcon(is3);
		b16.setBounds(20, 20, 50, 50);
		b16.enable();
		b16.addActionListener(this);
		b16.setBorder(border1);
		b16.setVisible(true);
		f3.add(b16);
		
		/*_____________________________Frame f4__________________________*/
		f4=new JFrame();
		f4.setLayout(null);
		//f4.setForeground(Color.black);
		//f4.setUndecorated(true);
	    Container c5=f4.getContentPane();
		c5.setBackground(Color.gray);
		//f4.setVisible(true);
		f4.setVisible(false);
		f4.setBounds(0, 0,1920, 1080);
		
		l24=new JLabel("See Details");
		l24.setFont(l24.getFont().deriveFont(55.85632412f));
		l24.setBounds(300, 200, 700, 60);
		f4.add(l24);
		
		b17=new JButton();
		b17.setIcon(is3);
		b17.setBounds(20, 20, 50, 50);
		b17.enable();
		b17.addActionListener(this);
		b17.setBorder(border1);
		b17.setVisible(true);
		f4.add(b17);
		
		b18=new JButton("See All");
		b18.setFont(b18.getFont().deriveFont(30.85632412f));
		b18.setBounds(300, 300, 300, 50);
		b18.enable();
		b18.setBackground(Color.DARK_GRAY);
		b18.setForeground(Color.white);
		b18.addActionListener(this);
		b18.setBorder(border1);
		b18.setVisible(true);
		f4.add(b18);
		
		b19=new JButton("One By One");
		b19.setFont(b19.getFont().deriveFont(30.85632412f));
		b19.setBounds(300, 400, 300, 50);
		b19.enable();
		b19.addActionListener(this);
		b19.setBackground(Color.DARK_GRAY);
		b19.setForeground(Color.white);
		b19.setBorder(border1);
		b19.setVisible(true);
		f4.add(b19);
		
		/*_____________________________Frame f5__________________________*/
		f5=new JFrame();
		f5.setLayout(null);
		//f5.setForeground(Color.black);
		//f5.setUndecorated(true);
	    Container c6=f5.getContentPane();
		c6.setBackground(Color.gray);
		//f5.setVisible(true);
		f5.setVisible(false);
		f5.setBounds(0, 0,1920, 1080);
		
		l25=new JLabel("Display Records");
		l25.setFont(l25.getFont().deriveFont(55.85632412f));
		l25.setBounds(800, 150, 700, 60);
		//l25.setFont(new Font("Times New Roman",Font.BOLD,50));
		//l25.setFont(new Font("Algerian",Font.BOLD,50));
		
		f5.add(l25);
		
		p1=new JTextArea();
		p1.setBounds(500,230,1000,550);
		p1.setVisible(true);
		p1.setBorder(border);
		p1.setFont(p1.getFont().deriveFont(20.85632412f));
		p1.setText("\n");
		f5.add(p1);
		
		b20=new JButton("Display");
		b20.setFont(b12.getFont().deriveFont(20.85632412f));
		b20.setBounds(800, 800, 150, 40);
		b20.enable();
		b20.addActionListener(this);
		b20.setBackground(Color.DARK_GRAY);
		b20.setForeground(Color.white);
		b20.setBorder(border1);
		b20.setVisible(true);
		f5.add(b20);
		
		b21=new JButton("Exit");
		b21.setFont(b13.getFont().deriveFont(20.85632412f));
		b21.setBounds(960, 800, 150, 40);
		b21.enable();
		b11.addActionListener(this);
		b21.setBackground(Color.DARK_GRAY);
		b21.setForeground(Color.white);
		b21.setBorder(border1);
		b21.setVisible(true);
		f5.add(b21);
		
		b27=new JButton();
		b27.setIcon(is3);
		b27.setBounds(20, 20, 50, 50);
		b27.enable();
		b27.addActionListener(this);
		b27.setBorder(border1);
		b27.setVisible(true);
		f5.add(b27);
		/*_____________________________Frame f6__________________________*/
		f6=new JFrame();
		f6.setLayout(null);
		//f6.setForeground(Color.black);
		//f6.setUndecorated(true);
	    Container c7=f6.getContentPane();
		c7.setBackground(Color.gray);
		//f6.setVisible(true);
		f6.setVisible(false);
		f6.setBounds(0, 0,1920, 1080);
		
		b22=new JButton("Previous");
		b22.setFont(b22.getFont().deriveFont(20.85632412f));
		b22.setBounds(820, 800, 150, 40);
		b22.enable();
		b22.addActionListener(this);
		b22.setBackground(Color.DARK_GRAY);
		b22.setForeground(Color.white);
		b22.setBorder(border1);
		b22.setVisible(true);
		f6.add(b22);
		
		b23=new JButton("Next");
		b23.setFont(b23.getFont().deriveFont(20.85632412f));
		b23.setBounds(1000, 800, 150, 40);
		b23.enable();
		b23.addActionListener(this);
		b23.setBackground(Color.DARK_GRAY);
		b23.setForeground(Color.white);
		b23.setBorder(border1);
		b23.setVisible(true);
		f6.add(b23);
		
		b28=new JButton("First");
		b28.setFont(b22.getFont().deriveFont(20.85632412f));
		b28.setBounds(650, 800, 150, 40);
		b28.enable();
		b28.addActionListener(this);
		b28.setBackground(Color.DARK_GRAY);
		b28.setForeground(Color.white);
		b28.setBorder(border1);
		b28.setVisible(true);
		f6.add(b28);
		
		b29=new JButton("Last");
		b29.setFont(b23.getFont().deriveFont(20.85632412f));
		b29.setBounds(1170, 800, 150, 40);
		b29.enable();
		b29.addActionListener(this);
		b29.setBackground(Color.DARK_GRAY);
		b29.setForeground(Color.white);
		b29.setBorder(border1);
		b29.setVisible(true);
		f6.add(b29);
		
		b25=new JButton("Exit");
		b25.setFont(b25.getFont().deriveFont(20.85632412f));
		b25.setBounds(915, 860, 150, 40);
		b25.enable();
		b25.addActionListener(this);
		b25.setBackground(Color.DARK_GRAY);
		b25.setForeground(Color.white);
		b25.setBorder(border1);
		b25.setVisible(true);
		f6.add(b25);
		
		b26=new JButton();
		b26.setIcon(is3);
		b26.setBounds(20, 20, 50, 50);
		b26.enable();
		b26.addActionListener(this);
		b26.setBorder(border1);
		b26.setVisible(true);
		f6.add(b26);
		
		l26=new JLabel("Display Records");
		l26.setFont(l25.getFont().deriveFont(55.85632412f));
		l26.setBounds(800, 150, 700, 60);
		//l26.setFont(new Font("Times New Roman",Font.BOLD,50));
		//l26.setFont(new Font("Algerian",Font.BOLD,50));
		f6.add(l26);
		
		p2=new JTextArea();
		p2.setBounds(600,230,800,550);
		p2.setVisible(true);
		p2.setBorder(border);
		p2.setFont(p1.getFont().deriveFont(20.85632412f));
		f6.add(p2);
		
		/*_____________________________Frame f7__________________________*/
		f7=new JFrame();
		f7.setLayout(null);
		//f7.setForeground(Color.black);
		//f7.setUndecorated(true);
	    Container c9=f7.getContentPane();
		c9.setBackground(Color.gray);
		//f7.setVisible(true);
		f7.setVisible(false);
		f7.setBounds(0, 0,1920, 1080);
		
		l29=new JLabel("See Student ");
		l29.setFont(l29.getFont().deriveFont(55.85632412f));
		l29.setBounds(300, 200, 700, 60);
		f7.add(l29);
		
		l30=new JLabel("Enter Number/ID you want to See");
		l30.setFont(l30.getFont().deriveFont(30.85632412f));
		l30.setBounds(300, 300, 550, 30);
		f7.add(l30);
		
		t16=new JTextField();
		t16.setBounds(300,350,300,30);
		t16.setFont(t8.getFont().deriveFont(15.85632412f));
		t16.setVisible(true);
		t16.setBorder(border);
		f7.add(t16);
		
		l31=new JLabel("Student NOT Found !!");
		l31.setFont(l16.getFont().deriveFont(15.85632412f));
		l31.setForeground(Color.RED);
		l31.setVisible(false);
		l31.setBounds(620, 350, 250, 30);
		f7.add(l31);
		
		b30=new JButton();
		b30.setIcon(is3);
		b30.setBounds(20, 20, 50, 50);
		b30.enable();
		b30.addActionListener(this);
		b30.setBorder(border1);
		b30.setVisible(true);
		f7.add(b30);
		
		b31=new JButton("See By Number");
		b31.setFont(b12.getFont().deriveFont(20.85632412f));
		b31.setBounds(300, 400, 200, 40);
		b31.enable();
		b31.addActionListener(this);
		b31.setBackground(Color.DARK_GRAY);
		b31.setForeground(Color.white);
		b31.setBorder(border1);
		b31.setVisible(true);
		f7.add(b31);
		
		b34=new JButton("See By ID");
		b34.setFont(b12.getFont().deriveFont(20.85632412f));
		b34.setBounds(530, 400, 200, 40);
		b34.enable();
		b34.addActionListener(this);
		b34.setBackground(Color.DARK_GRAY);
		b34.setForeground(Color.white);
		b34.setBorder(border1);
		b34.setVisible(true);
		f7.add(b34);
		
		b32=new JButton("Cancel");
		b32.setFont(b13.getFont().deriveFont(20.85632412f));
		b32.setBounds(780, 400, 150, 40);
		b32.enable();
		b32.addActionListener(this);
		b32.setBackground(Color.DARK_GRAY);
		b32.setForeground(Color.white);
		b32.setBorder(border1);
		b32.setVisible(true);
		f7.add(b32);
			
		p4=new JTextArea();
		p4.setBounds(300,460,400,500);
		p4.setVisible(true);
		p4.setBorder(border);
		p4.setFont(p4.getFont().deriveFont(20.85632412f));
		f7.add(p4);
	}
	/*public void paint(Graphics g){
		g.drawRect(0, 0, 20, 20);
	}*/
	
	
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==b1){
			String ID="admin";
			String Pass="1234";
			if(ID.equals(t1.getText())&& Pass.equals(t2.getText())){
				//System.out.println(t1.getText());
				login.dispose();
				f.setVisible(true);
			}
			else{
				l5.setVisible(true);
			}
		}
        if(o==b2){
			login.dispose();
		}
        if(o==b3){
			f.dispose();
			f1.setVisible(true);
		}
        if(o==b4){
        	f.dispose();
			f2.setVisible(true);
		}
        if(o==b5){
        	f.dispose();
			f3.setVisible(true);
		}
        if(o==b6){
        	f.dispose();
			f4.setVisible(true);
		}
        if(o==b7){
			
		}
        if(o==b8){
        	int k=operations.search(Integer.parseInt(t3.getText()));
        	if(k==1){
            	System.out.println("Duplicate ID");
            	l13.setVisible(true);
			}
        	else{
        		int r=operations.insert(t3.getText(), t4.getText(), t5.getText(), t6.getText(), t7.getText());
        	 if(r==1){
				System.out.println("Data Inserted Succesfully** ");
				f1.dispose();
				f.setVisible(true);
			}
			else if(r==0){
            	System.out.println("Data Not Inserted");
			}
            else{
            	System.out.println("Something else happened");
            }
        	}
		}
        if(o==b9){
			f1.dispose();
		}
        if(o==b10){
			f1.dispose();
			f.setVisible(true);
		}
        if(o==b11){
			f2.dispose();
			f.setVisible(true);
		}
        if(o==b12){
			int r1=operations.delete(t8.getText());
			if(r1==1){
				System.out.println("Record deleted Succesfully** ");
			    f2.dispose();
			}
			else if(r1==0){
            	System.out.println("Data Not Deleted");
            	l16.setVisible(true);
			}
            else{
            	System.out.println("Something else happened");
            }
		}
        if(o==b13){
			f2.dispose();
		}
        if(o==b14){
			int r2=operations.update(t9.getText(), t10.getText(), t11.getText(), t15.getText(), t12.getText());
			if(r2==1){
				System.out.println("Record updated Succesfully** ");
				f3.dispose();
				f.setVisible(true);
			}
			else if(r2==0){
            	System.out.println("Data Not Updated");
            	l23.setVisible(true);
			}
            else{
            	System.out.println("Something else happened");
            }
		}
        if(o==b15){
			f2.dispose();
		}
        if(o==b16){
			f2.dispose();
			f.setVisible(true);
		}
        if(o==b17){
			f4.dispose();
			f.setVisible(true);
		}
        if(o==b18){
			f4.dispose();
			f5.setVisible(true);
		}
        if(o==b19){
        	f4.dispose();
			f6.setVisible(true);
		}
        if(o==b20){
        	String text=operations.displayall();
        	//System.out.println(text);
			p1.setText("\n"+text);
		}
        if(o==b21){
			f5.dispose();
		}
        if(o==b23){
        	p2.setText("");
			String text1=operations.display_one_by_one(1,ssn);
			ssn++;
			p2.setText("\n\n\t"+text1);
		}
        if(o==b22){
        	p2.setText("");
        	String text2=operations.display_one_by_one(2,ssn-2);
        	ssn--;
			p2.setText("\n\n\t"+text2);
		}
        if(o==b24){
			
		}
        if(o==b25){
			f6.dispose();
		}
        if(o==b26){
			f6.disable();
			f.setVisible(true);
        }
        if(o==b27){
			f5.disable();
			f.setVisible(true);
        }
        if(o==b28){
        	p2.setText("");
			String text5=operations.display_one_by_one(3,0);
			p2.setText("\n\n\t"+text5);
		}
        if(o==b29){
        	p2.setText("");
        	String text6=operations.display_one_by_one(4,0);
			p2.setText("\n\n\t"+text6);
		}
        if(o==b30){
        	f7.dispose();
        	f.setVisible(true);
		}
        if(o==b31){
        	p4.setText("");
        	int u=Integer.parseInt(t16.getText());
        	String text9=operations.display_one_by_one(2,u);
			p4.setText("\n\n\t"+text9);
		}
        if(o==b32){
        	f7.dispose();
        }
        if(o==b33){
        	f.dispose();
        	f7.setVisible(true);
        }
        if(o==b34){
        	p4.setText("");
        	int u1=Integer.parseInt(t16.getText());
        	String text10=operations.search_by_ID(u1);
			p4.setText("\n\n\t"+text10);
        }
	}
	public static void main(String[] args) {
		new placement();

	}

}
