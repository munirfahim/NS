
package ns_assignment_17_35345_3;

import java.util.Scanner;

/**
 *
 * @author munir
 */
public class MainClass {

    
    public static void main(String[] args) {
       System.out.println("             Performing Elgamel");
       System.out.println("_______________________________________________ ");
       Scanner input = new Scanner(System.in);
       int p,alpha,k,x,m,xb;
       System.out.print("Enter prime number p: ");
    	p = input.nextInt();
        System.out.print("Enter value of alpha/g: ");
    	alpha = input.nextInt();
        System.out.print("Enter the value of k: ");
    	k = input.nextInt();
        System.out.print("Enter the value of x: ");
    	x = input.nextInt();
        System.out.print("Enter message m: ");
    	m = input.nextInt();
        Key_Elgamel elg_test=new Key_Elgamel(p,alpha,k,x,m);
        elg_test.perform_elgamel();
        System.out.println("         Performing Diffie Hellman");
       System.out.println("_______________________________________________ ");
       System.out.print("Enter prime number p: ");
    	p = input.nextInt();
        System.out.print("Enter value of alpha/g: ");
    	alpha = input.nextInt(); 
        System.out.print("Enter the value of xa: ");
    	x = input.nextInt();
        System.out.print("Enter the value of xb: ");
    	xb = input.nextInt();
        DiffieHellman dh_test=new DiffieHellman(p,alpha,x,xb);
        dh_test.performDH();
    }
    
}
