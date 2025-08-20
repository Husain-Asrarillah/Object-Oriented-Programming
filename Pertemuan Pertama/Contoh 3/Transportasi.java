/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke3;

/**
 *
 * @author Husain
 */
public class Transportasi {

    /**
     * @return the Jenis
     */
    protected String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    protected void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    /**
     * @return the JumlahRoda
     */
    protected int getJumlahRoda() {
        return JumlahRoda;
    }

    /**
     * @param JumlahRoda the JumlahRoda to set
     */
    protected void setJumlahRoda(int JumlahRoda) {
        this.JumlahRoda = JumlahRoda;
    }

    /**
     * @return the Kapasitas
     */
    protected int getKapasitas() {
        return Kapasitas;
    }

    /**
     * @param Kapasitas the Kapasitas to set
     */
    protected void setKapasitas(int Kapasitas) {
        this.Kapasitas = Kapasitas;
    }
    
    private int JumlahRoda;
    private int Kapasitas;
    private String Jenis;
}
