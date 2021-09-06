package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 
{

	public static void main(String[] args)
	{
		String BruttolonnTxt = showInputDialog("Bruttolønn");
		
		double Bruttolonn = Double.parseDouble(BruttolonnTxt);
		double Prosent = 0;
		
		if (Bruttolonn>164101 && Bruttolonn<230590)
		{
			Prosent=0.93;
			showMessageDialog(null, "Prosent: " + Prosent + " " + "Bruttoinntekt: " + Bruttolonn*Prosent);
		}
		else if (Bruttolonn>230591 && Bruttolonn<580650)
		{
			Prosent=2.41;
			showMessageDialog(null, "Prosent: " + Prosent + " " + "Bruttoinntekt: " + Bruttolonn*Prosent);
		}
		else if (Bruttolonn>580651 && Bruttolonn<934050)
		{
			Prosent=11.52;
			showMessageDialog(null, "Prosent: " + Prosent + " " + "Bruttoinntekt: " + Bruttolonn*Prosent);
		}
		else if (Bruttolonn>934051)
		{
			Prosent=14.52;
			showMessageDialog(null, "Prosent: " + Prosent + " " + "Bruttoinntekt: " + Bruttolonn*Prosent);
		}
		else 
			showMessageDialog(null, "Prosent = 0");
		
	}

}
