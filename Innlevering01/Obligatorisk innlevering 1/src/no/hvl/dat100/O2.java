package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 
{

	public static void main(String[] args) 
	{
		for(double i = 1; i<=10; i++) 
		{
			
		
		String PoengsumTxt = showInputDialog("Skriv inn poengsummen din: ");
		
		double Poengsum = Double.parseDouble(PoengsumTxt);
	
		if (Poengsum>=0 && Poengsum<=100) 
		{
			if (Poengsum>0 && Poengsum<=39)
			{
				System.out.println("Karakter = F. " + "Poengsummen din er: " + Poengsum);
			}
			else if (Poengsum>=40 && Poengsum<=49)
			{
				System.out.println("Karakter = E " + "Poengsummen din er: " + Poengsum);
			}
			else if (Poengsum>=50 && Poengsum<=59)
			{
				System.out.println("Karakter = D " + "Poengsummen din er: " + Poengsum);
			}
			else if (Poengsum>=60 && Poengsum<=79)
			{
				System.out.println("Karakter = C " + "Poengsummen din er: " + Poengsum);	
			}
			else if (Poengsum>=80 && Poengsum<=89)
			{
				System.out.println("Karakter = B " + "Poengsummen din er: " + Poengsum);
			}
			else if (Poengsum>=90 && Poengsum<=100)
			{
				System.out.println("Karakter = A " + "Poengsummen din er: " + Poengsum);
			}
		}
		else 
		{
			System.out.println("Ikke gyldig poengsum, prøv på nytt!");
		}
	}
  }
}
