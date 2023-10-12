interface Cycle{
    int a=45;
    public void horn();
    public void brake();

}

class CycleMethods implements Cycle{
    public void horn(){
        System.out.println("Horn Pressed , Pee pee ");

    }
    public void brake (){
        System.out.println("Brakes Applied");
    }
}




public class InterfaceBasic {
    public static void main(String[] args) {
        CycleMethods c = new CycleMethods();
        c.brake();
        c.horn();
        System.out.println(c.a);
        //Cycle c1 = new Cycle();   This will Throw Error.


    }
}