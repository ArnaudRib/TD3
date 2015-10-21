//Question 3.1.3
import java.util.Scanner;
import java.util.Arrays;

public class CreationTableau2D {
	
	public static int [][] CreerTableau2D() {
		int ligne, colonne=0, b, c, d=0, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de lignes? ");
		ligne=sc.nextInt();
		System.out.print("Combien de colonnes? ");
		colonne=sc.nextInt();
		int[][] tab = new int[ligne][colonne];
		for (a=0;a<ligne;a++){
			for(b=0;b<colonne;b++){
				System.out.println("Quelle valeur voulez-vous dans le tableau? ");
				c=sc.nextInt();
				tab[a][b]=c;
			}
		}
		System.out.println("Le tableau de valeur est le suivant:");
		while (d<=(tab.length-1)){
			System.out.print(Arrays.toString(tab[d]));//affiche le tableau souhaitŽ.
			d=d+1;
		}
	return tab;
	}
	
	public static void main(String[] args) {
		CreerTableau2D();
	}
}
