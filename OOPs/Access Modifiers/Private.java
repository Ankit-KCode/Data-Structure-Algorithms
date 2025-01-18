public class Private{
    public static void main(String args[]){
        Login log = new Login();
        log.getpass();
    }
}

class Login{
    private String password = "abc1234";

    private void showPwd(){
        System.out.println("Password: " + password);
    }

    public void getpass(){
        showPwd();
    }
}