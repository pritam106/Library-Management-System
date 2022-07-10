package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;

public class Login_user extends JFrame implements ActionListener{

	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3;


	public Login_user() {
            
	setBounds(0,0, 2172, 1122);
	
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/Login background.png"));
          JLabel image = new JLabel(i1);
        add(image);
        
        
	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(950,250,1000 , 550);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("TAHOMA",Font.BOLD,34));
	image.add(l1);

	JLabel l2 = new JLabel("Password : ");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("TAHOMA",Font.BOLD,34));
	l2.setBounds(955,320, 1000,550);
	image.add(l2);

	textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("serrif",Font.BOLD,22));
	textField.setBounds(1150,510,340,34);
        textField.setBackground(new Color(255,255,153));
	image.add(textField);
	
	
        passwordField = new JPasswordField();
        passwordField.setForeground(Color.BLACK);
        passwordField.setFont(new Font("serrif",Font.BOLD,22));
        passwordField.setBounds(1150,580,340,34);
        passwordField.setBackground(new Color(255,255,153));
	image.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	image.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	image.add(l3);
        b1 = new JButton("Login");
	b1.addActionListener(this);
        b1.setFont(new Font("TAHOMA",Font.BOLD, 22));
        b1.setForeground(new Color(255,255,255));
	b1.setBackground(new Color(0,0,0));
	b1.setBounds(955,680, 150, 39);
	image.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
        b2.setFont(new Font("TAHOMA",Font.BOLD, 22));
	b2.setForeground(new Color(255,255,255));
	b2.setBackground(new Color(0,0,0));
	b2.setBounds(1340,680, 150, 39);
	image.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
        b3.setFont(new Font("TAHOMA", Font.BOLD,22));
	b3.setForeground(new Color(0, 0, 0));
	b3.setBackground(new Color(255,255,255));
	b3.setBounds(955, 800,250, 39);
	image.add(b3);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 22));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(955,730, 200,90);
	image.add(l5);
                   
	           setVisible(true);
	}
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                Boolean status = false;
		try {
                    conn con = new conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login...!.");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}

}
