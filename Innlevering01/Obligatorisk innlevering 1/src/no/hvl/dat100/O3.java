package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3
{

	public static void main(String[] args)
	{
 
		String Tall1txt = showInputDialog("Skriv inn et tall:");
		
		int n = Integer.parseInt(Tall1txt);
		
		int a = 1;
		
		if(n >= 0)
		{
			
		
			for(int i = 1; i<=n; i++) 
			{
			
				a = a*i;
		
				
			}
			showMessageDialog(null,"Tallet er: " + a);
		}
		
		else
		{
			showMessageDialog(null,"Trenger et godkjent tall!");
		}
		}
	}		


