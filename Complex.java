package Complex;
import java.util.*;

public class Complex {
    int real;int img;
    Scanner input=new Scanner(System.in);
    void enter(){
        System.out.println("enter real part");
        this.real=input.nextInt();
        System.out.println("enter img part");
        this.img=input.nextInt();
    }
    void print(){
        if(this.img<0){
        System.out.println(this.real+this.img+"i");
    }
    else{
        System.out.println(this.real+"+"+this.img+"i");
    }
    }
    Complex add (Complex c1 ,Complex c2 ){
      Complex ans= new Complex();
      ans.real= c1.real+c2.real;
      ans.img= c1.img+c2.img;
      return ans;
    }
    Complex diff(Complex c1 ,Complex c2 ){
        Complex ans= new Complex();
        ans.real= c1.real-c2.real;
        ans.img= c1.img-c2.img;
        return ans;
      }
      Complex div(Complex c1 ,Complex c2 ){
        Complex ans= new Complex();
        int divisor= (c2.real*c2.real)- (c2.img*c2.img);
        if ( divisor!=0){
        ans.real= (c1.real*c2.real + c1.img*c2.img) ;
        ans.img=(c1.img*c2.real-c1.real*c2.img) ;
        ans.real= ans.real/ divisor;
        ans.img= ans.img/divisor;
        return ans;
    }
        else{
            System.out.println("undefined");
            return ans;
        }
      }
    

    
 public static void main(String a[]){
    Complex c1=new Complex();
    Complex c2=new Complex();
    System.out.println("enter first complex number");
    c1.enter();
    System.out.println("enter second complex number");
    c2.enter();
    Complex dummy=new Complex();
    int choice;
    do{
        System.out.println("enter 1 for addition , 2 for subtraction, 3 for divison,0 for exit");
        Scanner enter= new Scanner(System.in);
        choice= enter.nextInt();
        switch(choice){
            case 1 : dummy.add(c1, c2).print();
            break;
            case 2 : dummy.diff(c1, c2).print();
            break;
            case 3 : dummy.div(c1, c2).print();
            case 0 :
            break;
        }
        
    }
    while(choice!=0);
 }


}
