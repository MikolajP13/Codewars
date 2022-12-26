public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean f1Attack = false;
        String winnerName = "";

        if(firstAttacker.equals(fighter1.name)){
            f1Attack = true;
        }

        while (fighter1.health > 0 && fighter2.health > 0) {

            if(f1Attack){
                fighter2.health -= fighter1.damagePerAttack;
                System.out.println(fighter2.health + " F2H");
                if (fighter2.health <= 0){
                    winnerName = fighter1.name;
                    break;
                }
            }

            fighter1.health -= fighter2.damagePerAttack;
            if (fighter1.health <= 0){
                winnerName = fighter2.name;
                break;
            }

            f1Attack = true;
        }

        return winnerName;
    }
}