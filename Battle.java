import java.util.Scanner;

public class Battle {
    
    
    int monsteri = 0;
    int playeri = 0;

    public void Fight(Actor player, Monster monster){
        
        //Generates monster name and stats
        String monstername = monster.MonsterNameGenerate(); 
        monster.MonsterStatGenerate(player.lvl);

        randGen monster_turn = new randGen();
        randGen player_turn = new randGen();

        //Decides monster and player turn order through "inititive". The higher goes first
        int mon_inititive = monster_turn.RanInt(0,100);
        int player_inititive = player_turn.RanInt(0, 100);
        if (mon_inititive>player_inititive){
            this.monsteri = 1;
        }
        else{
            this.playeri = 1;
        }

        System.out.println("\nEnemey: " + monstername + "\n");

        //Actual battle back and forth here
        while(this.monsteri == 1 || this.playeri == 1){

            if (this.playeri ==1){
                player_turn(player, monster);
                monster_turn(player, monster, monstername);

                System.out.print("\nPress Enter to continue\n");
                Scanner next = new Scanner(System.in);
                String nothing = next.nextLine(); // Makes it so you need to press enter to continue
            }
            else{
                monster_turn(player, monster, monstername);
                player_turn(player, monster);

                System.out.print("\nPress Enter to continue\n");
                Scanner next = new Scanner(System.in);
                String nothing = next.nextLine(); // Makes it so you need to press enter to continue
            }


        } 
        
        if(player.xp >= 3){
            player.levelup();
        }
        System.out.print("\nPress Enter to continue\n");
        Scanner next = new Scanner(System.in);
        String nothing = next.nextLine(); // Makes it so you need to press enter to continue

    }
    

    public void player_turn(Actor player, Monster monster){

        Scanner fight_action = new Scanner(System.in);
        System.out.print("What would you like to do? (1 for Attack and 2 for runaway): "); //Player selects an action
        int action = fight_action.nextInt();

        if (action == 1){
            monster.health = monster.health - player.strength; // Damage is dealt

            System.out.println("\n\nYou dealt: " + player.strength + " damage\n"); 
        }
        else if(action == 2){
            playeri = 0; //Player and monster turn order are both set to 0, effectivly ending the fight
            monsteri = 0;
        }
        else{

            System.out.println("Sorry, I did not understand");
            player_turn(player, monster);
        }


    }

    public void monster_turn(Actor player, Monster monster, String monstername){

         //If the player dealt a ton of damage and the monster is first, he will have the opportunity to runaway
        if(monster.health <= monster.health/5 && monsteri == 1 && monster.health > 0){
            monsteri = 0;
            System.out.println(monstername + " ran away");
        }
        else if(monster.health <= 0){
            monsteri = 0;
            playeri = 0;
            System.out.println("You have defeated " + monstername + "\n");

            player.xp = monster.xp;
        }
        else{

            player.health = player.health - monster.strength;
        
        //Monster damage is dealt to player
        System.out.println(monstername + " hit you for: " + monster.strength + " damage\n\n");
        System.out.println("Health: " + player.health);
        }
        
        

       

    }

}