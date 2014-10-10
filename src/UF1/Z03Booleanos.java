/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z03Booleanos {
public static void main(String[] args) {
        boolean s1,s2,s3,s4,luz1,luz2;      
        
        s1=(((4+5)==8));
        s2=!(15>16);
        s3=('c'=='c');
        s4=(4+5)==4&&!('d'=='c')||((4*5)/2)==((3*9)+6);
        luz1=s1||s3;
        luz2=s2 == s3;
        
        //System.out.println (s1&&s2||s3);
        System.out.println (s4);
               
        
}
}
