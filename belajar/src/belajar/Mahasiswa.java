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
public class Mahasiswa {
    double quis,uts,uas,na;
    String nama,nim,keterangan;
    char index;
    
    double getNilaiAkhir(double quis,double uts,double uas){
    na=(0.2*quis)+(0.3*uts)+(0.5*uas);
    return na;
    }
    public void getIndexNilai(double na){
        if(na<=45){
            index='E';
            keterangan="Sangat kurang";
            System.out.println("index = "+index);
            System.out.println("keterangan= "+keterangan);
        }else if(na<=56){
            index='D';
            keterangan="Kurang";
            System.out.println("index = "+index);
            System.out.println("keterangan= "+keterangan);
        }else if(na<=68){
            index='C';
            keterangan="Cukup";
            System.out.println("index = "+index);
            System.out.println("keterangan= "+keterangan);
        }else if(na<=80){
            index='B';
            keterangan="Baik";
            System.out.println("index = "+index);
            System.out.println("keterangan= "+keterangan);
        }else if(na<=100){
            index='A';
            keterangan="Sangat Baik";
            System.out.println("index = "+index);
            System.out.println("keterangan= "+keterangan);
            
    }
}
