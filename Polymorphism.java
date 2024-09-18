Q) Identify commonalities and differences between Publication, Book and Magazine classes. 
Title, Price, Copies are common instance variables and saleCopy is common method. The 
differences are, Bookclass has author and order Copies(). Magazine Class has methods 
orderQty, Currentissue, receiveissue().Write a program to find how many copies of the given 
books are ordered and display total sale of publication.

package assign2;
import java.util.*;
 class  publication{

   String title;
   double price;
   int copies;
   static double totalPrice;
   Scanner sc = new Scanner(System.in);

   void getData(){
       System.out.print("Enter PRICE : ");
       price = sc.nextDouble();
       System.out.print("Enter the Number of COPIES : ");
       copies = sc.nextInt();
   }
   void saleCopy(){
       System.out.println("\nTotal Sell by the publication house: " + totalPrice);
   }
}
class Book extends publication{
   String author;
   public int av =50;
   public double bookSell;
   public static double totalBookSell;
   public Scanner sc = new Scanner(System.in);
   void getAuthor(){
       System.out.print("Enter AUTHOR's NAME : ");
       author = sc.nextLine();
       System.out.print("Enter TITLE : ");
       title = sc.nextLine();
       
   }
   void getBookData(){
       getAuthor();
       getData();
   }
   void restock(){
       if(this.copies>av){
           System.out.println("RESTOCK the values of book to 1000 and ENTER the values AGAIN");
           av=av+1000;
           getBookData();
       }
       else {
           av=av-this.copies;
       }
   }
   void orderCopies(){
       System.out.print("enter number of COPIES to be ORDERED : ");
       int newCopies = sc.nextInt();
       this.copies = newCopies + this.copies;
   }
   void saleCopy(){
       bookSell = (this.copies);
       Book.totalBookSell += bookSell;
       publication.totalPrice += totalBookSell;
       System.out.print("\n");
       System.out.println("Ordered Book : " + this.author);
       System.out.println("Total Amount : " + bookSell);
       System.out.print("\n");
   }
   void totalBookSell(){
       System.out.println("Total Book Sell : " + totalBookSell);
   }
}
class Magazine extends publication{
   int orderQty;
   String author;
   public int av=50;
   String currentIssue;
   public double MagSell;
   public static double totalMagSell;
   Scanner sc = new Scanner(System.in);
    void getAuthor(){
        System.out.print("Enter MAG AUTHOR's Name : ");
        author = sc.nextLine();
    }
    void getMagData(){
        getData();
        getAuthor();
    }
   void restock(){
        if(this.copies>av){
            System.out.println("Restock the values of magazine to 1000 and enter the values again");
            av=av+1000;
            getData();
            getAuthor();
        }
        else {
            av=av-this.copies;
        }
    }
   void saleCopy(){
       MagSell = (this.copies);
       Magazine.totalMagSell += MagSell;
       publication.totalPrice += totalMagSell;
       System.out.print("\n");
       System.out.println("Ordered Magazine :" + this.copies);
       System.out.println("Total Amount : " + MagSell);
       System.out.print("\n");
   }
   void totalMagSell(){
       System.out.println("Total Magazine Sell : " + totalMagSell);
   }
}
class  Books{
   public static void main(String[] args) {
       Book b = new Book();
       Magazine m = new Magazine();
       publication p = new publication();
       Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("Enter");
           System.out.println("1.Order Book");
           System.out.println("2.Order Magazine");
           System.out.println("3.Total Book Sell");
           System.out.println("4.Total Magazine Sell");
           System.out.println("5.Total Publication Sell");
           System.out.println("6.Exit\n");
           System.out.print("Enter Your Choice : ");
           int choice = sc.nextInt();
           System.out.print("\n");
           switch (choice){
               case 1:
                   b.getBookData();
                   b.restock();
                   b.saleCopy();
                   break;
               case 2:
                   m.getMagData();
                   m.restock();
                   m.saleCopy();
                   break;

               case 3:
                   b.totalBookSell();
                   break;

               case 4:
                   m.totalMagSell();
                   break;

               case 5:
                   m.totalMagSell();
                   b.totalBookSell();
                   p.saleCopy();
                   break;

               case 6:
                   System.out.println("Exiting The Program..");
                   System.exit(0);
               default:
                   System.out.println("Please Enter Valid Input..");

           }
       }
   }
}
	

	
