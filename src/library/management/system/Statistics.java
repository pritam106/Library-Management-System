package library.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame{

    private JPanel contentPane;
    private JTable table;
    private JTable table_1;

    public static void main(String[] args) {
        new Statistics().setVisible(true);
    }

    public void issueBook() {
	try {
            conn con =  new conn();
            String sql = "select * from issueBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public void returnBook() {
        try {
            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public Statistics() {
        
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/lib.jpeg"));
        Image I3 = I1.getImage().getScaledInstance(810, 594,Image.SCALE_DEFAULT);
        ImageIcon I2 = new ImageIcon(I3);
        JLabel image = new JLabel(I2);
        add(image);
        

        JLabel L1 = new JLabel("Issue-Book Details");
        L1.setBounds(250,20, 500,30);
        L1.setFont(new Font("TAHOMA", Font.BOLD,24));
        L1.setForeground(new Color(255,255,153));
        image.add(L1);
	
        
        JLabel L2 = new JLabel("Return-Book Details");
        L2.setBounds(250,280, 500,30);
        L2.setFont(new Font("TAHOMA", Font.BOLD,24));
        L2.setForeground(new Color(255,255,153));
        image.add(L2);
	
        
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(40, 51, 708, 217);
	image.add(scrollPane);

        table = new JTable();
	table.setBackground(new Color(255, 255,153));
	table.setForeground(new Color(0,0,0));
	table.setFont(new Font("SERRIF", Font.BOLD, 18));
	scrollPane.setViewportView(table);

	
	JLabel l1 = new JLabel("Back");
	l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
		Home home = new Home();
		home.setVisible(true);
            }
	});
	l1.setForeground(new Color(204, 0, 102));
	l1.setFont(new Font("Tahoma", Font.BOLD, 18));
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/lib.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
	l1.setBounds(690, 13, 96, 27);
	image.add(l1);

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(40, 316, 717, 217);
	image.add(scrollPane_1);

	table_1 = new JTable();
	table_1.setBackground(new Color(255, 255,153));
	table_1.setForeground(new Color(0,0,0));
	table_1.setFont(new Font("SERRIF", Font.BOLD, 18));
	scrollPane_1.setViewportView(table_1);
        
       setBounds(515,165, 810, 594);
       setUndecorated(true);
       setVisible(true);
       
       
       issueBook();
	returnBook();
    }
}
