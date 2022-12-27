package controller;
import java.sql.ResultSet;

import database.*;
import models.*;

public class UsersController {
    DbConnection dbConnection;

    public int insertusers(Users users) {
        int id = users.getUser_id();
        String name = users.getUser_fname();
        String email = users.getUser_email();
        String age = users.getUser_age();
        String contact = users.getUser_contact();
        String gender = users.getUser_gender();
        String password = users.getUser_password();
        String profilepic=users.getUser_profilepic();
        int win=users.getWin();
        int cash=users.getCash();
        String insertQuery = String.format("insert into users(uid,Fullname,EmailAddress,ContactNumber,Age,Gender,PW,PP,Win,Cash) values(%d,'%s','%s','%s','%s','%s','%s','%s',%d,%d)", id,name,email,contact,age,gender,password,profilepic,win,cash);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

public ResultSet fetchdata(String email,String password){
        String query=String.format("SELECT * FROM users WHERE EmailAddress='%s' AND PW='%s'",email,password );
        dbConnection=new DbConnection();
        ResultSet data=dbConnection.retrieve(query);
        return data;
    }
    public ResultSet fetchquestion(int id){
        String query=String.format("SELECT * FROM questions WHERE Qid=%d",id);
        dbConnection=new DbConnection();
        ResultSet data=dbConnection.retrieve(query);
        return data;
    }
    public int updatescore(int win,int cash,int id){
        String query=String.format("UPDATE users SET Win=Win+%d,Cash=Cash+%d  WHERE uid=%d",win,cash,id);
        dbConnection=new DbConnection();
        int data=dbConnection.manipulate(query);
        return data;
    }
    public ResultSet questionset(){
        String query=String.format("SELECT * FROM questions ORDER BY Qid DESC LIMIT %d",1);
        dbConnection=new DbConnection();
        ResultSet data=dbConnection.retrieve(query);
        return data;
    }
    public int updatequestion(String qus,String ans,String ans2,String ans3,String ans4,int id){
      String query=String.format("UPDATE questions SET Questions='%s',Answer='%s',Answer1='%s',Answer2='%s',Answer3='%s' WHERE Qid=%d",qus,ans,ans2,ans3,ans4,id);
      dbConnection=new DbConnection();
      int data=dbConnection.manipulate(query);
      return data;

    }
    public int insertquestion(int id,String qus,String ans,String ans2,String ans3,String ans4){
        String query=String.format("insert into questions(Qid,Questions,Answer,Answer1,Answer2,Answer3) values(%d,'%s','%s','%s','%s','%s')",id,qus,ans,ans2,ans3,ans4);
        dbConnection=new DbConnection();
        int data=dbConnection.manipulate(query);
        return data;
    }
    public ResultSet showquestions(){
        String query=String.format("SELECT * FROM questions");
        dbConnection=new DbConnection();
      ResultSet data=dbConnection.retrieve(query);
      return data;

    }
}