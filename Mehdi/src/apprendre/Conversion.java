package apprendre;

import java.util.Scanner;

public class Conversion {
	public static void main(String Args []) {
		String réponse="oui";
		int essaie = 0;
		while (réponse.equals("oui")) {
		Scanner entrée= new Scanner (System.in);
		if (essaie==0)
			System.out.println("Bienvenue dans ce convertisseur");
		System.out.println("choisissez un mode de conversion : "
				+ "\n 1-Conversion Celsus-Fahrenheit"
				+ "\n 2-Conversion Fahrenreit-Celsus");
		int choix = entrée.nextInt();
		while (!(choix == 1 || choix == 2)) {
			System.out.println("réponse invalide, veuillez taper 1 ou 2");
			int choixcorrectif = entrée.nextInt();
			choix=choixcorrectif;
		}
		if (choix==1) {
			System.out.println("veuillez donner vôtre valeur en Celsus");
			float Celsus= entrée.nextFloat();
			float Fahrenreit= Celsus*9/5 + 32;
			System.out.println(Celsus + "°C correspond en Fahrenreit à :" + Fahrenreit + "°F");
		}
		else {
			System.out.println("veuillez donner vôtre valeur en F");
			float Fahrenreit= entrée.nextFloat();
			float Celsus= (Fahrenreit-32) * 5/9;
			System.out.println(Fahrenreit + "°F correspond en Celsus à :" + Celsus +"°c");
		}
		System.out.println("voulez-vous recommencer ?");
		réponse = entrée.next();
		while (!(réponse.equals("oui") || réponse.equals("non"))) {
			System.out.println("entrée non valide, répondez par oui ou non");
			String réponsecorrectif=entrée.next();
			réponse=réponsecorrectif;
		}
		essaie = essaie + 1;
		}
		System.out.println("à bientôt !");
	}
}
