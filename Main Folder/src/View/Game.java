package View;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import controller.*;

public class Game {
    private JFrame fm;
    private JLabel qus;
    private JPanel bigbox;
    private JPanel box1;
    private JLabel timer;
    private JLabel time;
    private JButton opt1;
    private JButton opt2;
    private JButton opt3;
    private JButton opt4;
    private Timer time1;
    private TimerTask tsk1;
    private JLabel money;
    private JButton next;
    private JLabel total;
    private UsersController question;
    private ResultSet data;
    private String qus1;
    private int qid;
    private String fullqus;
    private String ans;
    private String ans1;
    private String ans2;
    private String ans3;
    private String str1;
    private String str2;
    private String str3;
    private String str4;
    ArrayList<String> option=new ArrayList<String>();
    Random ran;
    private JLabel wall1;
    private JLabel wall2;
    private JLabel wall3;
    private JLabel wall4;
    private JLabel correct;
    private JLabel wrong;
    private JLabel err1;
    private JLabel err2;
    private JLabel err3;
    private JLabel err4;
    private JLabel timeout1;
    private JLabel timeout2;
    private JLabel timeout3;
    private JLabel timeout4;
    private int cash=0;
    private String str;
    private int id=1;
    private Clip clip1;
    private AudioInputStream sound1;
    private File audio1;
    private Clip clip2;
    private AudioInputStream sound2;
    private File audio2;
    private Clip clip3;
    private AudioInputStream sound3;
    private File audio3;
    private int userid;
    public int win=0;
    private File imagename;
    private File soundname;
    private String soundpath="";
    public void Gamepage(int uid){
        userid=uid;
        try{
            question=new UsersController();
            data=question.fetchquestion(id); 
            while(data.next()){
                qus1=data.getString("Questions");
                qid=data.getInt("Qid");
                fullqus=qid+". "+qus1;
                ran=new Random();
                ans=data.getString("Answer");
                ans1=data.getString("Answer1");
                ans2=data.getString("Answer2");
                ans3=data.getString("Answer3");
                option.add(ans);
                option.add(ans1);
                option.add(ans2);
                option.add(ans3);
                option.sort(null);
        

            }
        }
        catch(Exception err){
            err.printStackTrace();
        }
           str1=option.get(0);
           str2=option.get(1);
           str3=option.get(2);
           str4=option.get(3);
           
           imagename=new File("");
           String absolutepath=imagename.getAbsolutePath();
           String[] arr=new String[absolutepath.length()];
           String getpath="";
           for(int i=0;i<=absolutepath.length()-1;i++){
             if(String.valueOf(absolutepath.charAt(i)).equals("\\")){
               arr[i]="/";
           
             }else{
               arr[i]=String.valueOf(absolutepath.charAt(i));
           
             }
              getpath+=arr[i];
              
           }
           getpath+="/src/Images/";





           soundname=new File("");
    String sound=soundname.getAbsolutePath();
    String[] arr2=new String[sound.length()];
    for (int i = 0; i <= sound.length()-1; i++) {
      if(String.valueOf(sound.charAt(i)).equals("\\")){
        arr2[i]="/";
      }else{
        arr2[i]=String.valueOf(sound.charAt(i));
      }
      soundpath+=arr2[i];
    }
    soundpath+="/src/sounds/";

     fm=new JFrame("Game page");
     correct=new JLabel();
     correct.setIcon(new ImageIcon(new ImageIcon(getpath+"correct.gif").getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
     correct.setBounds(700, 580,180, 180);
     correct.setVisible(false);
     fm.add(correct);




     wrong=new JLabel();
     wrong.setIcon(new ImageIcon(new ImageIcon(getpath+"wrong.gif").getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT)));
     wrong.setBounds(700, 580,180, 180);
     wrong.setVisible(false);
     fm.add(wrong);

     qus=new JLabel();
     qus.setText(fullqus);
    
    
     qus.setFont(new Font("Times New Roman", Font.BOLD, 15));
     qus.setForeground(Color.black);
     qus.setBounds(510, 300, 600, 40);
     fm.add(qus);


     box1=new JPanel();
     box1.setBounds(500, 300,600 , 40);
     fm.add(box1);

     opt1=new JButton(str1);
     opt1.setBounds(500, 360, 200, 35);
     opt1.setFont(new Font("Times New Roman", Font.BOLD, 15));
     opt1.setActionCommand("opt1");
     opt1.addActionListener(new ButtonClickListener());
     fm.add(opt1);

     opt2=new JButton(str2);
     opt2.setFont(new Font("Times New Roman", Font.BOLD, 15));
     opt2.setActionCommand("opt2");
     opt2.addActionListener(new ButtonClickListener());
     opt2.setBounds(900, 360, 200, 35);
     fm.add(opt2);

     opt3=new JButton(str3);
     opt3.setFont(new Font("Times New Roman", Font.BOLD, 15));
     opt3.setActionCommand("opt3");
     opt3.addActionListener(new ButtonClickListener());
     opt3.setBounds(500, 420, 200, 35);
     fm.add(opt3);

     opt4=new JButton(str4);
     opt4.setFont(new Font("Times New Roman", Font.BOLD, 15));
     opt4.setActionCommand("opt4");
     opt4.addActionListener(new ButtonClickListener());
     opt4.setBounds(900, 420, 200, 35);
     fm.add(opt4);

     
     time=new JLabel();
     time.setFont(new Font("Times New Roman", Font.BOLD, 30));
     time.setBounds(805, 180, 100,40);
     fm.add(time);
      
     timer=new JLabel();
     timer.setIcon(new ImageIcon(new ImageIcon(getpath+"time.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
     timer.setBounds(750, 170,50, 50);
     fm.add(timer);
     
  
     wall1=new JLabel();
     wall1.setIcon(new ImageIcon(getpath+"giphy.gif"));
     wall1.setBounds(0, 0,450, 400);
     wall1.setVisible(false);
     fm.add(wall1);

     wall2=new JLabel();
     wall2.setIcon(new ImageIcon(getpath+"giphy.gif"));
     wall2.setBounds(0, 400,450, 400);
     wall2.setVisible(false);
     fm.add(wall2);

     wall3=new JLabel();
     wall3.setIcon(new ImageIcon(getpath+"giphy.gif"));
     wall3.setBounds(1150, 0,400, 400);
     wall3.setVisible(false);
     fm.add(wall3);


     wall4=new JLabel();
     wall4.setIcon(new ImageIcon(getpath+"giphy.gif"));
     wall4.setBounds(1150, 400,400, 400);
     wall4.setVisible(false);
     fm.add(wall4);

     err1=new JLabel();
     err1.setIcon(new ImageIcon(getpath+"error.gif"));
     err1.setBounds(0, 0,450, 400);
     err1.setVisible(false);
     fm.add(err1);

     err2=new JLabel();
     err2.setIcon(new ImageIcon(getpath+"error.gif"));
     err2.setBounds(0, 400,450, 400);
     err2.setVisible(false);
     fm.add(err2);

     err3=new JLabel();
     err3.setIcon(new ImageIcon(getpath+"error.gif"));
     err3.setBounds(1150, 0,450, 400);
     err3.setVisible(false);
     fm.add(err3);

     err4=new JLabel();
     err4.setIcon(new ImageIcon(getpath+"error.gif"));
     err4.setBounds(1150, 400,450, 400);
     err4.setVisible(false);
     fm.add(err4);

     timeout1=new JLabel();
     timeout1.setIcon(new ImageIcon(getpath+"timeout.gif"));
     timeout1.setBounds(1150, 400,450, 400);
     timeout1.setVisible(false);
     fm.add(timeout1);


     timeout2=new JLabel();
     timeout2.setIcon(new ImageIcon(getpath+"timeout.gif"));
     timeout2.setBounds(1150, 0,450, 400);
     timeout2.setVisible(false);
     fm.add(timeout2);


     timeout3=new JLabel();
     timeout3.setIcon(new ImageIcon(getpath+"timeout.gif"));
     timeout3.setBounds(0, 400,450, 400);
     timeout3.setVisible(false);
     fm.add(timeout3);


     timeout4=new JLabel();
     timeout4.setIcon(new ImageIcon(getpath+"timeout.gif"));
     timeout4.setBounds(0, 0,450, 400);
     timeout4.setVisible(false);
     fm.add(timeout4);
       


     
      
     next=new JButton("Next");
     next.setBounds(720,500, 150, 30);
     next.setActionCommand("next");
     next.addActionListener(new ButtonClickListener());
     next.setVisible(false);
     fm.add(next);

     money=new JLabel();
     money.setIcon(new ImageIcon(new ImageIcon(getpath+"money.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
     money.setBounds(520, 170,50, 50);
     fm.add(money);
     
     str=Integer.toString(cash);
     total=new JLabel();
     total.setText(str);
     total.setFont(new Font("Times New Roman", Font.BOLD, 25));
     total.setBounds(570, 180, 80, 30);
     fm.add(total);

     bigbox=new JPanel();
     bigbox.setBounds(450, 150, 700,520);
     bigbox.setBackground(Color.decode("#8395a7"));
     fm.add(bigbox);

     
   try {
    audio3 = new File(soundpath+"timeout.wav").getAbsoluteFile();
    sound3 = AudioSystem.getAudioInputStream(audio3);
    clip3= AudioSystem.getClip();
    clip3.open(sound3);
    
   } catch (Exception e) {
    e.printStackTrace();
   }
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
                timeout1.setVisible(true);
                timeout2.setVisible(true);
                timeout3.setVisible(true);
                timeout4.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip3.start();
                
                return;
            }
        } 
     };
     time1.schedule(tsk1,5000,1000);


   try {
    audio1 = new File(soundpath+"wrong.wav").getAbsoluteFile();
    sound1 = AudioSystem.getAudioInputStream(audio1);
    clip1 = AudioSystem.getClip();
    clip1.open(sound1);
    
   } catch (Exception e) {
    e.printStackTrace();
   }

   try {
    audio2 = new File(soundpath+"congratulation.wav").getAbsoluteFile();
    sound2 = AudioSystem.getAudioInputStream(audio2);
    clip2 = AudioSystem.getClip();
    clip2.open(sound2);
    
   } catch (Exception e) {
    e.printStackTrace();
   }
 

     fm.getContentPane().setBackground(Color.decode("#A020F0"));
     fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fm.setSize(500, 500);
     fm.setLayout(null);
     fm.setVisible(true);   
    }


    public static void main(String[] args) {
        Game game=new Game();
        game.Gamepage(1);
    }


    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
        String command=e.getActionCommand();
        if(command.equals("opt1")){
            String result=opt1.getText();
            if(result == ans){
               
                cash+=1000;
                win+=1;
                UsersController user=new UsersController();
                 user.updatescore(win,cash,userid);
                str=Integer.toString(cash);
                total.setText(str);
                wall1.setVisible(true);
                wall2.setVisible(true);
                wall3.setVisible(true);
                wall4.setVisible(true);
                correct.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip2.start();
                
            }else{
                err1.setVisible(true);
                err2.setVisible(true);
                err3.setVisible(true);
                err4.setVisible(true);
                wrong.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip1.start(); 


            }


        }
        else if(command.equals("opt2")){
            String result=opt2.getText();
            if(result == ans){
                
                cash+=1000;
                win+=1;
                UsersController user=new UsersController();
                 user.updatescore(win,cash,userid);
                str=Integer.toString(cash);
                total.setText(str);
                wall1.setVisible(true);
                wall2.setVisible(true);
                wall3.setVisible(true);
                wall4.setVisible(true);
                correct.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip2.start();
               
                
            }else{
                err1.setVisible(true);
                err2.setVisible(true);
                err3.setVisible(true);
                err4.setVisible(true);
                wrong.setVisible(true);
                next.setVisible(true); 
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip1.start(); 

            }





                
        }
        else if(command.equals("opt3")){
            String result=opt3.getText();
            if(result == ans){
               
                cash+=1000;
                win+=1;
                UsersController user=new UsersController();
                user.updatescore(win,cash,userid);
                str=Integer.toString(cash);
                total.setText(str);
                clip2.start();
                wall1.setVisible(true);
                wall2.setVisible(true);
                wall3.setVisible(true);
                wall4.setVisible(true);
                correct.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
               
               
                
            }else{
                
                err1.setVisible(true);
                err2.setVisible(true);
                err3.setVisible(true);
                err4.setVisible(true);
                wrong.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip1.start(); 
            }


        }else if(command.equals("opt4")){
            String result=opt4.getText();
            if(result == ans){
               
                cash+=1000;
                win+=1;
                UsersController user=new UsersController();
                 user.updatescore(win,cash,userid);
                str=Integer.toString(cash);
                total.setText(str);
                wall1.setVisible(true);
                wall2.setVisible(true);
                wall3.setVisible(true);
                wall4.setVisible(true);
                correct.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip2.start();
                
            }else{
                
                err1.setVisible(true);
                err2.setVisible(true);
                err3.setVisible(true);
                err4.setVisible(true);
                wrong.setVisible(true);
                next.setVisible(true);
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                opt4.setEnabled(false);
                clip1.start(); 
            }
        }
        else if(command.equals("next")){
            System.out.println("next clicked");
            wall1.setVisible(false);
            wall2.setVisible(false);
            wall3.setVisible(false);
            wall4.setVisible(false);
            correct.setVisible(false);
            err1.setVisible(false);
            err2.setVisible(false);
            err3.setVisible(false);
            err4.setVisible(false);
            wrong.setVisible(false);

            id+=1;
            try{
                question=new UsersController();
                data=question.fetchquestion(id); 
                while(data.next()){
                    qus1=data.getString("Questions");
                    qid=data.getInt("Qid");
                    fullqus=qid+". "+qus1;
                    ran=new Random();
                    ans=data.getString("Answer");
                    ans1=data.getString("Answer1");
                    ans2=data.getString("Answer2");
                    ans3=data.getString("Answer3");
                    option.add(ans);
                    option.add(ans1);
                    option.add(ans2);
                    option.add(ans3);
                    option.sort(null);
            
    
                }
            }
            catch(Exception err){
                err.printStackTrace();
            }
               str1=option.get(0);
               str2=option.get(1);
               str3=option.get(2);
               str4=option.get(3);
               
               qus.setText(fullqus);
               opt1.setText(str1);
               opt2.setText(str2);
               opt3.setText(str3);
               opt4.setText(str4);

               opt1.setEnabled(true);
               opt2.setEnabled(true);
               opt3.setEnabled(true);
               opt4.setEnabled(true);
               option.clear();


        }
        else{
          
        }





        }
    }






}
