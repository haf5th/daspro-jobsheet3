import java.util.Scanner;

public class Jobshhet3T2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Masukkan jumlah jam kerja: ");
       double jumlahJamKerja = input.nextDouble();
       System.out.println("Masukkan upah per jam: ");
       double upahPerJam = input.nextDouble();

       double gajiKotor = jumlahJamKerja * upahPerJam;
       double bonus = 0.10 * gajiKotor;
       double gajiDanBonusSebelumPajak = gajiKotor + bonus;
       double pajak = 0.05 * gajiDanBonusSebelumPajak;
       double gajiBersih = gajiDanBonusSebelumPajak - pajak;

       System.out.println("Gaji Kotor: Rp " + gajiKotor);
       System.out.println("Bonus: Rp " + bonus);
       System.out.println("Gaji dan Bonus Sebelum Pajak: " + gajiDanBonusSebelumPajak);
       System.out.println("Pajak: Rp" + pajak);
       System.out.println("Gaji Bersih: Rp" + gajiBersih);


    }
    
}
