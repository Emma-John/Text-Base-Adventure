import java.util.Scanner;


public class Actor{

    public String name;
    int health = 0;
    public int constitution = 0;
    public int strength = 0;
    public int intelligence = 0;
    int lvl = 0;
    int xp = 0;
    int caps = 0;


    
    public void charactercreation (){

        int points = 12;

        System.out.println("_____________________________Character_Creation_____________________________\n");

        // User input of player name
        Scanner PlayerName = new Scanner(System.in);
        System.out.print("Enter Character Name: "); 
        name = PlayerName.nextLine();
        
        //Point buy begins - Strength
        System.out.println("\n____________________POINT_BUY_____________________\n");

        System.out.println("Here is where you decide your stats for the adventure. You have 12 points to spend. Select the amount for Stength and Intellegence, then we put the rest into constitution, which is a health modifier.");

        
        System.out.println("\nPoints:" + points);

        Scanner playerStrength = new Scanner(System.in);
        System.out.println("Enter strength stat: ");
        strength = playerStrength.nextInt();

        points -= strength;

        Scanner PlayerIntellegence = new Scanner(System.in);
        System.out.println("Enter intellegence stat: ");
        intelligence = PlayerIntellegence.nextInt();

        points-=intelligence;



        
        constitution = points;

        points-=constitution;

        randGen phealthRandGen = new randGen();
        health = phealthRandGen.RanInt(6,10) + constitution;

        System.out.println("Health: " + health);

        stats();


        characterconfirmation();

      


    }


    public void characterconfirmation(){

        boolean confirmation = false;

        Scanner Confirmation = new Scanner(System.in);
        System.out.print("Are these the stats you wish to have for the adventure? (true/false): ");
        confirmation = Confirmation.nextBoolean();

        if (confirmation == true){

            System.out.println("\nLet the adventure begin!\n");


        }
        else if(confirmation == false){

            System.out.println("\nThen, lets try again\n");
            charactercreation();
        }
        else{

            System.out.println("\nSorry, I didn't understand\n");
            characterconfirmation();
        }


    }


    public void stats (){

        System.out.println("\nStats\n================\nStrength:" + strength + "\nIntellegence:" + intelligence + "\nConstitution:" + constitution + "\n");

    }

}   
    
    

