import java.awt.*;
import javax.swing.*;

public class Login {
private JFrame frame;
private JPanel panel1;
private JPanel panel2;
private JPanel Panel3;
private JLabel title;
private JLabel img1;
private JLabel title2;
private JLabel fullname;
private JLabel email;
private JLabel Age;
private JLabel contact;
private JLabel Address;
public void Loginpage(){
frame=new JFrame();
frame.setLayout(null);
panel1=new JPanel();
panel1.setBackground(Color.BLACK);
//Logo panel
panel1.setBounds(0, 80, 300, 500);
img1=new JLabel();
img1.setIcon(new ImageIcon("rock.gif"));
img1.setBounds(80, 90, 600, 800);
frame.add(img1);
frame.add(panel1);
//Element panel
panel2=new JPanel(new BorderLayout(0,0));
panel2.setBackground(Color.decode("#4C2269"));
panel2.setBounds(600,100,500,600);
//Adding the element
title2=new JLabel();
title2.setText("Signup");
title2.setFont(new Font("Times New Roman", Font.BOLD, 30));
title2.setBounds(0,0,150,50);
title2.setForeground(Color.decode("#000000"));
panel2.add(title2,BorderLayout.SOUTH);
//fullname
fullname=new JLabel();
fullname.setText("FullName");
fullname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
fullname.setForeground(Color.decode("#000000"));
panel2.add(fullname,BorderLayout.CENTER);
frame.add(panel2);
//Title panel
Panel3=new JPanel();
Panel3.setBackground(Color.decode("#000000"));
title=new JLabel();
title.setText("Kon Banega Crorepati Quiz Game");
title.setFont(new Font("Times New Roman", Font.BOLD, 32));
title.setForeground(Color.decode("#4C2269"));
title.setBounds(10, 20, 150, 50);
Panel3.add(title);
Panel3.setBounds(450, 0, 900, 100);
frame.add(Panel3);
frame.getContentPane().setBackground(Color.decode("#000000"));
frame.setSize(500,500);
frame.setVisible(true);  



}
}

