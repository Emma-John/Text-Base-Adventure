import java.util.Scanner;

public class Chapter1 {
    

    public void Chapter_1 (){

        
        

    }

    public void Story_1 (Actor player){

        System.out.println("Beneath your city's hustle and bustle lies a secret world, where ants build intricate cities, fungi connect in a hidden web, and underground rivers flow quietly. This hidden realm holds nature's mysteries, a resilient and interconnected world waiting to reveal its timeless stories.");
        
        Scanner next = new Scanner(System.in);
        String nothing = next.nextLine(); // Makes it so you need to press enter to continue

        System.out.println("As you venture deeper into this subterranean wonderland, an eerie chill permeates the air. Suddenly, a faint rustling gives way to an ominous presence—a creature of the underground emerges, its eyes gleaming with malice. With your heart pounding, you brace for an unexpected and perilous encounter in this mysterious world.");

        nothing = next.nextLine();

        Battle battle1 = new Battle();
        Monster monster = new Monster();

        battle1.Fight(player, monster); // A battle is generated
    }

}
