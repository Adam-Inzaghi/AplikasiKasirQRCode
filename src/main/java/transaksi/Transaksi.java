/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author SEMPRUL
 */
public class Transaksi {
    public String namaToko;
    public String namaPembeli;
    public Double totalBelanja;
    public String metodePembayaran;
    
    public Transaksi (String namaToko, String namaPembeli, double totalBelanja, String metodePembayaran) {
        this.namaToko = namaToko;
        this.namaPembeli = namaPembeli;
        this.totalBelanja = totalBelanja;
        this.metodePembayaran = metodePembayaran;
    }
    public String toString(){
        return "Toko: " + namaToko + "\n" +
                "Pembeli: " + namaPembeli + "\n" +
                "Total: " + totalBelanja + "\n" +
                "Metode: " + metodePembayaran;
    }
}
    
