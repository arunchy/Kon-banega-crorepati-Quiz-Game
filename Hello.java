import javax.swing.*;
import java.awt.*;
public class Hello {
    private JFrame frame;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JPanel panel1;
    private JPanel panel2;
    public void hello(){
       frame=new JFrame();
       frame.setLayout(new FlowLayout(FlowLayout.RIGHT,20,25));
    //    btn1=new JButton("Button1");
    //    btn2=new JButton("Button2");
    //    btn3=new JButton("Button3");
    //    btn4=new JButton("Button4");
    //    btn5=new JButton("Button5");
    //    frame.add(btn1);
    //    frame.add(btn2);
    //    frame.add(btn3);
    //    frame.add(btn4);
    //    frame.add(btn5);
    panel1=new JPanel();
    panel1.setBackground(Color.RED);
    panel1.setBounds(0, 0, 300, 300);
    frame.add(panel1);

       frame.setSize(400,400);
       frame.setVisible(true);

    }
    public static void main(String[] args) {
        Hello hel=new Hello();
        hel.hello();
    }
}
