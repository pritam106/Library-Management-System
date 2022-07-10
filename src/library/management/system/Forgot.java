package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class Forgot extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new Forgot().setVisible(true);
    }

    public Forgot() {

        setBounds(515,180,900,570);
        
         ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1234567.png"));
         JLabel L1 = new JLabel(I1);
         L1.setBounds(0,0,900,575);
         add(L1);
        
	JLabel l1 = new JLabel("Username");
	l1.setFont(new Font("Tahoma", Font.BOLD, 24));
        l1.setForeground(Color.BLACK);
	l1.setBounds(130,120,120,30);
	L1.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 24));
	l2.setForeground(Color.BLACK);
        l2.setBounds(130,180,120,30);
	L1.add(l2);

	JLabel l3 = new JLabel("Your Security Question");
	l3.setFont(new Font("Tahoma", Font.BOLD, 24));
	l3.setForeground(Color.BLACK);
        l3.setBounds(130,240,120, 30);
	L1.add(l3);

	JLabel l4 = new JLabel("Answer");
	l4.setFont(new Font("Tahoma", Font.BOLD, 24));
	l4.setForeground(Color.BLACK);
        l4.setBounds(130,300, 120, 30);
	L1.add(l4);

	JLabel l5 = new JLabel("Password");
	l5.setFont(new Font("Tahoma", Font.BOLD,24));
	l5.setForeground(Color.BLACK);
        l5.setBounds(130, 360, 120, 30);
	L1.add(l5);

	t1 = new JTextField();
	t1.setFont(new Font("Tahoma", Font.BOLD, 24));
	t1.setForeground(new Color(0,0,0));
	t1.setBackground(new Color(255,255,153));
        t1.setBounds(340,120,400,30);
	L1.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setFont(new Font("Tahoma", Font.BOLD, 20));
	t2.setForeground(new Color(0,0,0));
        t2.setBackground(new Color(255,255,153));   
	t2.setColumns(10);
	t2.setBounds(340,180,400,30);
	L1.add(t2);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setFont(new Font("Tahoma", Font.BOLD, 20));
	t3.setForeground(new Color(0,0,0));
	t3.setBackground(new Color(255,255,153));
        t3.setColumns(10);
	t3.setBounds(340,240,400,30);
	L1.add(t3);

	t4 = new JTextField();
	t4.setFont(new Font("Tahoma", Font.BOLD, 20));
	t4.setForeground(new Color(0,0,0));
	t4.setBackground(new Color(255,255,153));
        t4.setColumns(10);
	t4.setBounds(340,300,400,30);
	L1.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setFont(new Font("Tahoma", Font.BOLD, 20));
	t5.setForeground(new Color(0,0,0));
        t5.setBackground(new Color(255,255,153));
	t5.setColumns(10);
	t5.setBounds(340,360,400,30);
	L1.add(t5);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 20));
	b1.setBounds(750,120, 120, 30);
	b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        L1.add(b1);

	b2 = new JButton("Retrieve");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 20));
	b2.setBounds(750,360, 120, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	L1.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 20));
	b3.setBounds(620, 420, 120, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	L1.add(b3);

	
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("sec_q"));
		}

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where sec_ans=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t4.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    	t5.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }

}
