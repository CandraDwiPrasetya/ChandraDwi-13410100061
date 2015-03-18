import java.util.*;
public class Tebakgambar{
  public static void main(String[]args){
  Scanner sc=new Scanner (System.in);
  System.out.print("masukkan tebakan gambar(1/0):");
  
  int tebakanuser;
  int tebakankomputer;
  int angkatebakan;
  String user;
  String komputer;
  String angkatbkan;
  tebakanuser=sc.nextInt();
    if (tebakanuser==1 || tebakanuser==0) {
    if (tebakanuser==1){
     tebakankomputer=0;
     
    }else {
    tebakankomputer=1;
       }
    
    angkatebakan=(int)(Math.random()+0.5);
    
    if (tebakanuser==1) {
     user= "gambar";
     komputer= "angka";
    } else{
     komputer="gambar";
     user="angka";
    }
    
    if (angkatebakan==1){
    angkatbkan="gambar";
    
    }else{
    angkatbkan="angka";
    }
    
    System.out.println("tebakan anda: "+user);
    System.out.println("tebakan komputer: "+komputer);
    System.out.println("koin ynag harus ditebak: "+angkatbkan);
    
    if (user==angkatbkan){
      System.out.println("selamat, anda menang");
    }else {
      System.out.println ("maaf anda ditolak cari lagi yang lain");
    }
    }else {
      System.out.println ("silahkan masukkan angka 1 dan 0");
    } 
  }
}