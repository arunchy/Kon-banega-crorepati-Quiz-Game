import javax.swing.*;
import java.awt.*;
public class Image {
     private JFrame frame;
     private JButton btn;
     private JLabel label1;
     private JLabel label2;
     private JLabel label3;
     private JLabel label4;
     private JLabel label5;
     private JLabel label6;
     private JLabel label7;
     private JLabel label8;
     private JLabel label9;
     private JLabel label10;
     private JLabel label11;
     private JLabel label12;
     private JLabel label13;
     private JLabel label14;
     private JLabel label15;
     private JLabel label16;
     private JLabel label17;
     private JLabel label18;
     private JLabel label19;
     private JLabel label20;
     private JLabel label21;
     private JLabel label22;
     private JLabel label23;
     private JLabel label24;
     private JLabel label25;
     private JPanel panel;

        public void Iamgeview(){
      frame=new JFrame();

      label1=new JLabel();
      ImageIcon i1=new ImageIcon("logo.gif");
      label1.setIcon(i1);
      frame.add(label1);

  

      frame.setSize(600, 600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(null);
      frame.setVisible(true);




        }

        public static void main(String[] args) {
            Image i1=new Image();
            i1.Iamgeview();
        }
}
