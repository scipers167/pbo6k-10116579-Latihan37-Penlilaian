/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
public class penilaian {
      private int[] nilai;


    public penilaian(int banyakMahasiswa){
        nilai = new int[banyakMahasiswa];
    }

    /**
     * @param args the command line arguments
     */
  public void setNilai(int index, int nilai){
        this.nilai[index] = nilai;
    }

    public void averagePenilaian(){
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +averageValue());
    }


    private double averageValue(){
        int total = 0;
        for (int i : nilai) {
            total+=i;
        }

        return total/nilai.length;
    }
    
}
