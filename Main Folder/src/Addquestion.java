import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controller.*;
import java.sql.ResultSet;
public class Addquestion {
    private JFrame frame;
    private JPanel pal; 
    private JLabel title;
    private JLabel id;
    private JTextField getid;
    private JLabel question;
    private JTextField qus;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JLabel txt4;
    private JTextField opt1;
    private JTextField opt2;
    private JTextField opt3;
    private JTextField opt4;
    private JButton btn1;
    private ResultSet data;
    private int qid;
    private String setid;
    public void screen(){
        UsersController user=new UsersController();
        data=user.questionset();
        try {
            while(data.next()){
                qid=data.getInt("Qid")+1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

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
     

    setid=Integer.toString(qid);
    getid=new JTextField();
    getid.setBounds(590, 120, 150, 30);
    getid.setFont(new Font("Times New Roman", Font.BOLD, 15));
    getid.setText(setid);
    frame.add(getid);

    question=new JLabel("Question");
    question.setFont(new Font("Times New Roman", Font.BOLD, 20));
    question.setBounds(590,160,500,50);
    frame.add(question);

    qus=new JTextField();
    qus.setFont(new Font("Times New Roman", Font.BOLD, 13));
    qus.setBounds(590,200,450,30);
    frame.add(qus);
     
    txt1=new JLabel("Answer");
    txt1.setFont(new Font("Times New Roman", Font.BOLD, 20));
    txt1.setBounds(590, 240, 150, 30);
    frame.add(txt1);
    

    opt1=new JTextField();
    opt1.setFont(new Font("Times New Roman", Font.BOLD, 13));
    opt1.setBounds(590, 270, 300, 30);
    frame.add(opt1);

    txt2=new JLabel("Option 1");
    txt2.setFont(new Font("Times New Roman", Font.BOLD, 20));
    txt2.setBounds(590,310,150,30);
    frame.add(txt2);

    opt2=new JTextField();
    opt2.setFont(new Font("Times New Roman", Font.BOLD, 13));
    opt2.setBounds(590,340,300,30);
    frame.add(opt2);

    txt3=new JLabel("Option 2");
    txt3.setBounds(590, 380, 150, 30);
    txt3.setFont(new Font("Times New Roman", Font.BOLD, 20));
    frame.add(txt3);

    opt3=new JTextField();
    opt3.setFont(new Font("Times New Roman", Font.BOLD, 13));
    opt3.setBounds(590, 410, 300, 30);
    frame.add(opt3);
    
    txt4=new JLabel("Option 3");
    txt4.setBounds(590, 450, 150, 30);
    txt4.setFont(new Font("Times New Roman", Font.BOLD, 20));
    frame.add(txt4);

    opt4=new JTextField();
    opt4.setFont(new Font("Times New Roman", Font.BOLD, 13));
    opt4.setBounds(590, 480, 300, 30);
    frame.add(opt4);

    btn1=new JButton("Done");
    btn1.setActionCommand("done");
    btn1.addActionListener(new ButtonClickListener());
    btn1.setBounds(650, 550, 150, 30);
    frame.add(btn1);



    frame.add(pal);
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
    
    

    }


    public static void main(String[] args) {
        Addquestion hello=new Addquestion();
        hello.screen();
    }
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command=e.getActionCommand();
            if(command.equals("done")){
                int i=Integer.parseInt(getid.getText());
                if(i<=qid-1){
                 UsersController add=new UsersController();
                 int r=add.updatequestion(qus.getText(),opt1.getText(),opt2.getText(),opt3.getText(),opt4.getText(), i);
                 if(r==1){
                    JOptionPane.showMessageDialog(null,"Question Updated Successfully");
                 }else{
                    JOptionPane.showMessageDialog(null,"Error while updating Question");
                 }


                }else if(i>qid-1){
                       UsersController q=new UsersController();
                       int a=q.insertquestion(i, qus.getText(), opt1.getText(), opt2.getText(), opt3.getText(), opt4.getText());
                       if(a == 1){
                        JOptionPane.showMessageDialog(null,"Question Inserted Sucessfully");
                       }else{
                          JOptionPane.showMessageDialog(null,"Errow While inserting Question");
                       }

                }else{

                }

            }else{

            }



        }
    }
}



