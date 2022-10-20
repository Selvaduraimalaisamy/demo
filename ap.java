package teleapps;
	public class ap {
		public static void main(String[]args)
		{
			int[] arr= {1,3,1,2,3,3,4,4,7,7,7,7,8,3,3,9};
		 
			 
			 int count=0;
			 for (int i = 0; i < arr.length; i++) {
				for ( int j = i+1; j < arr.length; j++) {
					      if (arr[i]==arr[j]) {
						  count++;
						  arr[j]=0;
					    	 }
				}
				if (arr[i]>0) {
					System.out.print(arr[i]+" ");
				}
			}
				
			
		}

	}

