// This is a Custom Exception made by me

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be -ve";
    }
    @Override
    public String getMessage(){
        return "Negative Radius !!";
    }
}

public class Exeption_Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result =Math.PI*r*r;
        return result;

    }
    public static void main(String[] args) {
      try{
          double res1=area (-9);
          System.out.println(res1);
      }
      catch (Exception e)
      {
          System.out.println(e);
      }
    }
}
