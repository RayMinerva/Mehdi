package apprendre;

import java.util.*;

public class JeuTextuel {
	public static void main (String [] args)
	{
		Scanner entree= new Scanner(System.in);
		System.out.println("Bienvenue !");
		String LineP= entree.next();
		while (!(LineP.equals("Coucou") || LineP.equals("Bonjour") || LineP.equals("Bonsoir") || LineP.equals("Yo"))) 
			{
			System.out.println("On dit coucou, un peu de respect !");
			String LineSalut= entree.next();
			LineP=LineSalut;
			}
		System.out.println("C'est quoi vôtre nom ? ");
		String Nom= entree.next();
		System.out.println("Et vôtre prénom ?");
		String Prénom= entree.next();
		System.out.println("et vous êtes un homme ou une femme ?");
		String Sexe = entree.next();
		while (!(Sexe.equals("Homme") || Sexe.equals("Femme")))
				{
			if ((Sexe.equals("Genderfluid")))
					System.out.println("ce que vous trouvez dans la liste de Wattpad ne compte pas");
			else
					System.out.println("quoi que vous ayez tapé, ce n'est pas un sexe");
			String Sexe1 = entree.next();
			Sexe=Sexe1;
				}
		if (Sexe.equals("Homme"))
		{
			System.out.println("Bien Monsieur " + Nom + " " + Prénom + " ! nous allons jouer à un jeu !"
					+ "\nLe jeu est simple, vous allez essayer de trouver le nombre mystère, je vais vous donner des indices bien sûr, sinon ça serait trop long...."
					+ "\nvoulez-vous jouer ?");
			}
		else
		{
			System.out.println("Bien Mademoiselle " + Nom + " " + Prénom + " ! nous allons jouer à un jeu !"
					+ "\nLe jeu est simple, vous allez essayer de trouver le nombre mystère, je vais vous donner des indices bien sûr, sinon ça serait trop long...."
					+ "\nvoulez-vous jouer ? (Oui/Non)");
		}
		String Réponse=entree.next();
		while (!(Réponse.equals("Oui") || Réponse.equals("Non")))
		{
			System.out.println("je n'ai pas très bien compris, pouvez-vous me re-répondre ?");
			String RéponseCorrectif=entree.next();
			Réponse=RéponseCorrectif;
		}
		if (Réponse.equals("Oui"))
		{	
		Random Random= new Random();
		int NombreMystère= Random.nextInt(10) + 1;
		System.out.println("Bien, commençons !");
		int NombreDonné= entree.nextInt();
		int essais=0;
		while ((NombreDonné>10) || (1>NombreDonné))
		{
			int NombreDonnéError1=entree.nextInt();
			NombreDonné=NombreDonnéError1;
		}
		while (!(NombreDonné==NombreMystère))
		{
			System.out.println("Faux ! Allez essayez encore !");
			essais=essais+1;
			if (essais>=3 && 6>essais)
			{
				int NombreMystèreEasy=Random.nextInt(5) + 1;
				NombreMystère=NombreMystèreEasy;
				System.out.println("en plus, je sens que la chance vous sourit !");
				int RéponseEasy=entree.nextInt();
				NombreDonné=RéponseEasy;
				while ((NombreDonné>5) || (1>NombreDonné))
				{
					System.out.println(".... c'est entre 1 et 5");
					int NombreDonnéErrorEasy=entree.nextInt();
					NombreDonné=NombreDonnéErrorEasy;
				}
			}
			if (essais>=6 && 9>essais)
			{
				int NombreMystèreBaby=Random.nextInt(2) + 1;
				NombreMystère=NombreMystèreBaby;
				System.out.println("Bon. On va vous aider encore un peu");
				int RéponseBaby=entree.nextInt();
				NombreDonné=RéponseBaby;
				while ((NombreDonné>2) || (1>NombreDonné))
				{
					System.out.println("vos parents doivent vraiment être déçus de vous"
							+ "\nessayez 1 ou 2 et fichez-moi la paix.");
					int NombreDonnéErrorBaby=entree.nextInt();
					NombreDonné=NombreDonnéErrorBaby;
				}
			}
			if (essais>=9)
			{
				int NombreMystèrePLEASEJUSTWINALREADY=1;
				NombreMystère=NombreMystèrePLEASEJUSTWINALREADY;
				System.out.println("tapez 1, qu'on en finisse....");
				while (NombreDonné!=1)
				{
					System.out.println("j'ai dit :"
							+ "t a p e z  1");
					int NombreDonnéErrorWINALREADY=entree.nextInt();
					NombreDonné=NombreDonnéErrorWINALREADY;
				}
		}
			if (essais>0 && 3>essais)
			{
			int NombreRéponse=entree.nextInt();
			NombreDonné=NombreRéponse;
			}
		}
		if (essais>=9)
		{
		System.out.println("j'espère que vous étiez un chat depuis le début, ça expliquerait tellement de choses...");
		}
		else if (essais>=6)
		{
			System.out.println("vous êtes vraiment pas une flèche...");
		}
		else if (essais>=3)
		{
			if (Sexe.equals("Homme"))
			{
				System.out.println("vous vous en êtes pas trop mal sorti !");
			}
			else
			{
				System.out.println("vous vous en êtes pas trop mal sortie !");
			}
		}
		else if (essais>0)
		{
			if (Sexe.equals("Homme"))
			{
				System.out.println("vous êtes un bon joueur, monsieur " + Prénom);
			}
			else
			{
				System.out.println("vous êtes une bonne joueuse, mademoiselle " + Prénom);
			}
		}
		else if (essais==0)
		{
			System.out.println("Eh bah ! quel pro !");
		}
		}
		else
		{
			System.out.println("Ah.... Bon, d'accord.");
		}
}
}
