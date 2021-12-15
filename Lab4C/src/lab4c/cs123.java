package lab4c;

public class cs123 {

	public static void main(String[] args) {
		//Variable declaration
		int sum=0, i = 200 ;
		//Explains what the program does
		System.out.println("Number between 200 and 250, divisible by 7:");
		//While numbers are less than 250
		while (i < 250)
		{	//if numbers are divisible by 7
			if(i%7==0)
			{
				sum=sum+i;
				System.out.print(i+" ");
			}
			i++;
		}
		//Output
		System.out.println("\nThe sum is: "+sum);
		
		
		}

}
