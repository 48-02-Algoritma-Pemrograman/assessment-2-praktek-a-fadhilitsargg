import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    
    static String[] namaBuku = {
        "Sherlock Holmes", 
        "Arsene Lupin", 
        "Game of Throne", 
        "Psychology of Money"
    };
    
    public static void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println(namaBuku[i] + " " + hargaBuku[i]);
        }
        System.out.println();
    }
    
    public static int hitungTotalHarga(ArrayList<Integer> daftarBuku) {
        int totalHarga = 0;
        for (int harga : daftarBuku) {
            totalHarga += harga;
        }
        return totalHarga;
    }
    
    public static int hitungVoucher(int totalHarga) {
        int voucher = 0;
        if (totalHarga >= 200000 && totalHarga < 500000) {
            voucher = 50000;
        } else if (totalHarga >= 500000 && totalHarga < 750000) {
            voucher = 100000;
        } else if (totalHarga >= 750000 && totalHarga <= 1000000) {
            voucher = 150000;
        } else if (totalHarga > 1000000) {
            voucher = 200000;
        }
        return voucher;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> keranjangBuku = new ArrayList<>();
        
        tampilkanDaftarBuku();
        
        while (true) {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = scanner.nextInt();
            
            keranjangBuku.add(hargaBuku[pilihan - 1]);
            
            System.out.print("Input lagi (Y/N)?: ");
            String konfirmasi = scanner.next();
            
            if (konfirmasi.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        int totalHarga = hitungTotalHarga(keranjangBuku);

        int voucher = hitungVoucher(totalHarga);
        
        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga));
        
        scanner.close();
        System.out.println("\n" + Nomor2.class.getDeclaredMethods().length);
    }
}
