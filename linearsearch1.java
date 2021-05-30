/*
NAMA : SAHRUL ISMAIL USMAN
NIM : 20200040045
KELAS : TI20A
*/

public class linearsearch1 {
    
    public static void main(String[] args) {
        int[] angka ={30, 78, 66, 45, 35, 56, 45, 45, 67};
        boolean ditemukan = false;
        int nomor = 67;
        
        for(int i=0;i<angka.length;i++){
            if(nomor == angka[i]){
                System.out.println("Data ada pada index ke-" + i);
                ditemukan = true;
                break;
                
            }
        }
        if(ditemukan == false){
            System.out.println("Data Tidak Temukan");
        }
    }
    
}