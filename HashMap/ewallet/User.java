package ewallet;

/**
 * User
 */
public class User {
    int _userId;
    String _username,_email,_password;

    public void addUser(int userId,String username,String password,String email) {
        set_userId(userId);
        set_username(username);
        set_password(password);
        set_email(email);
        System.out.println("User Added");
    }

    public int get_userId() {
        return _userId;
    }

    public void set_userId(int _userId) {
        this._userId = _userId;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }
}