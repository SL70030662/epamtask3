import java.util.Scanner;
public class driver
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		float principal,RateofInterest;
		int time;
		principal=scanner.nextFloat();
		RateofInterest=scanner.nextFloat();
		time=scanner.nextInt();
		simple s=new simple();
		compound c=new compound();
		s.simpleinterest(principal, time, RateofInterest);
		c.compoundinterest(principal, time, RateofInterest);
		
		scanner.close();
		
		
		
	}
}
