package day8_practice;

public class Q09_SurviveMonkey {
    public static void main(String[] args) {
        /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        */

        int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("Maymunlar günde 4 muz yer");
            numberOfBananas -= 4;
            survivalDays++;
            if (numberOfBananas < 4) {
                monkeyAlive = false;
                System.out.println("Bugün " + survivalDays + ". gün, muz kalmadı. Maymun sizlere ömür.");
            } else
                System.out.println("Bugün " + survivalDays + ". gün. Maymun hâlâ hayatta.");
        } while (monkeyAlive);
        System.out.println("Toplam yaşadığı gün sayısı : " + (survivalDays - 1));
    }
}