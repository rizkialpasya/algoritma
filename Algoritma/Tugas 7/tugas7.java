import java.util.Scanner;
import java.util.Stack;

class Siswa {
    int No;
    String Nama;
    String Kota;
    int Kelas;
    int Tahun;

 
    public Siswa (int No, String Nama, String Kota, int Kelas, int Tahun) {
        this.No = No;
        this.Nama = Nama;
        this.Kota = Kota;
        this.Kelas = Kelas;
        this.Tahun = Tahun;
    }


}

public class tugas7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Siswa> Siswa = new Stack<>();
        Siswa.push(new Siswa(1, "Aldila Putri", "Serang", 1, 2004));
        Siswa.push(new Siswa(2, "Hesti","Pandeglang", 1, 2006));
        Siswa.push(new Siswa(3, "Firmansah","Serang" , 2, 2004));
        Siswa.push(new Siswa(4, "Firmansyah","Serang", 2, 2006));
        Siswa.push(new Siswa(5, "Amuna Rizkia", "Bogor", 1, 2003));
        Siswa.push(new Siswa(6, "Lulu Atul","Bogor",1, 2003));



        String KelasSiswa [] = {"Komputer dan jaringan","Teknik kendaraan Ringan","Teknik Sepeda motor"};

        int[] countKelas = new int [KelasSiswa.length];
        int Pria = 0;
        int Wanita  = 0;

        System.out.println("===========================================================");
        System.out.println("Daftar Siswa");
        System.out.println("===========================================================");

        for (int i = 0; i < Siswa.size(); i++) {
            Siswa currentSiswa = Siswa.get(i);
            System.out.print(i + 1 + "\t");
            System.out.print(currentSiswa.No + "\t");
            System.out.print(currentSiswa.Nama + "\t");
            System.out.print(currentSiswa.Kota + "\t");
            System.out.print(currentSiswa.Tahun + "\t");
            System.out.println(KelasSiswa[currentSiswa.Kelas - 1]);
            
            countKelas[currentSiswa.Kelas - 1]++;
            if (currentSiswa.Tahun >= 2004) {
            
            Wanita++;
        } else {
        
            Pria++;
        }
    }
    System.out.println("===========================================================");
    System.out.println("\nJumlah Siswa: " + Siswa.size());
    for ( int b = 0; b < KelasSiswa.length; b++) {
        System.out.println ("Siswa: " + KelasSiswa[b] + ":" + countKelas[b]);
    }
    System.out.println("Laki-Laki : "+ Pria); 
    System.out.println("Perempuan : " + Wanita );

    scanner.close();
    }
    
}