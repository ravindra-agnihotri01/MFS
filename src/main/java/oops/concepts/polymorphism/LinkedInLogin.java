package oops.concepts.polymorphism;

import javax.print.attribute.standard.RequestingUserName;

public class LinkedInLogin {

    /**
     * method overloading: having method with same name but different combination of parameters in same CLASS
     *
     */

    public void login(String username, String password){

    }


    public void login(String tokenFromGoogle){

    }

    public void login(int secretCodeFromFacebook){

    }

    public  int linkedinKa=11;


}
