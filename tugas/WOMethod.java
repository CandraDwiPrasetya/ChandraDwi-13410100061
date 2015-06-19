public class WOMethod{
  
    public static void cetakGaris(){
    for(int i=0;i<25;i++)
      System.out.print("*");
      System.out.println();
        
    }
    public static void cetakGaris(int pajangGaris){
      for(int i=0;i<pajangGaris;i++)
      System.out.print("*");
      System.out.println();
    } 
    public static void cetakGaris(int panjangGaris,String bentuk){
    for(int i=0;i<panjangGaris;i++)
      System.out.print(bentuk);
    System.out.println();
    }
    
    
    public static void main(String []argv){
      cetakGaris(10,"#");
      System.out.println("viw data custamer");
      cetakGaris(35,"0");
      System.out.println("id/tnama/tAlamat");
      cetakGaris();
    } 
}
    
  