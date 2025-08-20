/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke2;

/**
 *
 * @author Husain
 */
public class Tumbuhan {

    /**
     * @return the JumlahKepingBiji
     */
    protected int getJumlahKepingBiji() {
        return JumlahKepingBiji;
    }

    /**
     * @param JumlahKepingBiji the JumlahKepingBiji to set
     */
    protected void setJumlahKepingBiji(int JumlahKepingBiji) {
        this.JumlahKepingBiji = JumlahKepingBiji;
    }

    /**
     * @return the jenis
     */
    protected String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    protected void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the habitat
     */
    protected String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    protected void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    private String jenis;
    private String habitat;
    private int JumlahKepingBiji;
}
