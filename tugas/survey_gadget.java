import java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;


public class survey_gadget {
	 public static void main(String args[]) {

		int [][]jml_brg = {
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0},
			{0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}
		};
		
		int [] perKolom 		= new int[6];
		int sum_barang 		= 0;
		int tot_harga  		= 0;
		int persen			= 0;
		int tot_barang 		= 0;
		int min				= 999;
		int max 			= 0;
		String [] Nama 	= {"Kristin", "Anggy", "Novita", "Dheta", "Galih",
								"Ario", "Danica", "Morin", "Benediktus", "Putra",
								"Hanif", "Elmy", "Ainur", "Teghar", "Aditya", 
								"Ghifar","Daniel", "Cheva", "Malina", "Abu",
								"Zaki","Dicky", "Zain", "Mahardika", "Bella",
								"Rizal","Bryan", "Dodo", "Raymond", "Anita",
								"Erika","Aisyah", "Prasetya", "Fadlan", "Rendy",
								"Gege","Daus", "Bagus", "Putra", "Aries",
								"Rio","Imas", "Niemas", "Floura", "Pandji",
								"Afif","Hasan", "Hadi", "Agum", "Dewa"};
		
		//TOTAL SELURUH BARANG
		for(int i=0; i<Nama.length; i++){
			for (int j=0; j<jml_brg[i].length; j++) {
				tot_barang = tot_barang + jml_brg[i][j];
			}
		}

		System.out.println("Nama-Gadget	Android	Blacberry	IOS	Windows	Symbian	Lainnya");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		//TAMPILKAN DATA PENJUALAN
		for(int i=0; i<Nama.length; i++){
			sum_barang 	= 0;
			min			= 999;
			max			= 0;
			System.out.print(Nama[i]+"	");	
			for (int j=0; j<jml_brg[i].length; j++) {
				System.out.print("	 "+jml_brg[i][j]);
				perKolom[j] = perKolom[j] + jml_brg[i][j];
				sum_barang = sum_barang + jml_brg[i][j];
				if (jml_brg[i][j]>max) {
					max = jml_brg[i][j];
				}
				if (jml_brg[i][j]<min) {
					min = jml_brg[i][j];
				}
			}
			//System.out.print(" 	"+hrg_brg[i]);
			System.out.print("		 "+sum_barang);
			//System.out.print("		 "+(sum_barang*hrg_brg[i]));
			//System.out.print("		 "+(100*sum_barang/tot_barang+"%"));
			System.out.print("		 "+min);
			System.out.print("	 "+max);
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("TOTAL PER-HARI : ");
				
		//TOTAL PER-HARI
		for(int i=0; i<perKolom.length; i++){
				System.out.print("	 "+perKolom[i]);
			
		}
		
		System.out.println();
		System.out.println("max : " +max);
		System.out.println("min : " +min);



	 }
}