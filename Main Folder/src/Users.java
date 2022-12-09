public class Users{
    // creation of instance variable
    private int user_id;
    private String user_fname;
    private String user_email;
    private String user_contact;
    private String user_age;
    private String user_gender;
    private String user_Password;
    private String user_profilepic;

    // creation of public getter and setter --> for student ID
	public int getUser_id() {
		return this.user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

    // creation of public getter and setter --> for student Name
	public String getUser_fname() {
		return this.user_fname;
	}

	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}

    // creation of public getter and setter --> for student Age
	
    // creation of public getter and setter --> for student Address
	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

    // creation of public getter and setter --> for student Contact
	public String getUser_contact() {
		return this.user_contact;
	}

	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_age() {
		return this.user_age;
	}

	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}

    public String getUser_gender(){
          return this.user_gender;
	}
    public void setUser_gender(String user_gender){
      this.user_gender=user_gender;
	}
	public String getUser_password(){
		return this.user_Password;
	}
	public void setUser_password(String user_password ){
      this.user_Password=user_password;
	}
	public String getUser_profilepic(){
		return this.user_profilepic;
	}
	public void setUser_profilepic(String user_profilepic){
      this.user_profilepic=user_profilepic;
	}
    // creation of public constructor
    public Users(int user_id, String user_fname,String user_email, String user_contact,String user_age,String user_gender,String user_password,String user_profilepic){
        this.user_id = user_id;
        this.user_fname = user_fname;
		this.user_email = user_email;
		this.user_contact = user_contact;
        this.user_age = user_age;
        this.user_gender =user_gender;
        this.user_Password = user_password;
		this.user_profilepic=user_profilepic;
    }


   

}