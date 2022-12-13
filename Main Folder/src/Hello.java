import javax.swing.*;
import java.awt.*;
import java.net.IDN;
public class Hello {
    private JFrame frame;
    private JPanel pal; 
    private JLabel title;
    private JLabel id;
    private JTextField getid;
    private JLabel question;
    private JTextField qus;
    private JTextField opt1;
    private JTextField opt2;
    private JTextField opt3;
    private JTextField opt4;
    public void screen(){
    frame=new JFrame("Hello");
    pal=new JPanel();
    pal.setBounds(550, 0, 500, 650);
    pal.setBackground(Color.WHITE);
    

    title=new JLabel();
    title.setText("Add Questions");
    title.setFont(new Font("Times New Roman", Font.BOLD, 30));
    title.setBounds(725, 20, 500, 50);
    frame.add(title);
    
    id=new JLabel("Question ID");
    id.setFont(new Font("Times New Roman", Font.BOLD, 20));
    id.setBounds(590, 90, 150, 30);
    frame.add(id);
     
    getid=new JTextField();
    getid.setBounds(590, 120, 150, 30);
    frame.add(getid);

    question=new JLabel("Question");
    question.setFont(new Font("Times New Roman", Font.BOLD, 20));
    question.setBounds(590,160,500,50);
    frame.add(question);

    qus=new JTextField();
    qus.setFont(new Font("Times New Roman", Font.BOLD, 13));
    qus.setBounds(590,200,450,30);
    frame.add(qus);


    frame.add(pal);
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    

    }


    public static void main(String[] args) {
        Hello hello=new Hello();
        hello.screen();
    }
}
