/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke3;

/**
 *
 * @author Husain
 */
public class SepedaKayuh extends Sepeda {

    /**
     * @return the Warna
     */
    protected String getWarna() {
        return Warna;
    }

    /**
     * @param Warna the Warna to set
     */
    protected void setWarna(String Warna) {
        this.Warna = Warna;
    }

    /**
     * @return the Manfaat
     */
    protected String getManfaat() {
        return Manfaat;
    }

    /**
     * @param Manfaat the Manfaat to set
     */
    protected void setManfaat(String Manfaat) {
        this.Manfaat = Manfaat;
    }
    private String Warna;
    private String Manfaat;

    public static void main(String[] args) {
        SepedaKayuh p = new SepedaKayuh();
        p.setKapasitas(2);
        p.setJumlahRoda(2);
        p.setJenis("Darat");
        p.setKecepatan("Lumayan Cepat");
        p.setKenyamanan("Kurang Nyaman");
        p.setManfaat("Kesehatan");
        p.setWarna("Hitam");

        System.out.println("=== Data Sepeda Kayuh ===");
        System.out.println("Kapasitas               : " + p.getKapasitas());
        System.out.println("Jumlah Roda             : " + p.getJumlahRoda());
        System.out.println("Di Gunakan di           : " + p.getJenis());
        System.out.println("Tingkat Kecepatan       : " + p.getKecepatan());
        System.out.println("Tingkat Kenyamanan      : " + p.getKenyamanan());
        System.out.println("Manfat                  : " + p.getManfaat());
        System.out.println("Warna                   : " + p.getWarna());
    }
}
