class A{
    public void dmdMethod(){
        System.out.println("This is A's method : -  ");
    }
}
class B extends A{
    @Override
    public void dmdMethod(){
        System.out.println("This is B's Method : -");
    }
}




public class DynamicMethodDispatch {
    public static void main(String[] args) {


        A a1 = new B(); // a1 is reference pointing to the object of B
        a1.dmdMethod();
    }
}
