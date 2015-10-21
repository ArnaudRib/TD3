import java.util.Arrays;

//Question 3.5

public class Dichotomie {

	public static int[] tri(int tab[]) {
		int b=tab.length,temps=0, c=0, k=0;
		for (k=0;k<b;k++){ //recommence le tri à partir du début à chaque fin de cycle de tri.
			while (c<b-1){ //compare chaque voisin et les inverses si nécessaire.
				if (tab[c]>tab[c+1]){
					temps=tab[c+1];
					tab[c+1]=tab[c];
					tab[c]=temps;
					c++;
					System.out.println(Arrays.toString(tab));//affiche le tableau souhaité.
				}else{
					c++;
				}
			}
			c=0; //remet à zéro l'indice du tableau pour recommencer à analyser les valeurs.
		}
		return tab;
	} 
	
	public static int dichotomie(int val, int[] tab) {
		 int a = 0, b = tab.length-1;
		 int i = 0;
		 while (i < tab.length) {
			 int milieu = (a + b)/2;
			 if (tab[milieu] == val) {
				 System.out.print("Le nombre à l'indice "+milieu+" est la valeur demandée, à savoir " + tab[milieu]+".");
				 return milieu;
			 } else {
				 if (tab[milieu] > val) {
					 b--;//on décrémente l'indice égal à la taille du tableau.
				 } else {
					 a++;//on incrémente l'indice nul au premier tour.
				 }
			 }
			 i++;
		 }
		 System.out.println("La valeur demandée, c'est ˆ dire "+val+", ne se trouve pas dans le tableau.");
		 return 1;
	}

	public static void main(String[] args) {
		int [] tableau={2,5,3,3,6,5,5,0,5,9,7,1,2};
		dichotomie(4,tri(tableau));
	}

}
