package View;
import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import controller.*;
import models.*;
import java.sql.ResultSet;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileSystemView;
import java.net.PasswordAuthentication;
public class UpdateProfile{
   private JFrame frame;
   private JLabel img1;
   private JLabel img2;
   private JLabel img3;
   private JLabel img4;
   private String getpath="";
   private File imagename;
   private String absolutepath;
   private String[] arr;
   private JPanel panel;
   private JLabel fullname;
   private JLabel title;
   private JLabel email;
   private JLabel contact;
   private JLabel age;
   private JRadioButton r1;
   private JRadioButton r2;
   private JLabel pp;
   private JButton upload; 
   private JLabel gender;
   private JLabel password;
   private JTextField t1;
   private JTextField t2;
   private JTextField t3;
   private JTextField t4;
   private JPasswordField t5;
   private JLabel filename;
   private JButton edit;
   private JFileChooser file;
   private String realpath="";
   private String[] arr2;
   private int user_id;

   public void UpdateProfileScreen(int id){
    this.user_id=id;
    frame=new JFrame("Update Profile");
    imagename=new File("");
    absolutepath=imagename.getAbsolutePath();
    arr=new String[absolutepath.length()];

for(int i=0;i<=absolutepath.length()-1;i++){
  if(String.valueOf(absolutepath.charAt(i)).equals("\\")){
    arr[i]="/";

  }else{
    arr[i]=String.valueOf(absolutepath.charAt(i));

  }
   getpath+=arr[i];
   
}
getpath+="/src/Images/";
    img1=new JLabel();
img1.setIcon(new ImageIcon(getpath+"Kbc.jpg"));
img1.setBounds(0, 0,550, 650);
frame.add(img1);

img2=new JLabel();
img2.setIcon(new ImageIcon(getpath+"Kbc.jpg"));
img2.setBounds(1050, 0,550, 650);
frame.add(img2);


UpdateProfileModel model=new UpdateProfileModel(1);
UpdateProfileController con=new UpdateProfileController();
ResultSet data=con.fetchData(model);







title=new JLabel();
title.setText("Edit Profile");
title.setFont(new Font("Times New Roman", Font.BOLD, 30));
title.setBounds(750, 30, 500, 50);
frame.add(title);



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
filename.setBounds(830,475 , 180, 25);
frame.add(filename);

try {
    while(data.next()){
        String user_fname=data.getString("Fullname");
        String user_email=data.getString("EmailAddress");
        String user_contact=data.getString("ContactNumber");
        String user_age=data.getString("Age");
        String user_gender=data.getString("Gender");
        String user_pass=data.getString("PW");
        t1.setText(user_fname);
        t2.setText(user_email);
        t3.setText(user_contact);
        t4.setText(user_age);
        t5.setText(user_pass);
        if(user_gender.equals("Male")){
            r1.setSelected(true);
        }else if(user_gender.equals("Female")){
            r2.setSelected(true);
        }

    }
} catch (Exception e) {
    // TODO: handle exception
}

edit=new JButton("Edit");
edit.setFont(new Font("Times New Roman", Font.BOLD, 17));
edit.setActionCommand("edit");
edit.addActionListener(new ButtonClickListener());
edit.setBounds(735, 525, 150, 30);
frame.add(edit);


 panel=new JPanel();
 panel.setBounds(550, 0, 500, 650);
 panel.setBackground(Color.decode("#ced6e0"));
 frame.add(panel);


    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);


   }
   public static void main(String[] args) {
    new UpdateProfile().UpdateProfileScreen(1);
   }
   private class ButtonClickListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String command=e.getActionCommand();
      if(command.equals("upload")){
        file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int r = file.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION){
          String path=String.valueOf(file.getSelectedFile().getAbsolutePath());
         arr2=new String[path.length()];
         for (int i = 0; i <path.length(); i++) {
          if(String.valueOf(path.charAt(i)).equals("\\")){
            arr2[i]="/";
          }else{
            arr2[i]=String.valueOf(path.charAt(i));

          }
          realpath+=arr2[i];
         } 
         filename.setText(realpath);

}

     }else if(command.equals("edit")){
             String name=t1.getText();
             String email=t2.getText();
             String contact=t3.getText();
             String age=t4.getText();
             String pass=String.valueOf(t5.getPassword());
             String user_gender="";
             if(r1.isSelected()){
              user_gender="Male";
             }else if(r1.isSelected()){
                user_gender="Female";
             }
             String file=filename.getText();
             EditDataModel model=new EditDataModel(user_id,name, email, contact, age, user_gender, file,pass);
             EditDataController con=new EditDataController();
             int result=con.updateData(model);
             if(result==1){
                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
             }else if(result==0){
               JOptionPane.showMessageDialog(null,"Sorry Error!");
             }


             



     }


    }
}





}