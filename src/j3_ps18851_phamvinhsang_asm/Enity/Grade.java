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
public class Grade {
    private String IDStudent;
    private String Name;
    private double English;
    private double Informatic;
    private double Physics;
    private double average;

    public Grade() {
    }

    public Grade(String IDStudent, double English, double Informatic, double Physics, double average) {
        this.IDStudent = IDStudent;
        this.English = English;
        this.Informatic = Informatic;
        this.Physics = Physics;
        this.average = average;
    }

    public Grade(String IDStudent, String Name, double English, double Informatic, double Physics, double average) {
        this.IDStudent = IDStudent;
        this.Name = Name;
        this.English = English;
        this.Informatic = Informatic;
        this.Physics = Physics;
        this.average = average;
    }

    public String getIDStudent() {
        return IDStudent;
    }

    public double getEnglish() {
        return English;
    }

    public double getInformatic() {
        return Informatic;
    }

    public double getPhysics() {
        return Physics;
    }

    public double getAverage() {
        return average;
    }

    public void setIDStudent(String IDStudent) {
        this.IDStudent = IDStudent;
    }

    public void setEnglish(double English) {
        this.English = English;
    }

    public void setInformatic(double Informatic) {
        this.Informatic = Informatic;
    }

    public void setPhysics(double Physics) {
        this.Physics = Physics;
    }

    public void setAverage() {
        this.average = (this.English + this.Informatic + this.Physics)/3;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
