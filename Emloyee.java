public class Emloyee {
    private String userName ="ismail";
    private String password= "1234";

    Emloyee(){};
    Emloyee(String nm,String pswrd){
        userName = nm;
        password = pswrd;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
