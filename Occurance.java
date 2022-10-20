package teleapps;

public class Occurance {
	public static void main(String[]args)
	{
		int[] arr= {1,3,1,2,3,3,4,4,7,7,7,7,8,3,3,9};
	for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				int aara=arr[i];
				int count=0;
				for (int j = 0; j < arr.length; j++) {
					if(aara==arr[j]) {
						count++;
						arr[j]=0;
					}
					
				}System.out.println(aara+"--->"+count);
			}
		}
			
		
	}

}


