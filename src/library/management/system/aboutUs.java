package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - Project Via SEIT students");
            
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JButton b1 = new JButton("Back");
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.ORANGE);
            b1.setFont(new Font("serif",Font.BOLD,30));
            b1.setBounds(10,05,120,33);
            b1.addActionListener(this);
            contentPane.add(b1);
            
            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(Color.RED);
            l3.setFont(new Font("Trebuchet MS", Font.BOLD , 38));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(Color.BLACK);
            l4.setFont(new Font("Trebuchet MS", Font.BOLD , 38));
            l4.setBounds(70, 90, 405, 44);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v 0.2");
            l5.setForeground( Color.RED);
            l5.setFont(new Font("serrif",Font.BOLD,34));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 38));
            l5.setBounds(185, 140, 100, 40);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : SEIT Students");
            l6.setForeground(Color.CYAN);
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : Prathameshp.2001@gmail.com");
            l7.setForeground(Color.BLACK);
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Hindavimhatre183@gmail.com");
            l8.setForeground(Color.BLACK);
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(190, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Avie9500@gmail.com");
            l9.setForeground(Color.BLACK);
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(190, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.ORANGE);

            setBounds(600,175,700,550);
            setVisible(true);
        }

    
    public void actionPerformed(ActionEvent e) {
        new Home().setVisible(true);
        this.setVisible(false);
    }
        
}

