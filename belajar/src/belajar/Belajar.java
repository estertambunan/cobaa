/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author user
 */
public class Belajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa oMhs=new Mahasiswa();
        
        oMhs.nama="Ester";
        oMhs.nim="10116466";
        oMhs.quis=75;
        oMhs.uts=45;
        oMhs.uas=34;
        double na;
        oMhs.getNilaiAkhir(oMhs.quis, oMhs.uts, oMhs.uas);
        na=oMhs.getNilaiAkhir(oMhs.quis, oMhs.uts, oMhs.uas);
        oMhs.getIndexNilai(na);
        
        System.out.println("nilai akhir = "+na);

        }
          
    
}
}