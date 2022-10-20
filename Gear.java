package teleapps;

import java.util.Scanner;

public class Gear extends inheritance1 {

      public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
System.out.println("Enter your gear: ");
    int gear=sc1.nextInt();
    Gear obj=new  Gear ();
    obj.speed(gear);
    System.out.println("Do you want to reduce your speed? 1.Yes 2.No");
    int option=sc1.nextInt();
    if(option==1) {
    inheritance1 .speed(gear-1);

    }else
    {
    System.out.println("Your speed is good to travel");
   
    }
     
}}




