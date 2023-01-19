package models;

public class EditDataModel {
    private int id;
    private String fname;
    private String email;
    private String contact;
    private String age;
    private String gender;
    private String filename;
    private String password;
    public EditDataModel(int id,String fname,String email,String contact,String age,String gender,String filename,String password){
        this.id=id;
        this.fname=fname;
        this.email=email;
        this.contact=contact;
        this.age=age;
        this.gender=gender;
        this.filename=filename;
        this.password=password;

    }
    public String getPassword() {
        return password;
    }
    public String getFname() {
        return fname;
    }
    public String getEmail() {
        return email;
    }
    public String getAge() {
        return age;
    }
    public String getContact() {
        return contact;
    }
    public String getGender() {
        return gender;
    }
    public String getFilename() {
        return filename;
    }
    public int getId() {
        return id;
    }
    
}
