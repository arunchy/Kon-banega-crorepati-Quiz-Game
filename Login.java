import javax.swing.*;
import java.awt.*;
public class Login {
    private JFrame frame1;
    private JPanel panel1;
    private JLabel title1;
    private JLabel title2;
    private JLabel email;
    private JTextField t1;
    private JLabel password;
    private JTextField t2;
    private JButton submit;
 public void Loginpage(){
   frame1=new JFrame("Login Page");
   frame1.getContentPane().setBackground(Color.decode("#2A166D"));
   panel1=new JPanel();
   panel1.setBounds(550, 100, 500, 500);
   panel1.setBackground(Color.orange);
  
   title1=new JLabel();
   title1.setText("Kon Banega Crorepati Quiz Game");
   title1.setFont(new Font("Times New Roman", Font.BOLD, 30));
   title1.setForeground(Color.orange);
   title1.setBounds(550, 10, 700, 50);
   frame1.add(title1);

   title2=new JLabel();
   title2.setText("Login");
   title2.setFont(new Font("Times New Roman", Font.BOLD, 30));
   title2.setBounds(775, 105, 500, 50);
   frame1.add(title2);

   email=new JLabel();
   email.setText("Email Address");
   email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
   email.setBounds(570, 160, 450, 20);
   frame1.add(email);
   
   t1=new JTextField();
   t1.setBounds(570, 185, 450, 25);
   frame1.add(t1);

   password=new JLabel();
   password.setText("Password");
   password.setBounds(570, 215, 450, 20);
   password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
   frame1.add(password);

   t2=new JTextField();
   t2.setBounds(570, 240, 450, 25);
   frame1.add(t2);
   

   submit=new JButton("Login");
   submit.setBounds(735, 300, 150, 30);
   frame1.add(submit);
 

   frame1.add(submit);
   frame1.add(panel1);
   frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame1.setSize(500, 500);
   frame1.setLayout(null);
   frame1.setVisible(true);
       
    }
    
}
