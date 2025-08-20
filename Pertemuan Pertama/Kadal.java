/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke1;

/**
 *
 * @author Husain
 */
class Kadal extends Reptil {

    /**
     * @return the nama
     */
    protected String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the warna
     */
    protected String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    protected void setWarna(String warna) {
        this.warna = warna;
    }

    private String nama;
    private String warna;

    public static void main(String[] args) {
        Kadal kadal = new Kadal();

        kadal.setJenis("Reptil");
        kadal.setHabitat("Hutan Tropis");
        kadal.setHidupDi("Darat");
        kadal.setCaraBerkembangBiak("Bertelur");
        kadal.setAlatGerak("Kaki");
        kadal.setAlatPernafasan("Paru-paru");
        kadal.setOrganTubuhIdentik("Lidah");
        kadal.setCaraBergerak("Merayap");
        kadal.setNama("Kiko");
        kadal.setWarna("Hijau");

        System.out.println("=== Data Kadal ===");
        System.out.println("Jenis                   : " + kadal.getJenis());
        System.out.println("Habitat                 : " + kadal.getHabitat());
        System.out.println("Hidup di                : " + kadal.getHidupDi());
        System.out.println("Cara Berkembang Biak    : " + kadal.getCaraBerkembangBiak());
        System.out.println("Alat Gerak              : " + kadal.getAlatGerak());
        System.out.println("Alat Pernafasan         : " + kadal.getAlatPernafasan());
        System.out.println("Organ Tubuh Identik     : " + kadal.getOrganTubuhIdentik());
        System.out.println("Cara Bergerak           : " + kadal.getCaraBergerak());
        System.out.println("Nama                    : " + kadal.getNama());
        System.out.println("Warna                   : " + kadal.getWarna());
    }
}
