package teleapps;

public class CountOcc {
	  public static void main(String args[])
	  { 
	  String input = "aaaabbccAAdd";
	  char search = 'c';            
	  int count=0;
	  for(int i=0; i<input.length(); i++)
	  {
	      if(input.charAt(i) == search)
	      count++;
	  }
	  System.out.println("The Character '"+search+"' found in"+count+" times.");
	  }
	}