import java.awt.*;
import javax.swing.*;
public class Grid {
    private JFrame f1;
    private JLabel l1;
    private JLabel l2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    public void diaplay(){
        f1=new JFrame();
        f1.setLayout(new BorderLayout(0,0));
        //panel-1
        p1=new JPanel();
        p1.setBounds(10, 10, 250, 250);
        p1.setBackground(Color.RED);
        f1.add(p1,BorderLayout.CENTER);

        //panel-2
        p2=new JPanel();
        p1.setLayout(new BorderLayout(0,0));
        btn1=new JButton("Click Here");
        p2.add(btn1,BorderLayout.CENTER);
        l1=new JLabel();
        l1.setText("Hello world");
        p2.add(l1,BorderLayout.CENTER);
        l2=new JLabel();
        l2.setText("This is another line");
        p2.add(l2,BorderLayout.NORTH);
        p2.setBackground(Color.BLUE);
        f1.add(p2,BorderLayout.NORTH);

        //panel-3
        p3=new JPanel();
        btn2=new JButton("Click Here");
        p3.add(btn2);
        p3.setBackground(Color.CYAN);
        f1.add(p3,BorderLayout.WEST);
       
     
        
        // btn3=new JButton("Click Here");
        // btn4=new JButton("Click Here");
        // btn5=new JButton("Click Here");
        // f1.add(btn1,BorderLayout.NORTH);
        // f1.add(btn2,BorderLayout.SOUTH);
        // f1.add(btn3,BorderLayout.EAST);
        // f1.add(btn4,BorderLayout.SOUTH);
        // f1.add(btn5,BorderLayout.CENTER);
        f1.setSize(300,300);
        f1.setVisible(true);
    } 
}
