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
		System.out.println("C'est quoi v�tre nom ? ");
		String Nom= entree.next();
		System.out.println("Et v�tre pr�nom ?");
		String Pr�nom= entree.next();
		System.out.println("et vous �tes un homme ou une femme ?");
		String Sexe = entree.next();
		while (!(Sexe.equals("Homme") || Sexe.equals("Femme")))
				{
			if ((Sexe.equals("Genderfluid")))
					System.out.println("ce que vous trouvez dans la liste de Wattpad ne compte pas");
			else
					System.out.println("quoi que vous ayez tap�, ce n'est pas un sexe");
			String Sexe1 = entree.next();
			Sexe=Sexe1;
				}
		if (Sexe.equals("Homme"))
		{
			System.out.println("Bien Monsieur " + Nom + " " + Pr�nom + " ! nous allons jouer � un jeu !"
					+ "\nLe jeu est simple, vous allez essayer de trouver le nombre myst�re, je vais vous donner des indices bien s�r, sinon �a serait trop long...."
					+ "\nvoulez-vous jouer ?");
			}
		else
		{
			System.out.println("Bien Mademoiselle " + Nom + " " + Pr�nom + " ! nous allons jouer � un jeu !"
					+ "\nLe jeu est simple, vous allez essayer de trouver le nombre myst�re, je vais vous donner des indices bien s�r, sinon �a serait trop long...."
					+ "\nvoulez-vous jouer ? (Oui/Non)");
		}
		String R�ponse=entree.next();
		while (!(R�ponse.equals("Oui") || R�ponse.equals("Non")))
		{
			System.out.println("je n'ai pas tr�s bien compris, pouvez-vous me re-r�pondre ?");
			String R�ponseCorrectif=entree.next();
			R�ponse=R�ponseCorrectif;
		}
		if (R�ponse.equals("Oui"))
		{	
		Random Random= new Random();
		int NombreMyst�re= Random.nextInt(10) + 1;
		System.out.println("Bien, commen�ons !");
		int NombreDonn�= entree.nextInt();
		int essais=0;
		while ((NombreDonn�>10) || (1>NombreDonn�))
		{
			int NombreDonn�Error1=entree.nextInt();
			NombreDonn�=NombreDonn�Error1;
		}
		while (!(NombreDonn�==NombreMyst�re))
		{
			System.out.println("Faux ! Allez essayez encore !");
			essais=essais+1;
			if (essais>=3 && 6>essais)
			{
				int NombreMyst�reEasy=Random.nextInt(5) + 1;
				NombreMyst�re=NombreMyst�reEasy;
				System.out.println("en plus, je sens que la chance vous sourit !");
				int R�ponseEasy=entree.nextInt();
				NombreDonn�=R�ponseEasy;
				while ((NombreDonn�>5) || (1>NombreDonn�))
				{
					System.out.println(".... c'est entre 1 et 5");
					int NombreDonn�ErrorEasy=entree.nextInt();
					NombreDonn�=NombreDonn�ErrorEasy;
				}
			}
			if (essais>=6 && 9>essais)
			{
				int NombreMyst�reBaby=Random.nextInt(2) + 1;
				NombreMyst�re=NombreMyst�reBaby;
				System.out.println("Bon. On va vous aider encore un peu");
				int R�ponseBaby=entree.nextInt();
				NombreDonn�=R�ponseBaby;
				while ((NombreDonn�>2) || (1>NombreDonn�))
				{
					System.out.println("vos parents doivent vraiment �tre d��us de vous"
							+ "\nessayez 1 ou 2 et fichez-moi la paix.");
					int NombreDonn�ErrorBaby=entree.nextInt();
					NombreDonn�=NombreDonn�ErrorBaby;
				}
			}
			if (essais>=9)
			{
				int NombreMyst�rePLEASEJUSTWINALREADY=1;
				NombreMyst�re=NombreMyst�rePLEASEJUSTWINALREADY;
				System.out.println("tapez 1, qu'on en finisse....");
				while (NombreDonn�!=1)
				{
					System.out.println("j'ai dit :"
							+ "t a p e z  1");
					int NombreDonn�ErrorWINALREADY=entree.nextInt();
					NombreDonn�=NombreDonn�ErrorWINALREADY;
				}
		}
			if (essais>0 && 3>essais)
			{
			int NombreR�ponse=entree.nextInt();
			NombreDonn�=NombreR�ponse;
			}
		}
		if (essais>=9)
		{
		System.out.println("j'esp�re que vous �tiez un chat depuis le d�but, �a expliquerait tellement de choses...");
		}
		else if (essais>=6)
		{
			System.out.println("vous �tes vraiment pas une fl�che...");
		}
		else if (essais>=3)
		{
			if (Sexe.equals("Homme"))
			{
				System.out.println("vous vous en �tes pas trop mal sorti !");
			}
			else
			{
				System.out.println("vous vous en �tes pas trop mal sortie !");
			}
		}
		else if (essais>0)
		{
			if (Sexe.equals("Homme"))
			{
				System.out.println("vous �tes un bon joueur, monsieur " + Pr�nom);
			}
			else
			{
				System.out.println("vous �tes une bonne joueuse, mademoiselle " + Pr�nom);
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
