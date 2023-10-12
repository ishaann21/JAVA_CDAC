import java.util.Scanner;

class Employee{
    int salary;
    String name;

    public void setSalary(int s1){
        salary=s1;
    }
    public void getSalary(){
        System.out.println("The salary of your Employee is  : "+salary);
    }
    public void setName(String n1){
        name=n1;
    }
    public void  getName(){
        System.out.println("The name of your Employee is :  "+name);
    }



}

public class CWH_39_Employee {
    public static void main(String[] args) {
        Employee e1= new Employee();
        System.out.println("Enter the Details of your Employee : ");
        Scanner sc = new Scanner(System.in);
        int sal1=sc.nextInt();
        String name1=sc.nextLine();
        e1.setSalary(sal1);
        e1.getSalary();
        e1.setName(name1);
        e1.getName();

    }
}

