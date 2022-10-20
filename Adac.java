package teleapps;

public class Adac {
	public static void main(String[] args) {
		 String s1="aabbccbeeffggdabbc";
		 
		 int i, j;
		 int count=0;
		 char [] d=s1.toCharArray();
		 for (i = 0; i < d.length; i++) {
			for ( j = i+1; j < d.length; j++) {
				      if (d[i]==d[j]) {
					  count++;
					  d[j]=0;
				    	 }
			}
			if (d[i]>0) {
				System.out.print(d[i]+" ");
			}
		 }
	}
}
