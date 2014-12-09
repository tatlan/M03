/*
 * En 1994 el país A tiene una población de 25 millones de habitantes y el país B de 19.9
millones. Las tasas de crecimiento de la población son de 2% y 3% respectivamente.
Desarrollar un algoritmo para informar en que año la población del país B supera a la de
A.
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z51 {
    public static void main(String[] args) {
        
        int año=1994;
        double poblacionA=25000000;
        double poblacionB=19900000;
        
        while (poblacionA>poblacionB){
            poblacionA=poblacionA*1.02;
            poblacionB=poblacionB*1.03;
            año=año+1;
            System.out.println("Pais A "+poblacionA+ "Pais B " + poblacionB + "  " + año);
        }
        System.out.println("Pais B supera al A en el año " + año);
    }
    
}
