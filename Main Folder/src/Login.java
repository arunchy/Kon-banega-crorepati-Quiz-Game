import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.sound.sampled.*;
import java.io.File;
import controller.*;
public class Login {
    private JFrame frame1;
    private JPanel panel1;
    private JLabel title2;
    private JLabel email;
    private JTextField t1;
    private JLabel password;
    private JPasswordField t2;
    private JButton submit;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JLabel img5;
    private JLabel img6;
    private JLabel img7;
    private JOptionPane pal;
    private JOptionPane pal1;
    private Clip clip;
    private AudioInputStream sound;
    private File audio1;
    int id;
   
 public void Loginpage(){
   frame1=new JFrame("Login Page");
   frame1.getContentPane().setBackground(Color.decode("#A020F0"));
   panel1=new JPanel();
   panel1.setBounds(550, 0, 500, 650);
   panel1.setBackground(Color.decode("#f5f6fa"));
   

   img1=new JLabel();
   img1.setIcon(new ImageIcon("kbc.jpg"));
   img1.setBounds(0, 0,550, 650);
   
   
   img2=new JLabel();
   img2.setIcon(new ImageIcon("kbc.jpg"));
   img2.setBounds(1050, 0,550, 650);


   img3=new JLabel();
img3.setIcon(new ImageIcon("dogesh1.gif"));
img3.setBounds(0, 600,300, 300);


img4=new JLabel();
img4.setIcon(new ImageIcon("dogesh2.gif"));
img4.setBounds(220, 600,300, 300);


img5=new JLabel();
img5.setIcon(new ImageIcon("dogesh3.gif"));
img5.setBounds(440, 600,300, 300);

img6=new JLabel();
img6.setIcon(new ImageIcon("dogesh5.gif"));
img6.setBounds(660, 600,300, 300);


img7=new JLabel();
img7.setIcon(new ImageIcon("dogesh7.gif"));
img7.setBounds(880, 600,300, 300);

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
   t1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
   frame1.add(t1);

   password=new JLabel();
   password.setText("Password");
   password.setBounds(570, 215, 450, 20);
   password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
   frame1.add(password);

   t2=new JPasswordField();
   t2.setBounds(570, 240, 450, 25);
   t2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
   frame1.add(t2);
  
   submit=new JButton("Login");
   submit.setBounds(700, 300, 150, 30);
   submit.setActionCommand("login");
   submit.addActionListener(new ButtonClickListener());
   frame1.add(submit);
 
   pal1=new JOptionPane();
   pal=new JOptionPane();
   frame1.add(submit);
   frame1.add(panel1);
   frame1.add(img1);
   frame1.add(img2);
   frame1.add(img3);
   frame1.add(img4);
   frame1.add(img5);
   frame1.add(img6);
   frame1.add(img7);

   frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame1.setSize(500, 500);
   frame1.setLayout(null);
   frame1.setVisible(true);
       
    }
    
private class ButtonClickListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    String command=e.getActionCommand();
    if(command.equals("login")){
      String email=t1.getText();
      char[] password=t2.getPassword();
      String pass="";
      for (char c : password) {
        pass=pass+c;
      }
      if(email.length()==0 && pass.length()==0){
        
   try {
    audio1 = new File("C:/Users/FCT/Group-C 32B/Main Folder/src/error.wav").getAbsoluteFile();
    sound = AudioSystem.getAudioInputStream(audio1);
    clip = AudioSystem.getClip();
    clip.open(sound);
    clip.start();  
  } catch (Exception errr) {
    errr.printStackTrace();
  }
        pal.showMessageDialog(null,"Please fill all the input fields...");

      }else{
       UsersController user=new UsersController();
      ResultSet data=user.fetchdata(email, pass);
      try {
        if(data.next()==true){
            id=data.getInt("uid");
            frame1.dispose();
            Home home=new Home();
            home.Homepage(email,pass);
        }else{
           
   try {
    audio1 = new File("C:/Users/FCT/Group-C 32B/Main Folder/src/error.wav").getAbsoluteFile();
    sound = AudioSystem.getAudioInputStream(audio1);
    clip = AudioSystem.getClip();
    clip.open(sound);
    clip.start();  
  } catch (Exception errr) {
    errr.printStackTrace();
  }
          pal1.showMessageDialog(null,"please enter valid Email or Password... ");
        }
          
           
          
  
  
        } catch (Exception err) {
        err.printStackTrace();
      }
      
      


      }

    }
  }
}
public static void main(String[] args) {
 Login log=new Login();
 log.Loginpage(); 
}
    
}
