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
public class Z02TiposDatosPrimitivos {
    public static void main(String[] args) {
        boolean p;      //verdadero o falso
        int n;          //numero entero sin decimales positivo o negativo
        double d;       //numero con o sin decimales
        char car;         //caracter, solo uno
        String cadena;  //cadena de caracteres no sale en azul por no ser primitivo, pero es correcto
                            //mas de un caracter
        
        n=3;            // incluso n=(3*4)+8/4-10
        d=3.1;          //puede ser entero o entero mas decimal
        p= true;        //true o false
        car ='r';
        cadena= "bon dia";
        
        System.out.println (cadena); //imprime cualquiera de estos
        //boolean b1,b2; //con usamos && ||
        //b1=true;
        //b2=false;
        //b1=true||false;
        //System.out.println (b1 && b2);
        //System.out.println (b1 || b2);
        
        
    
  }
}
