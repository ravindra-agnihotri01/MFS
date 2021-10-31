package oops.concepts.encapsulation;

public class Ravindra {

    public static void main(String[] args) {
        SayaliHome sayaliHome= new SayaliHome();
        System.out.println( sayaliHome.getSayaliAccountBalance());
        sayaliHome.setSayaliAccountBalance(20);
        System.out.println(sayaliHome.getSayaliAccountBalance());
    }
}
