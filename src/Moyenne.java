// Question 3.2.1

public class Moyenne {

	public static int moyenne(int tab[]) {
		int a,moyenne=0,somme=0,b=0,c=1;
		for (a=0;a<tab.length;a++){
			somme=somme+tab[a];
		}
		moyenne=somme/tab.length;
		for (b=0;b<tab.length;b++){
			if (moyenne==tab[b]){
				c=b;
				break;
			}else{
				c=0;	
			}	
		}
		System.out.println("La moyenne apparait ˆ l'indice "+c+".");			
		return moyenne;
	}
	public static void main(String[] args) {
		int [] tableau={3,4,3,3,6,5,4,50,5,9,7,1,2};
		System.out.print("La moyenne du tableau est "+moyenne(tableau)+".");
		
	}
}
