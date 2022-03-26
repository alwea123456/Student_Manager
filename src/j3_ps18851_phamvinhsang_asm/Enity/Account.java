/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3_ps18851_phamvinhsang_asm.Enity;

/**
 *
 * @author Sang
 */
public class Account {
    private String user_name;
    private String password;
    private int role;

    public Account() {
    }

    public Account(String user_name, String password, int role) {
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
