public class Public{
    public static void main(String args[]){
        Login log = new Login();
        log.password = "abc1234";
        log.showPwd();
    }

}

class Login{
    public String password;
    public void showPwd(){
        System.out.println("Password: " + password);
    }
}