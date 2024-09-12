import java.util.Scanner;

public class Tugas1Jb3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlahListrik, totalTagihan, tarifListrik=1500;
        boolean cek;

        System.out.println("Masukkan jumlah penggunaan listrik: ");
        jumlahListrik = input.nextDouble();
        
        totalTagihan = tarifListrik * jumlahListrik;
        cek = jumlahListrik > 500;
        
        System.out.println("Jumlah Listrik " + jumlahListrik);
        System.out.println("Total Tagihan Anda: " + totalTagihan);
        System.out.println("apakah penggunaan listrik anda melebii 500kwh: " + cek);
        

    }
}
