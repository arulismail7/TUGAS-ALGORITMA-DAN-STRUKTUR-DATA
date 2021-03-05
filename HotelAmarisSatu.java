/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.amaris.satu;

/**
 *
 *
 */
public class HotelAmarisSatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[][] room = {
          {"1", "2", "3", "4", "X"}, 
          {"1", "2", "3", "4", "5"},
          {"1", "2", "3", "4", "5"},
          {"1", "2", "3", "X", "5"},
      };
      
      int kamarkosong = 0;
      for (int j = 0; j < room.length; j++){
       for (int i = 0; i < room[j].length; i++) {
          if ("X".equals(room[j][i])) {
           System.out.println(" Tamu Berada Dilantai " + (j+1) + " Kamar " + (i+1) );
       }else {
                   kamarkosong += 1;
                   }                 
      }
      } System.out.println("");
      System.out.println("Kamar Yang Tersedia Ada " + kamarkosong);
    } 
}
