/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1Ke1;

/**
 *
 * @author Husain
 */
class Reptil extends Hewan {

    /**
     * @return the alatPernafasan
     */
    protected String getAlatPernafasan() {
        return alatPernafasan;
    }

    /**
     * @param alatPernafasan the alatPernafasan to set
     */
    protected void setAlatPernafasan(String alatPernafasan) {
        this.alatPernafasan = alatPernafasan;
    }

    /**
     * @return the organTubuhIdentik
     */
    protected String getOrganTubuhIdentik() {
        return organTubuhIdentik;
    }

    /**
     * @param organTubuhIdentik the organTubuhIdentik to set
     */
    protected void setOrganTubuhIdentik(String organTubuhIdentik) {
        this.organTubuhIdentik = organTubuhIdentik;
    }

    /**
     * @return the caraBergerak
     */
    protected String getCaraBergerak() {
        return caraBergerak;
    }

    /**
     * @param caraBergerak the caraBergerak to set
     */
    protected void setCaraBergerak(String caraBergerak) {
        this.caraBergerak = caraBergerak;
    }

    /**
     * @return the alatGerak
     */
    protected String getAlatGerak() {
        return alatGerak;
    }

    /**
     * @param alatGerak the alatGerak to set
     */
    protected void setAlatGerak(String alatGerak) {
        this.alatGerak = alatGerak;
    }
    private String alatGerak;
    private String alatPernafasan;
    private String organTubuhIdentik;
    private String caraBergerak;

    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        Reptil kadal = new Reptil();
//        kadal.setJenis("Reptil");
//        kadal.setHabitat("Hutan Tropis");
//        kadal.setCaraBerkembangBiak("Bertelur");
//        kadal.setHidupDi("Darat");
//
//        System.out.println("=== Data Reptil ===");
//        System.out.println("Jenis                   : " + kadal.getJenis());
//        System.out.println("Habitat                 : " + kadal.getHabitat());
//        System.out.println("Cara berkembang Biak    : " + kadal.getCaraBerkembangBiak());
//        System.out.println("Hidup Di                : " + kadal.getHidupDi());
//    }
}
