Q)Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user 
enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 
and Num2 are not integers, the program would throw a Number Format Exception. If Num2 
were zero, the program would throw an Arithmetic Exception. Display the exception.


package exception;
import java.util.*;

public class Exceptiom {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int size = 0;
	        int[] arr ;

	        
	        while (true) {
	            try {
	               
	                System.out.print("Enter the size of the array : ");
	                size = Integer.parseInt(scanner.nextLine());	                
	                if (size <= 1) {
	                    throw new IllegalArgumentException("Array size must be positive or greater than 1");
	                }

	              
	                arr = new int[size];
	                

	            
	                for (int i = 0; i < size; i++) {
	                    System.out.print("Enter element " + (i + 1) + ": ");
	                    String element = scanner.nextLine();
	                    arr[i] = Integer.parseInt(element);
	                }

	                break;  

	            } catch (NumberFormatException e) {
	                System.out.println("NumberFormatException caught: Invalid input. Please enter valid integers.");
	            } 
	            catch (IllegalArgumentException e) {
	                System.out.println("Exception caught: Enter the index greater than 1" );
	            }
	        }

	        
	        while (true) {
	            try {
	               
	                System.out.println("\nChoose an operation:");
	                System.out.println("1. Divide two elements from the array");
	                System.out.println("2. Access an element in the array");
	                System.out.println("3. Exit");
	                int choice = Integer.parseInt(scanner.nextLine());

	                switch (choice) {
	                    case 1:
	                        
	                        System.out.print("Enter the index for Num1: ");
	                        int index1 = Integer.parseInt(scanner.nextLine());

	                        System.out.print("Enter the index for Num2: ");
	                        int index2 = Integer.parseInt(scanner.nextLine());

	                      
	                        int num1 = arr[index1]; 
	                        int num2 = arr[index2]; 

	                        
	                        int result = num1 / num2;
	                        System.out.println("Result of division: " + result);
	                        break;

	                    case 2:
	                     
	                        System.out.print("Enter the index to access: ");
	                        int index = Integer.parseInt(scanner.nextLine());

	                       
	                        System.out.println("Element at index " + index + " is: " + arr[index]);
	                        break;

	                    case 3:
	                       
	                        System.out.println("Exiting the program...");
	                        return;

	                    default:
	                        System.out.println("Invalid choice. Please enter a valid option.");
	                }

	            } catch (NumberFormatException e) {
	                System.out.println("NumberFormatException: Invalid input.Please enter valid integers.");
	            } catch (ArithmeticException e) {
	                System.out.println("ArithmeticException: Division by zero is not allowed.");
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("ArrayIndexOutOfBoundException: Array index is out of bounds.");
	            }
	            finally {
	 	           
		            System.out.println("Thank You");
		        }
	        }
	        
	        

        
	    }
	}

	


