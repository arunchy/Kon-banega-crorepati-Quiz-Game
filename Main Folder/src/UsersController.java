import java.sql.ResultSet;


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
        String insertQuery = String.format("insert into users(uid,Fullname,EmailAddress,ContactNumber,Age,Gender,PW,PP) values(%d,'%s','%s','%s','%s','%s','%s','%s')", id,name,email,contact,age,gender,password,profilepic);
        System.out.println(insertQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    // public int updateStudent(Users users) {
    //     int id = users.getstd_id();
    //     String name = users.getStd_name();
        //  String updateQuery = String.format(
        //         "update tbl_student set std_name='%s' where std_id = %d", name, id);
    //     dbConnection = new DbConnection();
    //     int result = dbConnection.manipulate(updateQuery);
    //     return result;
    // }
    public ResultSet fetchdata(String email,String password){
        String query=String.format("SELECT * FROM users WHERE EmailAddress='%s' AND PW='%s'",email,password );
        dbConnection=new DbConnection();
        ResultSet data=dbConnection.retrieve(query);
        return data;
    }

}