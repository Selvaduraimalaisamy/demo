package teleapps;

import java.util.Arrays;

public class MinMax_2d {
	public static void main(String[] args) {
		int i,j;
		int a [][]= {{10,2,100},{300,4,200}};
		
		int max = a[0][0];
		
		int min = a[0][0];
		
		for(i = 0;i<a.length;i++)  //3
		{
			for(j=0;j<a[i].length;j++)  //
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				else if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
			}
			
			
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
}
}
