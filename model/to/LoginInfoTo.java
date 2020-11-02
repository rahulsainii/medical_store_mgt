
package model.to;

import java.sql.Timestamp;

public class LoginInfoTo {
    private String user_name;
    private String password_set;
    private String role_name;
    private Timestamp last_login;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword_set() {
        return password_set;
    }

    public void setPassword_set(String password_set) {
        this.password_set = password_set;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }
    public String toString()
    {
        String info=user_name;
        return info;
    }
   
    
}
