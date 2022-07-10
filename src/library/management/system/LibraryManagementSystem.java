package library.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import library.management.system.Login_user;

public class LibraryManagementSystem extends JFrame implements ActionListener{

    private Object b1,b2;

    
        LibraryManagementSystem(){
        
            setBounds(300,150,1346,670);
        ImageIcon I1 =new ImageIcon(ClassLoader.getSystemResource("library\\management\\system\\Icons\\library.JPG"));
        JLabel L1 = new JLabel(I1);
        L1.setBounds(0,0,1340,635);
        add(L1);
        
        
        JLabel L2= new JLabel("Library Management System");
        L2.setBounds(20,550 ,1000,90);
        L2.setForeground(new Color(255,255,153));
        L2.setFont(new Font("SERIF",Font.BOLD,70));
        L1.add(L2);
        
        JButton b1 = new JButton("Next");
        b1.setBackground(new Color(0,0,0));
        b1.setForeground(new Color(255,255,153));
        b1.setFont(new Font("serif",Font.BOLD,24));
        b1.setBounds(1050,580,150,50);
        b1.addActionListener(this);
        L1.add(b1);
        
        setLayout(null);
        setResizable(false);
        setVisible(true);
        
        
        while (true) {
        L2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
            L2.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
              
          }
        
    }
  
     public void  actionPerformed(ActionEvent ae)
     {
         new Login_user().setVisible(true);
         this.setVisible(false);
     }
    
    public static void main(String[] args) {
            new LibraryManagementSystem();
    }
}
