package latihan.index.nilai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fataelislami
 */
public class Mahasiswa {
    private double quiz,uts,uas,na;
    private char index=0;
    private String keterangan=null;
    private String nama;
    private String nim;
    
    Mahasiswa(String nama,String nim,double quiz,double uts,double uas){
        this.nim=nim;
        this.nama=nama;
        this.quiz=quiz;
        this.uts=uts;
        this.uas=uas;
    
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    double getNilaiAkhir(double quiz,double uts,double uas){
        na=(0.2*quiz)+(0.3*uts)+(0.5*uas);
        return na;
    }
    
    public void getIndexNilai(double na){
       if(na<=45){
            index='E';
            keterangan="Sangat Kurang";
        }else if(na<=56){
            index='D';
            keterangan="Kurang";
        }else if(na<=68){
            index='C';
            keterangan="Cukup";
        }else if(na<=80){
            index='B';
            keterangan="Baik";
        }else if(na<=100){
            index='A';
            keterangan="Sangat Baik";
        }  
       
        System.out.println("Index = "+index);
        System.out.println("Keterangan = "+keterangan);
      
    }
}
