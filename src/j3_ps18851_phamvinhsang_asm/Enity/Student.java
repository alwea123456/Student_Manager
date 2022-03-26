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
public class Student {
    private String id;
    private String Name;
    private String email;
    private String phone;
    private String address;
    private boolean gender;
    private String image;
    public Student() {
    }

    public Student(String id, String Name, String email, String phone, String address, boolean gender, String image) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.image = image;
    }

    public Student(String text, String text0, String text1, String text2, boolean b, String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Student(String text, String text0, String text1, String text2, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public boolean getGender() {
        return gender;
    }
    public void setGender() {
        this.gender = gender;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
