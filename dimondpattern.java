package teleapps;

public class dimondpattern {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0;i<n*2;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if(i+j<n+1 || i+j>=3*n || i-j <= -n || i-j>=n)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();	
		}	
	}

}
