import java.util.Arrays;

// BONUS 3.2.3

public class Mediane {

	public static int[] tri(int tab[]) {
		int b=tab.length,temps=0, c=0, k=0;
		for (k=0;k<b;k++){ //recommence le tri � partir du d�but � chaque fin de cycle de tri.
			while (c<b-1){ //compare chaque voisin et les inverses si n�cessaire.
				if (tab[c]>tab[c+1]){
					temps=tab[c+1];
					tab[c+1]=tab[c];
					tab[c]=temps;
					c++;
				}else{
					c++;
				}
			}
			c=0; //remet � z�ro l'indice du tableau pour recommencer � analyser les valeurs.
		}
		System.out.println(Arrays.toString(tab));//affiche le tableau souhait�.
		return tab;
	}
	
	public static int mediane(int tab[]) {
		int mediane=0;
		if (tab.length%2==0){
			mediane=tab[(tab.length/2)-1];
			if (tab[tab.length/2-1]==tab[tab.length/2]){ // pour �viter "La m�diane du tableau est comprise entre 5 et 5."
				System.out.print("la m�diane du tableau est "+mediane);
			}else{
				float petitemoyenne=(float)(mediane+tab[tab.length/2])/2;
				System.out.print("La m�diane du tableau est comprise entre "+mediane+" et " + tab[tab.length/2]+", soit en moyenne : "+petitemoyenne+".");
			}
		}else{
			mediane=tab[1+tab.length/2];
			System.out.print("la m�diane du tableau est "+mediane);
		}
		return mediane;
	}

	public static void main(String[] args) {
		int [] tableau={2,6,3,2,6,6,6,0,9,7,1,2};
		mediane(tri(tableau));
	}
}
