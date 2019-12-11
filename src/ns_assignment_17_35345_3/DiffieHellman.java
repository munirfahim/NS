/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ns_assignment_17_35345_3;

/**
 *
 * @author munir
 */
public class DiffieHellman {
      int p, alpha, k, ya, xa, yb, xb;

    public DiffieHellman(int p, int alpha, int xa, int xb) {
        this.p = p;
        this.alpha = alpha;
        this.xa = xa;
        this.xb = xb;
    }
      
      public void performDH(){
       ya = (int) Math.pow(alpha,xa) % p;
       System.out.println("Value of Ya: "+ya);
       yb = (int)Math.pow(alpha, xb) % p;
       System.out.println("Value of Yb: "+yb);
       System.out.println("Value of ka: "+(int)Math.pow(yb, xa) % p);
       System.out.println("Value of kb: "+(int)Math.pow(ya, xb) % p);
       if((int)Math.pow(yb, xa) % p==(int)Math.pow(ya, xb) % p){
       k = (int)Math.pow(yb, xa) % p;
       System.out.println("Value of k: "+k+" is verfied");
       }
       else
       {
       k = (int)Math.pow(yb, xa) % p;
       System.out.println("Value of k: "+k+" is not verfied");
       }
       
      
      }
}
