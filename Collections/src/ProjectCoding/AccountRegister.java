package ProjectCoding;

public class AccountRegister {

    private String emaileAdd;
    private String userName;
    private String password;

    public String getEmaileAdd() {
        return emaileAdd;
    }

    public void setEmaileAdd(String emaileAdd) {
        this.emaileAdd = emaileAdd;
        if(emaileAdd.contains("yahoo")){
            System.out.println("correct emaile address entered!");
        }else {
            System.out.println("Please a valid email address  enter a yahoo one");
        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if(userName.length()<6){
            System.out.println("User name must be more than 6 ch");
        }else {
            System.out.println("valid user name");
        }
    }
    void printInfo(){
        System.out.println("the full account inforamtion is "+this.emaileAdd+"username"+this.userName+"passweod"+this.password.replaceAll("[A-Z,a-z,!@#%^&*(]","*"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if(password.length()<6){
            System.out.println("passwoerd must be 6 charctoer");
        } else if (password.contains(userName)) {
            System.out.println("Pasword can not contain user name");

        }else {
            System.out.println("passwored is accepted");
        }
    }

    public static void main(String[] args) {
        AccountRegister accountRegister=new AccountRegister();
        accountRegister.setEmaileAdd("tarshi2022@yahoo.com");
        accountRegister.setUserName("mujahid321");
        accountRegister.setPassword("kabul123");
        accountRegister.printInfo();
    }
}
