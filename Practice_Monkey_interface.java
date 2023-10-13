class Monkey{
    public void Jump(){
        System.out.println("Jump Jump !! ");
    }
    public void Bite(){
        System.out.println("If you tease me , I will bite you");
    }
}


interface BasicAnimal{
     void eat();
     void sleep();
}

class Human extends Monkey implements BasicAnimal{
   public  void eat(){
        System.out.println("I am Eating my food now");
    }
    public void sleep(){
        System.out.println("I am Sleeping now");
    }
}





public class Practice_Monkey_interface {
    public static void main(String[] args) {
 BasicAnimal ba = new Human();
 ba.eat();
 Human h1= new Human();
 h1.sleep();
 h1.Bite();
 h1.Jump();
    }
}
