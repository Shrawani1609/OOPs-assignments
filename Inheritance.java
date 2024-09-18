Q.Design and develop inheritance for a given case study, identify objects and relationships and 
implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, 
Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, 
Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as 
the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross 
and net salary.


package Employee;
import java.util.*;

class Employee {
    int id;
    String name;
    String mail;
    String address;
    long mobno;
    double gross_pay, net_pay;
    double DA, HRA, PF, CF;
    static int count = 0;

    public void input() {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();  

        System.out.println("\nEnter Employee Name: ");
        name = sc.nextLine();

        System.out.println("\nEnter Employee Email: ");
        mail = sc.next();
        sc.nextLine(); 
        while (!mail.contains("@") || !mail.endsWith(".com")) {
            System.out.println("Invalid Email");
            System.out.println("\nEnter Employee Email: ");
            mail = sc.next();
            sc.nextLine();  
        }

        System.out.println("\nEnter Employee Mobile Number: ");
        mobno = sc.nextLong();
        while (String.valueOf(mobno).length() != 10 || mobno <= 0) {
            System.out.println("Invalid Mobile Number");
            System.out.println("\nEnter Employee Mobile Number: ");
            mobno = sc.nextLong();
        }
        sc.nextLine();  

        System.out.println("\nEnter Employee Address: ");
        address = sc.nextLine();
    }

    public double gross(float basic_pay) {
        DA = 0.97 * basic_pay;
        HRA = 0.10 * basic_pay;
        PF = 0.12 * basic_pay;
        CF = 0.001 * basic_pay;
        gross_pay = basic_pay + DA + HRA; 
        return gross_pay;
    }

    public double net(float gross_pay) {
        net_pay = gross_pay - (PF + CF);  
        return net_pay;
    }

    public void PaySlip(float basic_pay) {
        System.out.println();
        System.out.println("Pay Slip:");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + mail);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Address: " + address);
        System.out.println("\nBasic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("CF: " + CF);        
        System.out.println("\nGross Pay: " + gross_pay);
        System.out.println("Net Pay: " + net_pay);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Whose PaySlip do you want?");
            System.out.println("1. Project Manager");
            System.out.println("2. Assistant Project Manager");
            System.out.println("3. Team Leader");
            System.out.println("4. Programer");
            System.out.println("0 to Exit");
            choice = sc.nextInt();
            int n = 0;
            switch (choice) {
                case 1:
                    System.out.println("How many Project Manager's PaySlip do you want to print?");
                    n = sc.nextInt();
                    PM[] p = new PM[n];
                    for (int i = 0; i < n; i++) {
                        p[i] = new PM();
                        count++;
                        p[i].input();
                        float basic = p[i].in();
                        double gross_pay = p[i].gross(basic);
                        double net_pay = p[i].net((float)gross_pay);
                        p[i].PaySlip(basic);
                    }
                    System.out.println("You visited " + n + " Project Managers\n");
                    break;
                case 2:
                    System.out.println("How many Assistant Project Manager's PaySlip do you want to print?");
                    n = sc.nextInt();
                    APM[] a = new APM[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = new APM();
                        count++;
                        a[i].input();
                        float basic = a[i].in();
                        double gross_pay = a[i].gross(basic);
                        double net_pay = a[i].net(basic);
                        a[i].PaySlip(basic);
                    }
                    System.out.println("You visited " + n + " Assistant Project Managers\n");
                    break;
                case 3:
                    System.out.println("How many Team Leader's PaySlip do you want to print?");
                    n = sc.nextInt();
                    TL[] t = new TL[n];
                    for (int i = 0; i < n; i++) {
                        t[i] = new TL();
                        count++;
                        t[i].input();
                        float basic = t[i].in();
                        double gross_pay = t[i].gross(basic);
                        double net_pay = t[i].net(basic);
                        t[i].PaySlip(basic);
                    }
                    System.out.println("You visited " + n + " Team Leaders\n");
                    break;
                case 4:
                    System.out.println("How many Programmer's PaySlip do you want to print?");
                    n = sc.nextInt();
                    Programer[] pr = new Programer[n];
                    for (int i = 0; i < n; i++) {
                        pr[i] = new Programer();
                        count++;
                        pr[i].input();
                        float basic = pr[i].in();
                        double gross_pay = pr[i].gross(basic);
                        double net_pay = pr[i].net(basic);   
                        pr[i].PaySlip(basic);
                    }
                    System.out.println("You visited " + n + " Programmers\n");
                    break;
                case 0:
                    sc.close();
                    System.out.println("\nYou visited " + count + " employees");
                    System.out.println("Thanks for visiting :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
     



}

      class PM extends Employee {
        float basic_pay;
        public float in() {
        	Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter Basic Pay: ");
            basic_pay = sc.nextFloat();
            while (basic_pay < 0) {
                System.out.println("Invalid Salary");
                System.out.println("Enter Basic Pay: ");
                basic_pay = sc.nextFloat();
            }
            return basic_pay;
        }
    }

    class APM extends Employee {
        float basic_pay;
        public float in() {
        	Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter Basic Pay: ");
            basic_pay = sc.nextFloat();
            while (basic_pay < 0) {
                System.out.println("Invalid Salary");
                System.out.println("Enter Basic Pay: ");
                basic_pay = sc.nextFloat();
            }
            return basic_pay;
        }
    }

    class TL extends Employee {
        float basic_pay;
        public float in() {
        	Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter Basic Pay: ");
            basic_pay = sc.nextFloat();
            while (basic_pay < 0) {
                System.out.println("Invalid Salary");
                System.out.println("Enter Basic Pay: ");
                basic_pay = sc.nextFloat();
            }
            return basic_pay;
        }
    }

     class Programer extends Employee {
        float basic_pay;
        public float in() {
        	Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter Basic Pay: ");
            basic_pay = sc.nextFloat();
            while (basic_pay < 0) {
                System.out.println("Invalid Salary");
                System.out.println("Enter Basic Pay: ");
                basic_pay = sc.nextFloat();
            }
            return basic_pay;
        }
     }
    

    
