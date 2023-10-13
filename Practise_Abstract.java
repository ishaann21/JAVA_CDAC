
abstract class Effective_communication{
    abstract void write();
    abstract void speak();

}

class Session extends Effective_communication{
     public void write(){
        System.out.println("You have to write good english in order to get placed   ");
    }
     public void speak(){
       System.out.println("You have to speak good english in order to get placed   ");
    }
}

public class Practise_Abstract {
    public static void main(String[] args) {
        Session s1 = new Session();
        s1.speak();
        s1.write();



    }


}





