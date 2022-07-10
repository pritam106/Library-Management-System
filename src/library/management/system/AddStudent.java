package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
       new AddStudent().setVisible(true);
       }

    public AddStudent() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1234567.png"));
        JLabel image = new JLabel(i1);
        add(image);
        
	
	JLabel l1 = new JLabel("Student_id");
	l1.setForeground(new Color(0,0,0));
	l1.setFont(new Font("Tahoma", Font.BOLD, 24));
	l1.setBounds(120,50,200, 22);
	image.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(0,0,0));
	l2.setFont(new Font("Tahoma", Font.BOLD, 24));
	l2.setBounds(120,110, 200, 22);
	image.add(l2);

	JLabel l3 = new JLabel("Father's Name");
	l3.setForeground(new Color(0,0,0));
	l3.setFont(new Font("Tahoma", Font.BOLD, 24));
	l3.setBounds(120, 170, 250, 22);
	image.add(l3);

	JLabel l4 = new JLabel("Branch");
	l4.setForeground(new Color(0,0,0));
	l4.setFont(new Font("Tahoma", Font.BOLD, 24));
	l4.setBounds(120, 230, 200, 22);
	image.add(l4);

        JLabel l5 = new JLabel("Year");
	l5.setForeground(new Color(0,0,0));
	l5.setFont(new Font("Tahoma", Font.BOLD, 24));
	l5.setBounds(120, 290,200, 22);
	image.add(l5);

	JLabel l6 = new JLabel("Semester");
	l6.setForeground(new Color(0,0,0));
	l6.setFont(new Font("Tahoma", Font.BOLD, 24));
	l6.setBounds(120,350, 200, 22);
	image.add(l6);

	t1 = new JTextField();
	t1.setEditable(true);
	t1.setForeground(new Color(0,0,0));
	t1.setBackground(new Color(255,255,153));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD,20));
	t1.setBounds(320, 50, 460, 30);
	image.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(0,0,0));
       t2.setBackground(new Color(255,255,153));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
	t2.setColumns(10);
	t2.setBounds(320, 110, 460, 30);
        image.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(0,0,0));
        t3.setBackground(new Color(255,255,153));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
	t3.setColumns(10);
	t3.setBounds(320, 170, 460, 30);
	image.add(t3);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
	comboBox.setForeground(new Color(0,0,0));
        comboBox.setBackground(new Color(255,255,255));
	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	comboBox.setBounds(320, 230, 460, 30);
	image.add(comboBox);

	comboBox_1 = new JComboBox();
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
	comboBox_1.setForeground(new Color(0,0,0));
        comboBox_1.setBackground(new Color(255,255,255));
	comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	comboBox_1.setBounds(320, 290, 460, 30);
	image.add(comboBox_1);

	comboBox_2 = new JComboBox();
	comboBox_2.setModel(
    			new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	comboBox_2.setForeground(new Color(0,0,0));
        comboBox_2.setBackground(new Color(255,255,255));
        comboBox_2.setBounds(320, 350, 460, 30);
	image.add(comboBox_2);

	b1 = new JButton("ADD");
	b1.addActionListener(this);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
	b1.setBounds(320, 470, 120, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	image.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD,20));
	b2.setBounds(660, 470, 120, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	image.add(b2);

	JLabel l7 = new JLabel("Course");
	l7.setForeground(new Color(0,0,0));
	l7.setFont(new Font("Tahoma", Font.BOLD, 24));
	l7.setBounds(120, 410, 200, 22);
	image.add(l7);

	comboBox_3 = new JComboBox();
	comboBox_3.setModel(new DefaultComboBoxModel(
			new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
	comboBox_3.setForeground(new Color(0,0,0));
        comboBox_3.setBackground(new Color(255,255,255));
	comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	comboBox_3.setBounds(320, 410, 460, 30);
	image.add(comboBox_3);
        
        
        
        setBounds(515,175, 900,577);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                conn con = new conn();
                String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, (String) comboBox_3.getSelectedItem());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, (String) comboBox_1.getSelectedItem());
		st.setString(7, (String) comboBox_2.getSelectedItem());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
}

