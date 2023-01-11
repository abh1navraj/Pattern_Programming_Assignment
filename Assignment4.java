package Assignments;

public class Assignment4 {

	public static void main(String[] args) {
		
		int n=18;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(j<=i-(n-1)/2
				|| (i+j>=3*(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
