package apprendre;

import java.util.Scanner;

public class Conversion {
	public static void main(String Args []) {
		String r�ponse="oui";
		int essaie = 0;
		while (r�ponse.equals("oui")) {
		Scanner entr�e= new Scanner (System.in);
		if (essaie==0)
			System.out.println("Bienvenue dans ce convertisseur");
		System.out.println("choisissez un mode de conversion : "
				+ "\n 1-Conversion Celsus-Fahrenheit"
				+ "\n 2-Conversion Fahrenreit-Celsus");
		int choix = entr�e.nextInt();
		while (!(choix == 1 || choix == 2)) {
			System.out.println("r�ponse invalide, veuillez taper 1 ou 2");
			int choixcorrectif = entr�e.nextInt();
			choix=choixcorrectif;
		}
		if (choix==1) {
			System.out.println("veuillez donner v�tre valeur en Celsus");
			float Celsus= entr�e.nextFloat();
			float Fahrenreit= Celsus*9/5 + 32;
			System.out.println(Celsus + "�C correspond en Fahrenreit � :" + Fahrenreit + "�F");
		}
		else {
			System.out.println("veuillez donner v�tre valeur en F");
			float Fahrenreit= entr�e.nextFloat();
			float Celsus= (Fahrenreit-32) * 5/9;
			System.out.println(Fahrenreit + "�F correspond en Celsus � :" + Celsus +"�c");
		}
		System.out.println("voulez-vous recommencer ?");
		r�ponse = entr�e.next();
		while (!(r�ponse.equals("oui") || r�ponse.equals("non"))) {
			System.out.println("entr�e non valide, r�pondez par oui ou non");
			String r�ponsecorrectif=entr�e.next();
			r�ponse=r�ponsecorrectif;
		}
		essaie = essaie + 1;
		}
		System.out.println("� bient�t !");
	}
}
