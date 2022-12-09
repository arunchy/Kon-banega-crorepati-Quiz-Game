import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
public class Game {
    private JFrame fm;
    private JLabel qus;
    private JPanel bigbox;
    private JPanel box1;
    private JPanel timer;
    private JLabel time;

    private JButton opt1;
    private JButton opt2;
    private JButton opt3;
    private JButton opt4;
    private Timer time1;
    private TimerTask tsk1;
    private JLabel money;
    public void Gamepage(){
     fm=new JFrame();
     qus=new JLabel();
     qus.setText("1.In which part of your body would you find the cruciate ligament?");
     qus.setFont(new Font("Times New Roman", Font.BOLD, 15));
     qus.setForeground(Color.black);
     qus.setBounds(510, 300, 600, 40);
     fm.add(qus);


     box1=new JPanel();
     box1.setBounds(500, 300,600 , 40);
     fm.add(box1);

     opt1=new JButton("Option 1");
     opt1.setBounds(500, 360, 200, 35);
     fm.add(opt1);

     opt2=new JButton("Option 2");
     opt2.setBounds(900, 360, 200, 35);
     fm.add(opt2);

     opt3=new JButton("Option 3");
     opt3.setBounds(500, 420, 200, 35);
     fm.add(opt3);

     opt4=new JButton("Option 4");
     opt4.setBounds(900, 420, 200, 35);
     fm.add(opt4);


     time=new JLabel();
     time.setText("60");
     time.setFont(new Font("Times New Roman", Font.BOLD, 40));
     time.setBounds(780, 190, 100,40);
     time.setForeground(Color.RED);
     fm.add(time);
      
     timer=new JPanel();
     timer.setBounds(750, 160, 100,100 );
     timer.setBackground(Color.WHITE);
     fm.add(timer);
     
     money=new JLabel("Cash win");
     money.setBounds(580, 160, 100, 30);
     money.setFont(new Font("Times New Roman", Font.BOLD, 25));
     money.setForeground(Color.white);
     fm.add(money);

       
    
      

     bigbox=new JPanel();
     bigbox.setBounds(450, 150, 700,520);
     bigbox.setBackground(Color.decode("#8395a7"));
     fm.add(bigbox);
      

     time1=new Timer();
     tsk1=new TimerTask() {
        int count=60;
        String val="";
        @Override
        public void run(){
            
            if(count<10){
                val="0"+count;
            }
            time.setText(""+val);
            count--;
            val=Integer.toString(count);
            if(count<0){
                time1.cancel();
                time1.purge();
                return;
            }
        } 
     };
     time1.schedule(tsk1,5000,1000);
     fm.getContentPane().setBackground(Color.decode("#A020F0"));
     fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fm.setSize(500, 500);
     fm.setLayout(null);
     fm.setVisible(true);   
    }


    public static void main(String[] args) {
        Game game=new Game();
        game.Gamepage();
    }
}
