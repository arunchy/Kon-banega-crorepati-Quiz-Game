package controller;


import database.*;
import models.*;
public class EditDataController {
    DbConnection dbConnection;
    public int updateData(EditDataModel model){
      int id=model.getId();
      String fname=model.getFname();
      String email=model.getEmail();
      String contact=model.getContact();
      String age=model.getAge();
      String gender=model.getGender();
      String password=model.getPassword();
      String filename=model.getFilename();
      String query=String.format("UPDATE users SET Fullname='%s', EmailAddress='%s', ContactNumber='%s', Age='%s', Gender='%s', PW='%s', PP='%s' WHERE uid=%d",fname,email,contact,age,gender,password,filename,id);
      dbConnection=new DbConnection();
      int data=dbConnection.manipulate(query);
      return data;
    }
}
