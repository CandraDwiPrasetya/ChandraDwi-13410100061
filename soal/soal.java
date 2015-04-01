import java.io.*;
public class soal
{
   public static void main (String []argh) throws IOException
 {
  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.print("Masukkan Jumlah soal : ");
     int c=Integer.parseInt(br.readLine());
  
  int a;
  int b;
  int d=10;
  int benar=0;
  int salah=0;
  int jawab;
  int jawabBenar;
  
 
   System.out.println ("");
   for(c=1; c<=d; c++)
    {
   
     a=(int)(Math.random()*10);
     b=(int)(Math.random()*10);
     
    System.out.print ((a+1)+" . "+ a +" + " + b + " = " );
   
     jawab=Integer.parseInt(br.readLine());
     jawabBenar=a+b;
    
     if(jawabBenar==jawab)
     {
       benar=benar+1;
     }
     else
     {
       salah=salah+1;
     }
   }
     System.out.println("jawaban benar :     "+benar);
     System.out.println("jawaban salah:"+salah);
    System.out.println("presentase kebenaran  :"+benar*10+" "+"%");
  
                       
                       
                       
   }
}