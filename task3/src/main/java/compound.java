
public class compound {
	void compoundinterest(float principal,int time,float RateofInterest)
	{
		float compund_interest=(float) Math.pow(1+(RateofInterest/100),time);
		compund_interest=compund_interest*principal;
		compund_interest=compund_interest-principal;
		System.out.println("compound interest is "+compund_interest);	
	}
	

}
