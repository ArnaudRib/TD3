import java.util.Arrays;
//Question 3.3

public class TriTableau {

	public static int[] tri(int tab[]) {
		int b=tab.length,temps=0, c=0, k=0;
		for (k=0;k<b;k++){ //recommence le tri � partir du d�but � chaque fin de cycle de tri.
			while (c<b-1){ //compare chaque voisin et les inverse si n�cessaire.
				if (tab[c]>tab[c+1]){
					temps=tab[c+1];
					tab[c+1]=tab[c];
					tab[c]=temps;
					c++;
					System.out.println(Arrays.toString(tab));//affiche le tableau souhait�.
				}else{
					c++;
				}
			}
			c=0; //remet � z�ro l'indice du tableau pour recommencer � analyser les valeurs.
		}
		return tab;
	}

	public static void main(String[] args) {
		int [] tableau={3,4,3,3,6,5,4,0,5,9,7,1,2};
		tri(tableau);
	}
}
