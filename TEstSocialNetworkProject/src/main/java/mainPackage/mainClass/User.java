package mainPackage.mainClass;

public class User {

    private String nameUser;
    private String lastName;
    private String login;
    private String password;


    public User(String[]user){

        if(user.length < 4 || user.length > 4) {
            System.out.println("ERROR_USER_SIN_UP BLOCK[S:14 CLASS: " + getClass() + " ]" );
        }else{
            nameUser = user[0];
            lastName = user[1];
            login = user[2];
            password = user[3];
        }

    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
