package controller;
import java.sql.ResultSet;

import database.*;
import models.*;
public class UpdateProfileController {
    DbConnection dbConnection;
    public ResultSet fetchData(UpdateProfileModel model){
     int id=model.getId();     
     String query=String.format("SELECT * FROM users WHERE uid=%d",id);
     dbConnection=new DbConnection();
     ResultSet data=dbConnection.retrieve(query);
     return data;

        
    }
}
