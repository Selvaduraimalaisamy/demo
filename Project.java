package teleapps;

import java.util.*;
import java.util.Map.*;
public class Project {
public static void main(String[] args) {
	int balance=0;
	Map<String,Integer> mp =new LinkedHashMap<String,Integer>();
                    mp.put("vegcutlet",10);
                    mp.put("chickencutlet", 10);
                    mp.put("mushroomcutlet", 10);
                    mp.put("paneercutlet", 10);
                    mp.put("vegroll", 20);
                    mp.put("chickenroll", 20);
                    mp.put("mushroomroll", 20);
                    mp.put("paneerroll", 20);
                    mp.put("vegpuff", 30);
                    mp.put("chickenpuff", 30);
                    mp.put("mushroompuff", 30);
                    mp.put("paneer puff", 30);
                    mp.put("panipuri", 40);
                    mp.put("bhelpuri", 40);
                    mp.put("rasapuri", 40);
                    mp.put("masalpuri", 40);
                    System.out.println("Welcome venting machine");
                    System.out.println(mp);
				
         try (Scanner s = new Scanner(System.in)) {
			System.out.println("plz enter your amount");
			  int amount=s.nextInt();
			  if (amount<10) {
				System.out.println("your amount is to low");
				System.out.println("plz make some amount above Rs.10");
			}
			 
			  else {
				
			  System.out.println("your amount is --"+amount);
			  System.out.println("plz make some order");
			  
			  Set<Entry<String,Integer>> entrySet=mp.entrySet();
			  for (Entry<String, Integer> entry : entrySet) {
				if(entry.getValue()<=amount) {
				System.out.println(entry);
			}
			}
			 System.out.println("enter the product to get");
			   String product=s.next();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getKey().equalsIgnoreCase(product)) {
					System.out.println(entry.getKey()+"--Rs."+entry.getValue()+" it is your product");
					balance=amount-entry.getValue();
					System.out.println("your remaining balance is"+balance);
					System.out.println("do you want continue your order");
					System.out.println("if you want enter yes otherwise skip ");
					
					String res=s.next();
					if (res.equalsIgnoreCase("yes")) {
						  System.out.println(mp);
						 
					}
					
				}
			}
			  }
		}catch (Exception e) {
			System.out.println("enter the amount");
			
		}
          }
}     

