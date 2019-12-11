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
public class Key_Elgamel {
    int p, alpha, k, y, x, m, s, r;

    public Key_Elgamel(int p, int alpha, int k, int x, int m) {
        this.p = p;
        this.alpha = alpha;
        this.k = k;
        this.x = x;
        this.m = m;
    }
    
    static int modInverse(int a, int m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    }
    
    public static int NegMod(int inp, int mod)
        {
            int div = inp / mod;
            return inp - (div - 1) * mod;
        }
    
    public void perform_elgamel(){
        this.y = ((int) Math.pow(alpha, x)) % p;
        System.out.println("Value of Y: "+y);
        this.r = ((int)Math.pow(alpha, k)) % p;
        System.out.println("Value of R: "+r);
        this.s = modInverse(k,p-1) * ((m - r * x) < 0 ? NegMod(m - r * x,p-1):((m-r*x)%(p-1))) % (p-1);
        System.out.println("Value of S: "+s);
        if(Math.pow(alpha, m) % p == Math.pow(y, r) * Math.pow(r, s) % p)
            System.out.println("Verfied with value: "+Math.pow(alpha, m) % p );
        else
            System.out.println("Verfication failed");
    }
    
}
