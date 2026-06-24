//  ROCK PAPER SOISSER GAME 

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Soisser {
    public static void main(String[] args) {
        // 1 for  rock
        // 2 for paper
        // 3 for soissor

        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("1 FOR ROCK : ");
        System.out.println("2 FOR PAPER : ");
        System.out.println("3 FOR SOISSER : ");
         System.out.print(" Enter no:");
        int userInput = sc.nextInt();


        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println(" drow...");

        }
        else if ( userInput == 1 && computerInput == 3 || userInput == 2 && computerInput ==  1 || userInput == 3 && computerInput == 2)
        {
            System.out.println("congretulation you win..");
            System.out.println(" well plead..");

        }
        else 
        {
            System.out.println(" computer win ...");
        
        }


        

        if (computerInput == 1)
        {
            System.out.println("computer choice ROCK.. ");
        }

        if (computerInput == 2)
        {
            System.out.println(" compuer choice PAPER..");
        }
        if (computerInput == 3)
        {
            System.out.println("computer choice SSOISSER..");
        }








    }
    
}
