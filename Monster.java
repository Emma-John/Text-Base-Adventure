
public class Monster extends Actor {
    

    public String MonsterNameGenerate(){
        String[] name1 = {
            "Gloomgobbler",
            "Tunnel Terror",
            "Subterranean Snickersnack",
            "Mud Muncher",
            "Cavern Chucklehead",
            "Slimy Snugglepuff",
            "Abyssal Prankster",
            "Rock Rascal",
            "Squirming Sassifrass",
            "Grumble Gigglesnort"};

        String[] name2 = {
            "Above the",
            "Below the",
            "Inside the",
            "Around the",
            "Behind the",
            "Under the",
            "From the",
            "Creeper of the",
            "of the",
            "Scarer of the"

        };

        String[] name3 = {

            "Labyrinthine Lair",
            "Muckhaven Marsh",
            "Stalagmite Citadel",
            "Fungus Forest",
            "Echoing Abyss",
            "Chortle Cavern",
            "Slime Spire",
            "Gigglegrotto Gorge",
            "Guffaw Groteworks",
            "Haphazard Hollows"
        };

        String monstername = (name1[randGen.RanInt(0, 9)] + " " + name2[randGen.RanInt(0, 9)] +" "+ name3[randGen.RanInt(0, 9)]);

        return monstername;


    }
    public void MonsterStatGenerate(int lvl){

        randGen monHealth = new randGen();
        randGen monStrength = new randGen();
        randGen monIntell = new randGen();


        switch(lvl){ //Generates Monster stats based on player level
            case 0:
                health = monHealth.RanInt(2, 5);
                strength = monStrength.RanInt(2, 3);
                intelligence = monIntell.RanInt(2, 2);
                caps = randGen.RanInt(2, 3);
                break;
            case 1:
                health = randGen.RanInt(3, 10);
                strength = randGen.RanInt(2, 5);
                intelligence = randGen.RanInt(3, 5);
                caps = randGen.RanInt(4, 7);
                break;
            case 2:
                health = randGen.RanInt(8, 15);
                strength = randGen.RanInt(4, 8);
                intelligence = randGen.RanInt(6, 9);
                caps = randGen.RanInt(6, 12);
                break;
            case 3:
                health = randGen.RanInt(12, 19);
                strength = randGen.RanInt(1, 3);
                intelligence = randGen.RanInt(1, 2);
                caps = randGen.RanInt(1, 3);
                break;
            case 4:
                health = randGen.RanInt(1, 5);
                strength = randGen.RanInt(1, 3);
                intelligence = randGen.RanInt(1, 2);
                caps = randGen.RanInt(1, 3);
                break;
            default:
                System.out.print("You're really cool");
        
    }
}
}
