import java.lang.String;


class Library{
    static int numbook=0;
    String[] book = new String[5];
    public void addBook(String n1)
    {
        if(numbook!=5)
        {
            book[numbook]=n1;
            numbook++;
            System.out.println(numbook+"Has been added to the Library Collection  .");

        }
        else {
            System.out.println("Libary is full . Add books Later please.");
        }
    }


    public void showAvailablebooks(){
        System.out.println("The Available books Are  : -");
        for(String b:book)
        {
            if(b==null)
            {
                continue;

            }
            System.out.println(b);
        }
    }


    public void issueBook(String n1){
        for(int i=0;i<numbook;i++){
            if(book[i]==n1)
            {
                System.out.println("Book found !!");
                System.out.println("Please take your book  "+book[i]);
                book[i]=null;
            }

        }

    }


}







public class OnlineLibrary {
    public static void main(String[] args) {
        Library lib= new Library();
        lib.addBook("Get epic shit");
        lib.addBook("Think and Grow rich");
        lib.issueBook("Get epic shit");
        lib.showAvailablebooks();
    }

}
