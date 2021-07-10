import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class HillChiper {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            File f1 = new File("D:\\Custom.txt");
            try (Scanner reader = new Scanner(f1)) {
                while (reader.hasNextLine()) {
                    boolean data = false;
                    System.out.println(data);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan dalam pengaksesan file");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Isikan nilai matriks A : ");
        int matA = scan.nextInt();
        System.out.println("Isikan nilai matriks B : ");
        int matB = scan.nextInt();
        System.out.println("Isikan nilai matriks C : ");
        int matC = scan.nextInt();
        System.out.println("Isikan nilai matriks D : ");
        int matD = scan.nextInt();

        if ((matA * matD) - (matB - matC) ==1) {
            System.out.println("Matrik telah memenuhi syarat");
        } else {
            System.out.println("Matriks tidak dapat digunakan, determinan matriks harus 1!");
        }
        String datainput = "Sahrull Ismail Usman";
        for (int i = 0; i < datainput.length(); i++) {
            char huruf = datainput.charAt(i);
            int ascii = (int) huruf;
            System.out.println(huruf + "kode ASCII nya = " + ascii);
        }
        FileWriter writer = new FileWriter("E:\\File_java.txt");
        try {
            writer.write("Teks ini ditulis menggunakan program JAVA\n");
            writer.write("kalian dapat menggunakan fungsi ini untuk\n");
            writer.write("menyimpan file teks hasil dari enkripsi\n");
        } catch (IOException e) {
        } finally {
            writer.flush();
            writer.close();
        }
    }

}
