/*
 * ARRAYS
 */
package UF1;

/**
 * @author JuanAlfonso
 */
public class Z60_ARRAYS {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {50, 60, 70, 80, 100};
        int[] suma = new int[5];
        int i;

        /*
         suma[0]=a[0]+b[0];
         suma[1]=a[1]+b[1];
         suma[2]=a[2]+b[2];
         suma[3]=a[3]+b[3];
         suma[4]=a[4]+b[4];
         */
        for (i = 0; i < suma.length; i++) {
            suma[i] = a[i] + b[i];
            System.out.print(suma[i] + " ");
        }

        /*System.out.println(suma[0]+" "+suma[1]+" "+suma[2]+" "+suma[3]+" "+suma[4]);
         */
    }

}
