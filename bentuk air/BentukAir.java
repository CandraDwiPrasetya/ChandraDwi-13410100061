import java.util.*;
public class BentukAir{
  public static void main(String[]argc){
    Scanner sc= new Scanner (System.in);
    System.out.println("Masukan Temperatur Air : (Celicius)");
    int temp=sc.nextInt();
    if (temp<0){
    System.out.println("Zat Padat");
    }else if ((temp>=0) && (temp<100)){
    System.out.println("Zat Cair");
    }else{
    System.out.println("Zat Gas");
    }
  }
}