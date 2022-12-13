import javax.swing.*;
import java.awt.*;

public class Question {
    private JFrame f2;
    
    
    public void questionpage(){
    f2=new JFrame();
     f2.setSize(500,500);
     f2.setVisible(true);
     f2.setLayout(null);
     f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Question qus=new Question();
        qus.questionpage();
    }
}
