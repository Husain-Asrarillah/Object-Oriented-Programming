/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke3;

/**
 *
 * @author Husain
 */
public class Sepeda extends Transportasi {

    /**
     * @return the Kecepatan
     */
    protected String getKecepatan() {
        return Kecepatan;
    }

    /**
     * @param Kecepatan the Kecepatan to set
     */
    protected void setKecepatan(String Kecepatan) {
        this.Kecepatan = Kecepatan;
    }

    /**
     * @return the Kenyamanan
     */
    protected String getKenyamanan() {
        return Kenyamanan;
    }

    /**
     * @param Kenyamanan the Kenyamanan to set
     */
    protected void setKenyamanan(String Kenyamanan) {
        this.Kenyamanan = Kenyamanan;
    }

    private String Kecepatan;
    private String Kenyamanan;
    
    
    
    
    
    
    
    

//    public static void main(String[] args) {
//        Sepeda p = new Sepeda();
//        p.setKapasitas(2);
//        p.setJumlahRoda(2);
//        p.setJenis("Darat");
//
//        System.out.println("=== Data Sepeda ===");
//        System.out.println("Kapasitas    : " + p.getKapasitas());
//        System.out.println("Jumlagh Roda : " + p.getJumlahRoda());
//        System.out.println("Jenis       : " + p.getJenis());
//    }
}
