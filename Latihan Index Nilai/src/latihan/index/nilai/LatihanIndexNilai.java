/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.index.nilai;

/**
 *
 * @author fataelislami
 */
public class LatihanIndexNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Mahasiswa oMhs =new Mahasiswa("Fata El Islami","10116499",75,45,34);
        double na=oMhs.getNilaiAkhir(oMhs.getQuiz(), oMhs.getUts(),oMhs.getUas());
    
        
        for(int i=1;i<=4;i++){
           
            System.out.println("Nama ke "+i+" = "+oMhs.getNama());
        }
        for(int j=8;j>=1;j--){
     
            System.out.println("Nim ke "+j+" = "+oMhs.getNim());
        }
        System.out.println("Quiz : "+oMhs.getQuiz());
        System.out.println("Uts : "+oMhs.getUts());
        System.out.println("Uas : "+oMhs.getUas());
        System.out.println("\n");
        System.out.println("Nilai Akhir = "+na);
        System.out.println("\n");
        oMhs.getIndexNilai(na);
        
       
    }
    
}
