//Question 3.1.1
import java.util.Scanner;
import java.util.Arrays;

public class CreationTableau {
	
	public static int [][] CreerTableau1D() {
		int a,b=0,c,d=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quelle dimension de tableau?");
		a=sc.nextInt();
		int[][] tab = new int[1][a];
		while (b<a){
			System.out.println("Quelle valeur voulez-vous dans le tableau? ");
			c=sc.nextInt();
			tab[0][b]=c;
			b=b+1;
		}
		System.out.println("Le tableau de valeur est le suivant:");
		while (d<a){
			System.out.print(Arrays.toString(tab[d]));//affiche le tableau souhaitŽ.
			d=d+a;
		}
	return tab;
	}
	
	public static void main(String[] args) {
			CreerTableau1D();
	}
}
