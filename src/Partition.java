import java.util.Arrays;
//Question 3.2.2

public class Partition {

	public static int[] partition(int tab[]) {
		int a,moyenne=0,somme=0,g=0,d=tab.length-1,temps=0;
		for (a=0;a<tab.length;a++){
			somme=somme+tab[a];
		}
		moyenne=somme/tab.length;
		while (g<d){
			if (tab[d]<moyenne){
				temps=tab[g];
				tab[g]=tab[d];
				tab[d]=temps;
				d--;
			}
			while (tab[g]<moyenne){
				System.out.println(Arrays.toString(tab));//affiche le tableau souhaité.
				g=g+1;
				}
			while (tab[d]>moyenne){
				System.out.println(Arrays.toString(tab));//affiche le tableau souhaité.
				d=d+1;
				}
		}
		return tab;
	}
	public static void main(String[] args) {
		int a=0, somme=0, moyenne;
		int [] tableau={3,4,3,3,6,5,4,0,5,9,7,1,2};
		for (a=0;a<tableau.length;a++){
			somme=somme+tableau[a];
		}
		moyenne=somme/tableau.length;
		System.out.println("La moyenne du tableau est "+ moyenne+".");
		partition(tableau);
	}
}
