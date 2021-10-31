package oops.concepts.encapsulation;

import oops.concepts.polymorphism.LinkedInLogin;

public class SayaliHome extends LinkedInLogin {

    /**
     * having a private data member in my class which cannot be accessed outside as its private
     * and makeing a private variable value to be accessed outside by getter and setter method
     */

    private int sayaliAccountBalance= 100000;

    public int linkedinKa=000;

    public int getSayaliAccountBalance() {
        return sayaliAccountBalance;
    }

    public void setSayaliAccountBalance(int raviPaiseDiye) {
        this.sayaliAccountBalance = raviPaiseDiye;
    }

    public void sayaliAai(){
        System.out.println(super.linkedinKa);
    }

    public static void main(String[] args) {
        SayaliHome sayaliHome= new SayaliHome();
        sayaliHome.sayaliAai();
    }

    public void sayaliBaba(){

        System.out.println(sayaliAccountBalance);

    }

    public static void sayaliBhau(){
        SayaliHome sayaliHome= new SayaliHome();
        System.out.println( sayaliHome.sayaliAccountBalance);

    }
}
