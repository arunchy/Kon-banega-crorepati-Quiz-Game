import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.sound.sampled.*;
import java.util.Random;
import database.*;
import controller.*;
import models.*;

public class Signup {
private Login log1;
private JFrame frame;
private JPanel panel;
private JLabel img1;
private JLabel img2;
private JLabel fullname;
private JTextField t1;
private JLabel title2;
private JLabel email;
private JTextField t2;
private JLabel contact;
private JTextField t3;
private JLabel age;
private JTextField t4;
private JLabel gender;
private JRadioButton r1;
private JRadioButton r2;
private JLabel password;
private JPasswordField t5;
private JLabel pp;
private JFileChooser file;
private JButton btn1;
private JButton upload;
private JLabel filename;
private Clip clip;
private AudioInputStream sound;
private File audio1;
private JLabel check;
private JButton login;
private JDialog dia;
private JLabel error;
private JLabel img3;
private JLabel img4;
private JLabel img5;
private JLabel img6;
private JLabel img7;
private Random ran;
private JOptionPane pal;
public void signuppage(){
frame=new JFrame("SIGNUP");
frame.setSize(500, 500);

img1=new JLabel();
img1.setIcon(new ImageIcon("kbc.jpg"));
img1.setBounds(0, 0,550, 650);


img2=new JLabel();
img2.setIcon(new ImageIcon("kbc.jpg"));
img2.setBounds(1050, 0,550, 650);


img3=new JLabel();
img3.setIcon(new ImageIcon("dogesh5.gif"));
img3.setBounds(0, 600,300, 300);


img4=new JLabel();
img4.setIcon(new ImageIcon("dogesh2.gif"));
img4.setBounds(220, 600,300, 300);


img5=new JLabel();
img5.setIcon(new ImageIcon("dogesh3.gif"));
img5.setBounds(440, 600,300, 300);

img6=new JLabel();
img6.setIcon(new ImageIcon("dogesh1.gif"));
img6.setBounds(660, 600,300, 300);


img7=new JLabel();
img7.setIcon(new ImageIcon("dogesh7.gif"));
img7.setBounds(880, 600,300, 300);

panel=new JPanel();
panel.setBounds(550, 0, 500, 650);
panel.setBackground(Color.decode("#f5f6fa"));

title2=new JLabel();
title2.setText("Signup");
title2.setFont(new Font("Times New Roman", Font.BOLD, 30));
title2.setBounds(770, 30, 500, 50);
frame.add(title2);

fullname=new JLabel();
fullname.setText("FullName");
fullname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
fullname.setBounds(570, 100, 450, 20);
frame.add(fullname);

t1=new JTextField();
t1.setBounds(570, 125, 450, 25);
t1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(t1);

email=new JLabel();
email.setText("Email Address");
email.setBounds(570, 155, 450, 20);
email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(email);

t2=new JTextField();
t2.setBounds(570, 180, 450, 25);
t2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(t2);

contact=new JLabel();
contact.setText("Contact Number");
contact.setBounds(570, 210, 450, 20);
contact.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(contact);

t3=new JTextField();
t3.setBounds(570, 235, 450, 25);
t3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(t3);

age=new JLabel();
age.setText("Age");
age.setBounds(570, 265, 450, 20);
age.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(age);

t4=new JTextField();
t4.setBounds(570, 290, 450, 25);
t4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(t4);

gender=new JLabel();
gender.setText("Select Your Gender");
gender.setBounds(570, 320, 450, 20);
gender.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(gender);

r1=new JRadioButton("Male");
r1.setBounds(580, 350, 100, 30);
r1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
r1.setBackground(Color.decode("#ecf0f1"));
frame.add(r1);

r2=new JRadioButton("Female");
r2.setBounds(580, 380, 100, 30);
r2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
r2.setBackground(Color.decode("#ecf0f1"));
frame.add(r2);

password=new JLabel();
password.setText("New Password");
password.setBounds(570, 420, 450, 20);
password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(password);
 
t5=new JPasswordField();
t5.setBounds(570, 445, 450, 25);
t5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(t5);

pp=new JLabel();
pp.setText("Choose profile picture");
pp.setBounds(570,475 , 200, 20);
pp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(pp);



upload=new JButton("Upload");
upload.setBounds(750, 475, 80, 25);
upload.setActionCommand("upload");
upload.addActionListener(new ButtonClickListener());
frame.add(upload);


filename=new JLabel();
filename.setText("");
filename.setBounds(830,475 , 180, 25);
frame.add(filename);


btn1=new JButton("Signup");
btn1.setFont(new Font("Times New Roman", Font.BOLD, 17));
btn1.setActionCommand("signup");
btn1.addActionListener(new ButtonClickListener());
btn1.setBounds(735, 525, 150, 30);
frame.add(btn1);

// try {
//   audio1 = new File("F:/Group-C 32B/audio1.wav").getAbsoluteFile();
//   sound = AudioSystem.getAudioInputStream(audio1);
//   clip = AudioSystem.getClip();
//   clip.open(sound);
//   clip.start();  
// } catch (Exception e) {
//   e.printStackTrace();
// }


check=new JLabel();
check.setText("Already have an account?");
check.setBounds(600, 580, 150, 20);
frame.add(check);

login=new JButton("Login");
login.setBounds(750, 580, 75, 20);
login.setActionCommand("goto");
login.addActionListener(new ButtonClickListener());
frame.add(login);

dia=new JDialog(frame,"Error Message");
dia.setBackground(Color.BLACK);
error=new JLabel("There id an Error");
error.setForeground(Color.red);
error.setFont(new Font("Times New Roman", Font.PLAIN, 16));

dia.add(error);
dia.setBounds(650, 280, 250, 250);
dia.setVisible(false);


frame.getContentPane().setBackground(Color.decode("#A020F0"));
frame.add(panel);
frame.add(img1);
frame.add(img2);
frame.add(img3);
frame.add(img4);
frame.add(img5);
frame.add(img6);
frame.add(img7);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setVisible(true);
}


private class ButtonClickListener implements ActionListener{
  
