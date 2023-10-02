import java.util.Scanner;

public class diskon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total uang belanja: ");
        double totalBelanja = scanner.nextDouble();

        double diskon = 0.0;

        if (totalBelanja >= 100000) {
            diskon = (double) 5/100 * totalBelanja; 
        } 

      
        double totalBayar = totalBelanja - diskon;

       
        System.out.println("Total belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);

    
        scanner.close();
    }
}
