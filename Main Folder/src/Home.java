import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import controller.*;
public class Home {
private JFrame frame3;
private JButton btn1;
private JButton btn2;
private JButton btn3;
private Icon i1;
private Icon i2;
private Icon i3;
private JLabel name;
private JButton logout;
private JLabel txt1;
private JLabel txt2;
private JLabel wall;
private JLabel img2;
private JLabel img3;
private JLabel pp;
private UsersController user;
private ResultSet data; 
private int cash;
private int win;
private String uname;
private int id;

  public void Homepage(String email,String pass){

      user=new UsersController();
      data=user.fetchdata(email,pass);
     try {
      while(data.next()){
      cash=data.getInt("Cash");
      win=data.getInt("Win");
      uname=data.getString("Fullname");
      id=data.getInt("uid");
    } 
    } catch (SQLException e) {
      e.printStackTrace();
    }
     

      String cash1=String.valueOf(cash);
      String win1=String.valueOf(win);


     frame3=new JFrame("Home Page");



     i1=new ImageIcon("play3.gif");
     i2=new ImageIcon("cash.png");
     i3=new ImageIcon("trophy.png");

     btn1=new JButton(i1);
     btn1.setBounds(780, 600, 100, 100);
     btn1.setActionCommand("signup");
     btn1.addActionListener(new ButtonClickListener());
     frame3.add(btn1);


     btn2=new JButton(i2);
     btn2.setBounds(700, 420, 80, 80);
     frame3.add(btn2);
     txt1=new JLabel();
     txt1.setText(cash1);
     txt1.setFont(new Font("Times New Roman", Font.BOLD, 25));
     txt1.setForeground(Color.WHITE);
     txt1.setBounds(710, 500, 200, 30);
     frame3.add(txt1);

     btn3=new JButton(i3);
     btn3.setBounds(880, 420, 80, 80);
     frame3.add(btn3);
     
     txt2=new JLabel();
     txt2.setText(win1);
     txt2.setFont(new Font("Times New Roman", Font.BOLD, 25));
     txt2.setForeground(Color.WHITE);
     txt2.setBounds(900, 500, 200, 30);
     frame3.add(txt2);

 

 

      wall=new JLabel();
      wall.setIcon(new ImageIcon("wall3.jpg"));
      wall.setBounds(0, 0,1600, 800);

     pp=new JLabel();
     pp.setIcon(new ImageIcon(new ImageIcon("face.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
     pp.setBounds(700, 10,250, 250);
     pp.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
     

     name=new JLabel();
     name.setText(uname);
     name.setFont(new Font("Times New Roman", Font.BOLD, 25));
     name.setForeground(Color.WHITE);
     name.setBounds(730, 270, 280, 30);
     frame3.add(name);
     


     img2=new JLabel();
     img2.setIcon(new ImageIcon("kbc.jpg"));
     img2.setBounds(0, 0,550, 800);
     
     
     img3=new JLabel();
     img3.setIcon(new ImageIcon("kbc.jpg"));
     img3.setBounds(1050, 0,550, 800);



     

     logout=new JButton("Log Out");
     logout.setBackground(Color.red);
     logout.setBounds(1400, 12, 80, 25);
     frame3.add(logout);
     frame3.add(pp);
     frame3.add(wall);
   

      frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame3.setSize(500, 500);
      frame3.getContentPane().setBackground(Color.decode("#A020F0"));
      frame3.setLayout(null);
      frame3.setVisible(true);

    } 

     public static void main(String[] args) {
       Home h1= new Home();
       h1.Homepage("arunchy600@gmail.com","123456");
     }
     private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
      Game game=new Game();
     game.Gamepage(id);

      }
    }


}
