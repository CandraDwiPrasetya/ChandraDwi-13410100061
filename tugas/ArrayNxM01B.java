public class ArrayNxM01B{
  public static void main (String[]argx){
    int [][]data={
      {1,1,0,0,0,0},
      {1,1,0,0,0,0},
      {0,0,1,0,0,0},
      {0,0,0,1,0,0},
      {0,0,0,0,1,0},
      {0,0,0,0,0,1},
      
      {1,0,0,0,0,0},
      {0,1,0,0,0,0},
      {0,0,1,0,0,0},
      {0,0,0,1,0,0},
      {0,0,0,0,1,1},
      {0,0,0,0,1,1},
      
      {0,0,0,0,1,1},
      {0,0,0,0,1,1},
                            
      {0,0,0,1,0,0},
      {0,0,1,0,0,0},
      {0,1,0,0,0,0},
      {1,0,0,0,0,0},
      
      {0,0,0,0,0,1},
      {0,0,0,0,1,0},
      {0,0,0,1,0,0},
      {0,0,1,0,0,0},
      {1,1,0,0,0,0},
      {1,1,0,0,0,0}};
    for (int i=0;i<data.length; i++){
      for (int j=0; j<data[i].length;j++){
    System.out.print((data [i][j]==1)?"#":".");
      }
      System.out.println();
    }
      
      }
}