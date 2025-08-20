/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke2;

/**
 *
 * @author Husain
 */
public class Bunga extends Tumbuhan {

    /**
     * @return the Batang
     */
    protected String getBatang() {
        return Batang;
    }

    /**
     * @param Batang the Batang to set
     */
    protected void setBatang(String Batang) {
        this.Batang = Batang;
    }

    /**
     * @return the AlatReproduksi
     */
    protected String getAlatReproduksi() {
        return AlatReproduksi;
    }

    /**
     * @param AlatReproduksi the AlatReproduksi to set
     */
    protected void setAlatReproduksi(String AlatReproduksi) {
        this.AlatReproduksi = AlatReproduksi;
    }

    /**
     * @return the Populasi
     */
    protected String getPopulasi() {
        return Populasi;
    }

    /**
     * @param Populasi the Populasi to set
     */
    protected void setPopulasi(String Populasi) {
        this.Populasi = Populasi;
    }
    private String AlatReproduksi;
    private String Batang;
    private String Populasi;

    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        Bunga p = new Bunga();
//        p.setJenis("Bunga");
//        p.setJumlahKepingBiji(2);
//        p.setHabitat("Tropis");
//
//        System.out.println("=== Data Bunga ===");
//        System.out.println("Jenis                   : " + p.getJenis());
//        System.out.println("Jumlah Keping Biji      : " + p.getJumlahKepingBiji());
//        System.out.println("Habitat                 : " + p.getHabitat());
//    }
}
