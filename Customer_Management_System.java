import java.time.LocalDate;
import java.util.Scanner;

class NoDuplicateCustomer extends Exception{
    @Override
    public String toString(){
        return "Customer already exists  !!";

    }
}
class Customer{
    int customer_id;
    String Fname;
    String Lname;
    String Password;
    String Email;
    double RegistrationAmount;
    LocalDate DOB;
    static int idGenerator=0;

    void SignUp(int customer_id,String Fname,String Lname,String Password,String Email
   ,double RegistrationAmount,LocalDate DOB){
       this.customer_id=customer_id;
       this.Fname=Fname;
       this.Lname=Lname;
       this.Password=Password;
       this.Email=Email;
       this.RegistrationAmount=RegistrationAmount;
       this.DOB=DOB;
       idGenerator++;


   }
   public void SignIn(String Email,String Password){



   }

}


public class Customer_Management_System {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    }
}
