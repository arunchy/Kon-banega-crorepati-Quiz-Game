import javax.swing.*;
import java.awt.*;

public class Home {

private JFrame frame3;
private JLabel img1;
private JPanel panel1;
private JButton btn1;
private Icon i1;
  public void Homepage(){
     frame3=new JFrame("Home Page");
     img1= new JLabel();
     img1.setBounds(110, 50, 1800, 700);
     img1.setIcon(new ImageIcon("kbc.jpg"));
    
     i1=new ImageIcon("play.png","Start Game");
     btn1=new JButton(i1);
    //  btn1.setFont(new Font("Times New Roman", Font.BOLD, 30));
     btn1.setBounds(600, 550, 250, 50);
     frame3.add(btn1);

     frame3.add(img1);
      frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame3.setSize(500, 500);
      frame3.getContentPane().setBackground(Color.decode("#2A166D"));
      frame3.setLayout(null);
      frame3.setVisible(true);

    } 

     public static void main(String[] args) {
       Home h1= new Home();
       h1.Homepage();
     }


}
