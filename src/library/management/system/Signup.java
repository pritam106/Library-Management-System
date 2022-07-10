package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener{

   
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {
        setBounds(600, 250, 900, 577);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1234567.png"));
        JLabel image = new JLabel(i1);
        add(image);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("library\\management\\system\\icons\\save-icon--1.png"));
        JLabel L1 = new JLabel(i2);
        
        
        
	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.BLACK);
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblUsername.setBounds(120,50,200, 22);
	image.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.BLACK);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblName.setBounds(120,110, 200, 22);
	image.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.black);
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblPassword.setBounds(120, 160, 200, 26);
	image.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.BLACK);
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblAnswer.setBounds(120, 230, 200, 22);
	image.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
	comboBox.setBounds(320, 290, 460, 30);
	image.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.BLACK);
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblSecurityQuestion.setBounds(50, 290, 500, 26);
	image.add(lblSecurityQuestion);

        textField = new JTextField();
        textField.setForeground(new Color(0,0,0));
	textField.setFont(new Font("TAHOMA",Font.BOLD,22));
        textField.setBackground(new Color(255,255,153));
       	textField.setBounds(320, 50, 460, 30);
	image.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setForeground(new Color(0,0,0));
	textField_1.setFont(new Font("TAHOMA",Font.BOLD,22));
        textField_1.setBackground(new Color(255,255,153));
        textField_1.setColumns(10);
	textField_1.setBounds(320, 110, 460, 30);
	image.add(textField_1);

        textField_2 = new JTextField();
	textField_2.setForeground(new Color(0,0,0));
        textField_2.setFont(new Font("TAHOMA",Font.BOLD,22));
	textField_2.setBackground(new Color(255,255,153));
        textField_2.setColumns(10);
	textField_2.setBounds(320, 170, 460, 30);
	image.add(textField_2);

	textField_3 = new JTextField();
        textField_3.setForeground(new Color(0,0,0));
        textField_3.setFont(new Font("TAHOMA",Font.BOLD,22));
	textField_3.setBackground(new Color(255,255,153));
        textField_3.setColumns(10);
	textField_3.setBounds(320, 230, 460, 30);
	image.add(textField_3);

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 22));
        b1.setFont(new Font("TAHOMA",Font.BOLD,22));
	b1.setBounds(320, 355, 150, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.add(L1);
	image.add(b1);
        

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 22));
	b2.setBounds(660, 355, 120, 33);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	image.add(b2);

    }
    
     public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, textField_3.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "successfully Created");
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}

