
/*
NAMA    : SAHRUL ISMAIL USMAN
NIM     : 20200040045
KELAS   : TI20A
 */
package selectinsort;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class SelectinSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {44, 55, 66, 77, 22, 33, 11, 99, 88};
        
        int min = arr[0];
        int index = 0;
        int swappingProcess = 0;
        
        long startTime = System.nanoTime();
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if ( arr[j] < min ) {
                    min = arr[j];
                    index = j;
                    swappingProcess++;
                }
                System.out.println(Arrays.toString(arr) + " - Total Swap : " + swappingProcess);
            }
            if ( min < arr[i] ) {
                arr[index] = arr[i];
                arr[i] = min;
            }
            min = arr[i + 1];
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Total Waktu Diperlukan : " + timeElapsed + " nano detik");
        
    }
    
}
