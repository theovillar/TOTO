package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 -Déclaration de la collection
		SortedSet<Personne> set = new TreeSet<Personne>(new Comparator<Personne>() {   //C'est un constructeur internet (faire un click sur add chez pas quoi)
/*			@Override
			public int compare(Personne o1, Personne o2) {
				// TODO Auto-generated method stub
				if(o1.getNom().equals(o2.getNom())) //Le equals est mieux pour les chaines de caractère (si les deux sont égaux
				{
					return -o1.getPrenom().compareTo(o2.getPrenom()); //compareTo est une fonction qui renvoit 1 0 ou -1 => enfopnction égalité superioté 
				}
				else													//Si on ajoute un - devant o1 on inverse la chaine
				{
					return -o1.getNom().compareTo(o2.getNom());
				}
			}
		}); //On déclare une fonction internee
	*/			
/*		@Override
		public int compare(Personne o1, Personne o2) {
			// TODO Auto-generated method stub
			if(o1.getId()<o2.getId()) 										//Si on ajoute un - devant o1 on inverse la chaine
			{
				return +1;
			}
			else 
			return -1;
		}
	}); //On déclare une fonction internee
*/
			
			@Override
			public int compare(Personne o1, Personne o2) {
				// TODO Auto-generated method stub
				return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
			}
		}); //On décl
			
			
		
		// 2 -Création des objets personnes
		Personne n1 = new Personne(123, "VILLAR","Theo");
		Personne n2 = new Personne(124, "MARIN","EMMANUEL");
		Personne n3 = new Personne(125, "BAYA","Stephane");
		Personne n4 = new Personne(126, "BAYA","Flo");
		
		// 3 -Ajouter les personnes à la collection
		
		set.add(n1);
		set.add(n2);
		set.add(n3);
		set.add(n4);
		
		// 4 -Parcourir et afficher la collection
		
		for(Personne p : set) // Toute les personnes de set
		{
			System.out.println(p);
		}

	}

}
