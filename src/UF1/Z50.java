/*
 * Una papelería debe imprimir una lista de los valores para diferentes cantidades de
fotocopias a sacar. El precio unitario de cada fotocopia debe leerse. Imprimir un listado
teniendo en cuenta que se tiene una política de descuento para cantidades que se
obtengan del mismo original así: el 12% para fotocopias entre 100 y 200, del 15% para
fotocopias entre 201 y 400, y del 18% para fotocopias por cantidades mayores a 400.
 */
package UF1;
import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z50 {
    public static void main(String[] args) {
        int i;
        int precio;
        

        Scanner darprecio = new Scanner(System.in);

        System.out.println("Dime el precio unitario");
        precio = darprecio.nextInt();
        
        System.out.println("Entre 1 y 99 salen a " + precio);
        System.out.println("Entre 100 y 200 salen a " + precio*0.88);
        System.out.println("Entre 201 y 400 salen a " + precio*0.85);
        System.out.println("Mas de 400 a " + precio*0.82);
        
        
        
        
        
    }
    
}
