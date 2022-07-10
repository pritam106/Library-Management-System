package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddBook extends JFrame implements ActionListener{

    
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2;
    JComboBox comboBox;
        
    public static void main(String[] args) {
	new AddBook().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000 + 1));
    }

    public AddBook() {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1234567.png"));
        JLabel image = new JLabel(i1);
        add(image);
        
        
	JLabel l1 = new JLabel("Book_id");
	l1.setForeground(new Color(0,0,0));
	l1.setFont(new Font("Tahoma", Font.BOLD, 24));
	l1.setBounds(120,50,120,30);
	image.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(0,0,0));
	l2.setFont(new Font("Tahoma", Font.BOLD, 24));
	l2.setBounds(120,110,120,30);
	image.add(l2);

	JLabel l3 = new JLabel("ISBN");
	l3.setForeground(new Color(0,0,0));
	l3.setFont(new Font("Tahoma", Font.BOLD, 24));
	l3.setBounds(120,170,120,30);
	image.add(l3);

	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(0,0,0));
	l4.setFont(new Font("Tahoma", Font.BOLD, 24));
	l4.setBounds(120,230,120,30);
	image.add(l4);

	JLabel l5 = new JLabel("Price");
	l5.setForeground(new Color(0,0,0));
	l5.setFont(new Font("Tahoma", Font.BOLD, 24));
	l5.setBounds(120,290,120,30);
	image.add(l5);

	JLabel l6 = new JLabel("Pages");
	l6.setForeground(new Color(0,0,0));
	l6.setFont(new Font("Tahoma", Font.BOLD, 24));
	l6.setBounds(120,350,120,30);
	image.add(l6);

	JLabel l7 = new JLabel("Edition");
	l7.setForeground(new Color(0,0,0));
	l7.setFont(new Font("Tahoma", Font.BOLD, 24));
	l7.setBounds(120,410,120,30);
	image.add(l7);

	t1 = new JTextField();
	t1.setForeground(new Color(0,0,0));
        t1.setBackground(new Color(255,255,153));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
	t1.setBounds(260, 50, 460, 30);
	image.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(0,0,0));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
	t2.setColumns(10);
        t2.setBackground(new Color(255,255,153));
	t2.setBounds(260, 110, 460, 30);
	image.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(0,0,0));
        t3.setBackground(new Color(255,255,153));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
	t3.setColumns(10);
	t3.setBounds(260, 170, 460, 30);
	image.add(t3);

	t4 = new JTextField();
	t4.setForeground(new Color(0,0,0));
        t4.setBackground(new Color(255,255,153));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD,24));
	t4.setColumns(10);
	t4.setBounds(260, 230, 460, 30);
	image.add(t4);

        t5 = new JTextField();
	t5.setForeground(new Color(0,0,0));
        t5.setBackground(new Color(255,255,153));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
	t5.setColumns(10);
	t5.setBounds(260, 290, 460, 30);
	image.add(t5);

	t6 = new JTextField();
	t6.setForeground(new Color(0,0,0));
        t6.setBackground(new Color(255,255,153));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
	t6.setColumns(10);
	t6.setBounds(260, 350, 460, 30);
	image.add(t6);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	comboBox.setBounds(260, 410, 460, 30);
        comboBox.setBackground(new Color(255,255,153));
        image.add(comboBox);

        b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(255,255,153)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD,22));
	b1.setBounds(260,470, 100, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	image.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
	b2.setBounds(610,470, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	image.add(b2);
        
        setBounds(515,175,900,577);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t4.getText());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, t5.getText());
		st.setString(7, t6.getText());

		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
               
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);
            }
            con.c.close();
        }catch(Exception e){
             e.printStackTrace();
        }
    }
}
