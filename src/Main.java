import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Imports Variable Declarations
        Scanner userInput;

        // Variable Declarations
        boolean on;
        double playerExperience;
        double skillExperience;
        int playerLevel;
        int skillLevel;
        int statStrength, statIntelligence, statConstitution, statDexterity, statWisdom;
        /*
        Strength: Overall Strength, Physique: (fat or fit)
        Intelligence: Overall Knowledge, More you know the better, Overall Skills: (stupid or smart)
        Constitution: Overall Endurance: (tough  fragile)
        Dexterity: Overall Speed, Reaction Time, Agile, Stamina: (fast or slow)
        Wisdom: Overall Level of Skills: (can do or not do)
         */

        // Initialization
        userInput = new Scanner(System.in);

        on = true;

        // Level
        playerLevel = 100;
        playerExperience = 12310.12;
        skillLevel = 32;
        skillExperience = 1231.12;

        // Stats
        statStrength = 2;
        statDexterity = 3;
        statConstitution = 2;
        statIntelligence = 12;
        statWisdom = 2;

        output(playerLevel, skillLevel, playerExperience, skillExperience);
    }

    static void output(int pLevel, int sLevel, double pExp, double sExp){
        System.out.print("Level: " + pLevel);
        System.out.print("   ");
        System.out.println("Skill Level" + sLevel);
        System.out.print("Exp: " + pExp);
        System.out.print("   ");
        System.out.println("Skill Exp: " + sExp);

    }
}