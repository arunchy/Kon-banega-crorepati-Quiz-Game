import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.sound.sampled.*;

public class Signup {
private Login log1;
private JFrame frame;
private JPanel panel;
private JLabel img1;
private JLabel fullname;
private JTextField t1;
private JLabel title;
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
private JTextField t5;
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
public void signuppage(){
frame=new JFrame("SIGNUP");
frame.setSize(500, 500);
// img1=new JLabel();
// img1.setBounds(500, 50, 600, 600);
// img1.setIcon(new ImageIcon(".gif"));
// frame.add(img1);
title=new JLabel();
title.setText("Kon Banega Crorepati Quiz Game");
title.setFont(new Font("Times New Roman", Font.BOLD, 30));
title.setForeground(Color.orange);
title.setBounds(550, 10, 700, 50);
frame.add(title);
panel=new JPanel();
panel.setBounds(550, 100, 500, 600);
panel.setBackground(Color.orange);

title2=new JLabel();
title2.setText("Signup");
title2.setFont(new Font("Times New Roman", Font.BOLD, 30));
title2.setBounds(775, 105, 500, 50);
frame.add(title2);

fullname=new JLabel();
fullname.setText("FullName");
fullname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
fullname.setBounds(570, 160, 450, 20);
frame.add(fullname);

t1=new JTextField();
t1.setBounds(570, 185, 450, 25);
frame.add(t1);

email=new JLabel();
email.setText("Email Address");
email.setBounds(570, 215, 450, 20);
email.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(email);

t2=new JTextField();
t2.setBounds(570, 240, 450, 25);
frame.add(t2);

contact=new JLabel();
contact.setText("Contact Number");
contact.setBounds(570, 270, 450, 20);
contact.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(contact);

t3=new JTextField();
t3.setBounds(570, 295, 450, 25);
frame.add(t3);

age=new JLabel();
age.setText("Age");
age.setBounds(570, 325, 450, 20);
age.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(age);

t4=new JTextField();
t4.setBounds(570, 350, 450, 25);
frame.add(t4);

gender=new JLabel();
gender.setText("Select Your Gender");
gender.setBounds(570, 380, 450, 20);
gender.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(gender);

r1=new JRadioButton("Male");
r1.setBounds(580, 410, 100, 30);
r1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
r1.setBackground(Color.orange);
frame.add(r1);

r2=new JRadioButton("Female");
r2.setBounds(580, 440, 100, 30);
r2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
r2.setBackground(Color.orange);
frame.add(r2);

password=new JLabel();
password.setText("New Password");
password.setBounds(570, 475, 450, 20);
password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(password);
 
t5=new JTextField();
t5.setBounds(570, 500, 450, 25);
frame.add(t5);

pp=new JLabel();
pp.setText("Choose profile picture");
pp.setBounds(570, 530, 200, 20);
pp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
frame.add(pp);



upload=new JButton("Upload");
upload.setBounds(750, 530, 80, 25);
upload.setActionCommand("upload");
upload.addActionListener(new ButtonClickListener());
frame.add(upload);


filename=new JLabel();
filename.setText("");
filename.setBounds(830,530 , 180, 25);
frame.add(filename);


btn1=new JButton("Sign up");
btn1.setBounds(735, 580, 150, 30);
frame.add(btn1);

try {
  audio1 = new File("F:/Group-C 32B/audio1.wav").getAbsoluteFile();
  sound = AudioSystem.getAudioInputStream(audio1);
  clip = AudioSystem.getClip();
  clip.open(sound);
  clip.start();  
} catch (Exception e) {
  e.printStackTrace();
}


check=new JLabel();
check.setText("Already have an account?");
check.setBounds(600, 650, 150, 20);
frame.add(check);

login=new JButton("Login");
login.setBounds(750, 650, 75, 20);
login.setActionCommand("goto");
login.addActionListener(new ButtonClickListener());
frame.add(login);

frame.getContentPane().setBackground(Color.decode("#2A166D"));
frame.add(panel);
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
     
    }
 }


}


