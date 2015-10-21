// Question 3.4
import java.util.Arrays;

public class Recherche {

	public static int Recherche(int val, int tab []){ //création de la fonction search
		int x;
		int place=-1;
		for (x=0; x<tab.length; x++){
			if (tab[x]==val){
				place=x;
				break;
			}
		}
		if (place==-1){
			System.out.print("La valeur "+val+" ne se trouve pas dans le tableau suivant : ");
			System.out.println(Arrays.toString(tab));
		}else{
			System.out.print("La valeur "+val+" se trouve à la place n°"+place+" dans le tableau suivant : ");
			System.out.println(Arrays.toString(tab));
			}
		return place;
	}

	public static void main(String[] args) {
		int [] tab1= {1,2,3,4,5};
		Recherche(55,tab1);
		Recherche(5,tab1);
		int [] tab2 = {9,8,7,6,5,4,3,2,1,5};
		Recherche(9,tab2);
		Recherche(5,tab2);
		}
}