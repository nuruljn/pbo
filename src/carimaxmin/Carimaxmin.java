
package carimaxmin;

import javax.swing.JOptionPane;


public class Carimaxmin {

   public static void main(String[] args) {
        int[] nilai = new int[10];
        int n,max,min,jml=0,r;
        int i;
        
        String jumlahdata = JOptionPane.showInputDialog("Masukkan jumlah data: ");
        n = Integer.parseInt(jumlahdata);
           
        for (i = 0; i<n; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            jml=jml+nilai[i];
            System.out.println("Input Angka: "+bilangan);
        }
        
      
        min=nilai[0];
        max=nilai[0];
       
        for (i=0; i<n; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        r=jml/n;
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);     
        System.out.println("Nilai rata-rata = "+r); 
    }
    
}
