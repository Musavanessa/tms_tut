import java.util.Scanner
public class ConstractorFees
{// begin class
	public static void main (String []agrs)
	{//begin main method 
		Scanner kb =new Scanner (System.in);
		// declere constant values 
		final double TARIFF=65.45;
		Final double DEPOSIT =10%;
		// declere variables 
		double rLength, rWidth, rArea, rTotalCost, rDeposit, rBalance;
		//input
		System.out.print("What is the length of the room ?");
		rLength =kb.nextdouble();
		System.out.print("what is the width of the room ?");
		rWidth =kb.nextdouble();
		//processing 
		rArea = rLength*rWidth;
		rTotalCost = rArea*TARIFF;
		rDeposit = rTotalCost*(10/100);
		rBalance = rTotalCost-rDeposit;
		//output 
		System.out.println("The area of the room is"+ rAREA +"Math.pow(m(2))");
		System.out.println("The total cost is R"+rTotalCost);
		System.out.println("Your deposit is R"+rDeposit);
		System.out.printin("Your balance is R"+rBalance);
		
	
	}
}