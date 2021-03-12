package pkgswitch.pkgcase;

import java.util.Scanner;

public class SwitchCase {
   
    public static void main(String[] args)
    {
    int choice;
    System.out.println("choose any iteam you want:\n1.KFC with Mayonnaise and sauce \n2.Nuggets and Mojito "
            + "\n3.Pasta with sauce \n4.Sandwich with Mayonnaise \n5.Triple Deck Cheese Pizza");
    Scanner s= new Scanner(System.in);
    choice= s.nextInt();
    switch(choice)
  {
       case 1:
          System.out.println("You ordered KFC with Mayonnaise and sauce it costs RS:350");
          break;
       case 2:
          System.out.println("You ordered Nuggets and Mojito it costs RS:150");
          break;
       case 3:
          System.out.println("You ordered Pasta with sauce it costs RS:299");
          break;
       case 4:
          System.out.println("You ordered Sandwich with Mayonnaise it costs RS:199");
          break;
       case 5:
          System.out.println("You ordered Triple Deck Cheese Pizza it costs RS:450");
          break;
       default :System.out.println("invalid choice");
  }
    }
   
}
