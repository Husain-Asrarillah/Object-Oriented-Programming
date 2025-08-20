/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke2;

/**
 *
 * @author Husain
 */
public class Mawar extends Bunga {

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
     * @return the Berasal
     */
    protected String getBerasal() {
        return Berasal;
    }

    /**
     * @param Berasal the Berasal to set
     */
    protected void setBerasal(String Berasal) {
        this.Berasal = Berasal;
    }

    private String Manfaat;
    private String Warna;
    private String Berasal;

    public static void main(String[] args) {
        Mawar p = new Mawar();
        p.setJenis("Bunga");
        p.setHabitat("Daerah Tropis");
        p.setBerasal("Asia");
        p.setJumlahKepingBiji(2);
        p.setAlatReproduksi("Putik dan Benang Sari");
        p.setBatang("Beduri");
        p.setPopulasi("Banyak");
        p.setWarna("Merah");
        p.setManfaat("Kosmetik dan Dekorasi");

        System.out.println("=== Data Bunga Mawar ===");
        System.out.println("Jenis Tumbuhan      : " + p.getJenis());
        System.out.println("Habitat             : " + p.getHabitat());
        System.out.println("Berasal Dari        : " + p.getBerasal());
        System.out.println("Jumlah Keping Biji  : " + p.getJumlahKepingBiji());
        System.out.println("Alat Reproduksi     : " + p.getAlatReproduksi());
        System.out.println("Keadaan Batang      : " + p.getBatang());
        System.out.println("Populasi            : " + p.getPopulasi());
        System.out.println("Warna               : " + p.getWarna());
        System.out.println("Manfaat             : " + p.getManfaat());
    }

}
