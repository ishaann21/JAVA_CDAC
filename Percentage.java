import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of the English out  of 100 :- ");
        double eng=sc.nextDouble();
//        boolean b1=sc.hasNextDouble();
//        System.out.println(b1);
        System.out.println("Enter the marks of the Maths out  of 100 :- ");
        double maths=sc.nextDouble();
        System.out.println("Enter the marks of the Physics out  of 100 :- ");
        double physics=sc.nextDouble();
        System.out.println("Enter the marks of the Chemistry out  of 100 :- ");
        double chem=sc.nextDouble();
        System.out.println("Enter the marks of the Biology out  of 100 :- ");
        double biology=sc.nextDouble();
        double percentage=((eng+maths+physics+chem+biology)/5);
        System.out.println("The Percentage of the Student is : "+percentage);

    }
}
