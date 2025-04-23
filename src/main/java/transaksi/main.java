package transaksi;

import java.util.Scanner;

public class main {
    static Scanner input = new Scanner (System.in);
//    static Transaksi transaksi = null;
    
    public static void main (String[]args){
        while(true){
            System.out.println("====APLIKASI KASIR QR CODE =====");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Generate QR Code");
            System.out.println("3. Scan QR Code");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt(); input.nextLine();
            
            switch (menu) {
                case 1:
                   tambahTransaksi();
                   break;

                case 2:
                   generateQR();
                   break;

                case 3:
                   scanQR();
                   break;

                case 4:
                   System.out.println("Terima kasih");
                   return;
                   
                default:
                   System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
    static void tambahTransaksi(){
        System.out.print("Nama Toko:");
        String toko = input.nextLine();
        System.out.print("Nama pembeli:");
        String pembeli = input.nextLine();
        System.out.print("Total Belanja:");
        double total = input.nextDouble(); input.nextLine();
        System.out.print("Mode Pembayaran:");

//        transaksi = new Transaksi(toko,pembeli,total,metode);
        System.out.println("Tranasaksi berhasil ditambahkan.\n");
    }

    static void generateQR(){
        System.out.println("Anda telah masuk ke menu Generate QR Code");
//        if(transaksi == null){
//            System.out.println("Data transaksi belum ada!\n");
//            return;
//        }
//        try{
//            QRCodeGeneraton.generateQRCode(transaksi.toStaring(),"transaksi.png");
//            System.out.println("QR Codeberasil dibuat: transaksi.png\n");
//        }catch(Exception e){
//            System.out.println("Gagal generate QR:"+ e.getMessage());
//        }
    }
    
    static void scanQR(){
        System.out.println("Anda telah masuk ke menu Scan QR Code");
//        try{
//            String hasil = QRCodeScanner.scanerQRCode("transaksi.png");
//            System.out.println("Isi QR Code:\n" + hasil + "\n");
//        } catch(Exception e) {
//            System.out.println("Gagal scan QR:"+ e.getMessage());
//        }
    }
}