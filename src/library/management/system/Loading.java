
package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import static javafx.scene.paint.Color.color;

public class Loading extends JFrame implements Runnable {
        private ImageIcon I1;
        private JLabel L1;
	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
            setUndecorated(true);
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                       new Home().setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {
           
            super("Loading");
            th = new Thread((Runnable) this);

            setBounds(525,350, 900,350);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1234567.png"));
          JLabel image = new JLabel(i1);
            add(image);
           

            JLabel l1 = new JLabel("Smart Library  V5.1");
            l1.setForeground(new Color(255,255,153));
            l1.setFont(new Font("Trebuchet MS", Font.BOLD, 46));
            l1.setBounds(300, 46, 500, 50);
            image.add(l1);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 26));
            progressBar.setBackground(Color.BLACK);
            progressBar.setForeground(new Color(255,255,153));
            progressBar.setBounds(250, 135, 500, 30);
            image.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel(" Till Loading ........Wait");
            lblNewLabel_2.setFont(new Font("TAHOMA", Font.BOLD, 26));
            lblNewLabel_2.setForeground(new Color(204,0,51));
            lblNewLabel_2.setBounds(200,165, 500,100);
            image.add(lblNewLabel_2);
   
            setUploading();
	}
}
