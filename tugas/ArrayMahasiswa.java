import java.io.*;
public class ArrayMahasiswa {
  public static void main (String[]args) throws Exception{
    
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    String []HariHari ={"Senin","Selasa","Rabu","Kamis","Jumat","sabtu","minggu"};
        String []BarangBarang ={"Buku Tulis","Kertas Lipat","Bolpoint","Pensil"};
        int[] HargaBarang={4500,3500,2500,1700};
        int[] TotalDalamHari=new int[7];
         int[] TotalDalamMinggu=new int[7];
        int[] SUBTotal=new int[4];
        int[] Total=new int[7];
        int[] Barang=new int[7];
        int[] Laris=new int[4];
           int[] Terjual=new int[7];
        int TotalSemuaBarang =0;
        
        int BarangDalamMinggu =0;
        int  BarangMinimal=100000;
        int BarangMaksimal =0;
        int Maksimal =0;
        String Laku;
        String KurangLaku;
        String Hari;
        
        for(int i=0;i<7;i++){
        
          System.out.println();
          System.out.println("*"+"Barang-Barang Yang Terjual Pada Hari"+ HariHari[i]+"*");
          System.out.println();
          
          for(int j=0; j<4; j++){
          
            System.out.print("Jumlah"+BarangBarang[j]+"Yang Terjual:");
            Terjual[j] = Integer.parseInt(br.readLine());
            Laris[j]+=Terjual [j];
            SUBTotal[j]=HargaBarang[j]*Terjual[j];
            Total[i]=Total[i]+SUBTotal[j];
            TotalDalamMinggu= TotalDalamMinggu + SUBTotal[j];
            Barang[i]= Barang[i]+ Terjual[j];
            TotalSemuaBarang=TotalSemuaBarang+Terjual[j];
          }
          TotalDalamSehari[i]=Total[i];
          Terjual[i]=Barang[i];
          System.out.println();
          System.out.println("---------------------------------------------");
          System.out.println(">>Total Pendapatan DiHari"+HariHari[i]+"sejumlah   :Rp."+TotalDalamHari[i]+",-");
          System.out.println();
          System.out.println(">>Total Barang Yang Di Beli"+HariHari[i]+"sejumlah   :Rp."+Terjual[i]+"Barang");
           System.out.println(">>--------------------------------------------"); 
                               
                             
        }
     Maksimal=0;
     Maksimal=TotalDalamHari[0];
     Hari=HariHari[0];
     
     for(int k=0;k<HAriHari.length;k++){
     
     if(TotalDalamHari[k]>Maksimal)
     {
     Maksimal=TotalDalamHari[k];
     Hari=HariHari[k];
     }
    }
     BarangMaksimal=0;
     BarangMinimal=100000;
     Laku=BarangBarang[0];
     KurangLaku=BarangBarang[0];
     
     for(int m=0;m<4;m++){
       if(Laris[m]>BarangMaksimal){
     
     BarangMaksimal=Laris[m];
       KurangLaku=BarangBarang[m];
       }

     if(Laris[m]<BarangMinimal);{
     BarangMinimal=Laris[m];
     KurangLaku=BarangBarang[m];
     }
   }
       System.out.println();
       System.out.println();
          System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
          System.out.println(">>Total Pendapatan DiHari"+HariHari[i]+"sejumlah   :Rp."+TotalDalamHari[i]+",-");
          System.out.println();
          System.out.println(">>Total Barang Yang Di Beli"+HariHari[i]+"sejumlah   :Rp."+Terjual[i]+"Barang");
           System.out.println(">>--------------------------------------------"); 
       }
}