import java.util.*;
class kali{
	public static void main (String[]args){
	Scanner sc = new Scanner (System.in);
	int bilangan1;
	int bilangan2;
			System.out.println("===========================");
			System.out.println("       Perkalian  		");
			System.out.println("===========================");
			System.out.print("Masukkan Bilangan 1 : ");
			bil1=sc.nextInt();
			System.out.print("Masukkan Bilangan 2 : ");
			bil2=sc.nextInt();
			
			System.out.println("===========================");
			System.out.print("Hasil : " + bilangan1 + " x " + bilangan2 + " = ");
			System.out.print(bilangan2);
		for (int a=bilangan1-1; a>0; a--) {
				if(a>0){
					System.out.print(" + " + bilangan2);
				}
		}
		System.out.print(" = " + bilangan1*bilangan2);
		
	}
}