    public void actionPerformed(ActionEvent e){
      String command=e.getActionCommand();
      if(command.equals("upload")){
        file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r = file.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION){
         filename.setText(file.getSelectedFile().getAbsolutePath());
}

     }
     else if(command.equals("goto")){
       log1=new Login();
       log1.Loginpage();

     }
     else if(command.equals("signup")){
       
       String fullname=t1.getText();
       String email=t2.getText();
       String contact=t3.getText();
       String age=t4.getText();
       String gender;
       String id="";
       int uid=0;
       ran=new Random();
       for(int i=1;i<=4;i++){
         id=id+Integer.toString(ran.nextInt(10));

       }
       uid=Integer.parseInt(id);
       if(r1.isSelected()){
         gender="Male";
       }else if(r2.isSelected()){
         gender="Female";
       }else{
         gender="";
       }
       char[] password=t5.getPassword();
       String pass="";
       for (char c : password) {
         pass=pass+c;
       }
       String profile=filename.getText();

        if( fullname.length()==0 && email.length()==0 && contact.length()==0 && age.length()==0 && gender.length()==0 && profile.length()==0 && pass.length()==0){
         pal=new JOptionPane();
         pal.showMessageDialog(null,"Please fill all the input fields...");

        }else{
         try{
           new DbConnection();
          Users data1=new Users(uid, fullname, email, contact, age, gender, password.toString(),profile);
           UsersController con1=new UsersController();
           int result=con1.insertusers(data1);
           if(result==1){
            pal=new JOptionPane();
            pal.showMessageDialog(null,"Your account has been sucessfully created");
            Home home=new Home();
            home.Homepage(email,pass);
           }
           
         }
         catch(Exception err){
          err.printStackTrace();
         }
        
         
        }
       
         
       

       


       

     }
    
   }
}

    }



