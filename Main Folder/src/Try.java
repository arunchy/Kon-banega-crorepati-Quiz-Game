import javax.swing.*;
import java.awt.*;


public class Try {

    private JFrame f1;
    private JTextField t1;
    private JButton btn1;


    public void run(){
        f1=new JFrame();
        t1=new JTextField();
        t1.setBounds(500, 20, 200, 30);
        f1.add(t1);
        btn1=new JButton("Click Here");
        btn1.setBounds(500, 80, 80, 20);
        f1.add(btn1);



        f1.setSize(500,500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Try t1=new Try();
        t1.run(); 
    }
}
