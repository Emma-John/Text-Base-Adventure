import java.util.Scanner;


public class Actor{

    public String name;
    public int health = 6;
    public int constitution = 0;
    public int strength = 0;
    public int intelligence = 0;
    int lvl = 0;
    int xp = 0;
    int caps = 0;
    int points = 0;


    
    public void charactercreation (){

        points = 12;

        System.out.println("_____________________________Character_Creation_____________________________\n");

        // User input of player name
        Scanner PlayerName = new Scanner(System.in);
        System.out.print("Enter Character Name: "); 
        name = PlayerName.nextLine() + " of the OverWorld";
        
        //Point buy begins - Strength
        System.out.println("\n____________________POINT_BUY_____________________\n");

        System.out.println("Here is where you decide your stats for the adventure. You have 12 points to spend. Type in the amount for Stength and Intellegence, then we put the rest into constitution, which is a health modifier.");

        
        System.out.println("\nPoints:" + points);

        Scanner playerStrength = new Scanner(System.in);
        System.out.print("Enter strength stat: ");
        strength = playerStrength.nextInt();

        points -= strength;

        Scanner PlayerIntellegence = new Scanner(System.in);
        System.out.print("Enter intellegence stat: ");
        intelligence = PlayerIntellegence.nextInt();

        points-=intelligence;

        constitution = points;

        points-=constitution;

        health += constitution;

        System.out.println("\n\n_____________" + name + "____________");
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

        System.out.println("Health: " + health + "\nStats\n================\nStrength:" + strength + "\nIntellegence:" + intelligence + "\nConstitution:" + constitution + "\n");

    }

    public void levelup(){

        points = 2;
        lvl++;

        System.out.println(name + " leveled up! Type in how many points you would like to increase the stat by. If you would not like to modify the stat, type in a '0'\n");

        System.out.println("Points: "+ points + "\n");
        stats();

        Scanner playerStrength = new Scanner(System.in);
        System.out.print("Enter strength modifier: ");
        strength += playerStrength.nextInt();

        points -= strength;

        Scanner PlayerIntellegence = new Scanner(System.in);
        System.out.print("Enter intellegence modifier: ");
        intelligence += PlayerIntellegence.nextInt();

        points-=intelligence;

        Scanner PlayerCon = new Scanner(System.in);
        System.out.print("Enter constitution modifier: ");
        constitution += PlayerCon.nextInt();

        System.out.println("\n\n");

        points -=constitution;

        health += constitution;

        stats();

        System.out.print("\nPress Enter to continue\n");
        Scanner next = new Scanner(System.in);
        String nothing = next.nextLine(); // Makes it so you need to press enter to continue

    }


}   
    
    

