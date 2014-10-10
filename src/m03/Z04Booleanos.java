/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;

/**
 *
 * @author JuanAlfonso
 */
public class Z04Booleanos {
    public static void main(String[] args) {
       /* a b c luz1  luz2
          0 0 0   0     1
          0 0 1   1     1
          0 1 0   1     1
          0 1 1   0     0
          1 0 0   1     0
          1 0 1   0     0
          1 1 0   0     0
          1 1 1   1     0
        */
        boolean a=true;
        boolean b=false;
        boolean c=false;
        
        boolean luz1;
        boolean luz2;
        luz1=(!a && !b &&c) ||(!a && b && !c) || (a && !b && !c) || ( a && b && c);
        if (luz1==true) { 
            System.out.println ("encendido");
        }else{
                   
            System.out.println ("apagado");        }
        
        }                
        
        
       // s1=true;
       // s2=false;
       // s3=true;
        
        //luz1=2*10-4==4+5*3;
       // luz2=s2 == (s3||s1);
        
        //System.out.println (s1&&s2||s3);
       // System.out.println (s4);
    
    
}
